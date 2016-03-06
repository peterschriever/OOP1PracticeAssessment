import java.util.HashMap;
import java.util.Iterator;

public class Ranking {
    private HashMap<String, TownHall> ranking;

    public Ranking() {
        ranking = new HashMap<>();
    }

    public void addTownHall(String name, TownHall townHall) {
        ranking.put(name, townHall);
    }

    public void printAverageDurationForService(String serviceName) {
        Iterator<String> it = ranking.keySet().iterator();
        System.out.println("The ranking for service: " + serviceName);
        while(it.hasNext()) {
            System.out.println(
                    ranking.get(it.next())
                            .averageDurationForService(serviceName)
            );
        }
    }

}
