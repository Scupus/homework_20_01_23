public abstract class Drivers {
    public final String name;
    public final String haveLicense;
    public int driverExperience;

    public Drivers(String name, String haveLicense, int driverExperience) {
        this.name = name;
        this.haveLicense = haveLicense;
        this.driverExperience = driverExperience;
    }


    public String getName() {
        return name;
    }


    public String getTypeOfDriverLicense() {
        return haveLicense;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(int driverExperience) {
        this.driverExperience = driverExperience;
    }
}
