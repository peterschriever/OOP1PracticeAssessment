/**
 * This class provides information concerning the Services
 * performed inside a TownHall, by CivilServants.
 * <p/>
 * This class is part of the OOP1 practice/test files/package.
 *
 * @author Peter Schriever
 * @author Unknown Teacher
 * @version 1.0
 * @since 1.0
 */
public class Service {
    private String name;
    private int duration;

    /**
     * Sole constructor of the Service class
     *
     * @param name     Name/Title of the Service
     * @param duration Duration it takes to perform the service
     */
    public Service(String name, int duration) {
        setName(name);
        setDuration(duration);
    }

    /**
     * The name field getter. Retrieves the Service name.
     *
     * @return String Returns the name/title of the Service
     */
    public String getName() {
        return name;
    }

    /**
     * The duration field getter. Retrieves the Service duration.
     *
     * @return int Returns duration it takes to perform the service
     */
    public int getDuration() {
        return duration;
    }

    /**
     * The name field setter. This method sets the name/title of the Service object.
     *
     * @param name Must be a string which logically represents the Service object.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The duration field setter. This method sets the duration of the Service object.
     *
     * @param duration Must be an int. Represents the amount of minutes it takes to
     *                 perform the Service.
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
