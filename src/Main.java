/**
 * Created by peterzen on 3/6/16.
 * Part of the PACKAGE_NAME package.
 */
public class Main {

    public static void main(String[] args) {
        Service service1 = new Service("foo", 60);
        Service service2 = new Service("bar", 45);
        Service service3 = new Service("foobar", 33);
        Service service4 = new Service("asdasd", 22);

        CivilServant servant1 = new CivilServant(true);
        CivilServant servant2 = new CivilServant(false);
        CivilServant servant3 = new CivilServant(false);

        servant1.addService(service1);
        servant1.addService(service2);
        servant1.addService(service4);

        servant2.addService(service1);
        servant2.addService(service4);

        servant3.addService(service2);
        servant3.addService(service3);

        System.out.println(servant1.canPerform("foo"));
        System.out.println(servant1.performService("foo"));
        System.out.println(servant1.canPerform("foobar"));
        System.out.println(servant1.performService("foo"));

        TownHall groningen = new TownHall(3);
        groningen.addCivilServant(servant1);
        groningen.addCivilServant(servant2);
        groningen.addCivilServant(servant3);
        System.out.println("foobar in groningen: " + groningen.averageDurationForService("foobar"));

        Ranking testRanking = new Ranking();
        testRanking.addTownHall("groningen", groningen);
        testRanking.printAverageDurationForService("foo");
    }

}
