public class DriverA extends Driver {
    public DriverA(String name, int driverExperience, Object typeOfDrivingLicense) {
        super(name, driverExperience, typeOfDrivingLicense);
    }

    @Override
    public String toString() {
        return "Водитель: " + getName() + ", категория прав: " + getTypeOfDrivingLicense() + ", водительский стаж: " + getDriverExperience() + " лет.";
    }
}
