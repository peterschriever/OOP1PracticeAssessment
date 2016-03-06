public class TownHall {
    private CivilServant[] civilServants;
    private int index;

    public TownHall(int numberOfCivilServants) {
        civilServants = new CivilServant[numberOfCivilServants];
        index = 0;
    }

    public void addCivilServant(CivilServant civilServant) {
        civilServants[index] = civilServant;
        index+=1;
    }

    public void addService(Service service, int[] civilServantIndices) {
        for(int index : civilServantIndices) {
            if(civilServants[index] != null
                    && !civilServants[index].canPerform(service.getName())) {
                civilServants[index].addService(service);
            }
        }
    }

    public double averageDurationForService(String serviceName) {
        int countServants = 0;
        int totalDuration = 0;

        for(CivilServant servant : civilServants) {
            if(servant.canPerform(serviceName)) {
                countServants+=1;
                totalDuration+=servant.performService(serviceName);
            }
        }

        return countServants > 0 ? totalDuration / countServants : Double.MAX_VALUE;
    }
}
