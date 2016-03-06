import java.util.*;

public class CivilServant {
    private boolean fast;
    private ArrayList<Service> canPerform;
    public final int MAX_NUMBER_OF_SERVICES = 3;

    public CivilServant(boolean fast) {
        this.fast = fast;
        canPerform = new ArrayList<>();
    }

    public void addService(Service service) {
        // make sure not to go over the max services
        // and check if the service provided is not null
        if(canPerform.size() == MAX_NUMBER_OF_SERVICES || service == null) {
            return;
        }
        // and if we get here we can go ahead and add the service
        canPerform.add(service);
    }

    private Service findService(String serviceName) {
        // Use a loop to test every service.getName against the
        // serviceName parameter. The first match is simply returned
        // ending the method.
        for (Service service : canPerform) {
            if(service.getName().equals(serviceName)) {
                return service;
            }
        }
        // return null if we could not find a match
        return null;
    }

    public boolean canPerform(String serviceName) {
        return findService(serviceName) != null;
    }

    public int performService(String serviceName) {
        // find out if we can perform the service
        // also storing the potentially found service
        Service found = findService(serviceName);
        if(found == null) {
            // we can not perform the service
            // so we return Integer.MAX_VALUE.
            return Integer.MAX_VALUE;
        }

        // we can perform the service
        // but are we a fast CivilServant?
        if(fast) {
            return (int) Math.round(found.getDuration()*0.75);
        }

        return found.getDuration()+10;
    }
}
