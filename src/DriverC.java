public class DriverC extends Driver {
    public DriverC(String name, int driverExperience, Object typeOfDrivingLicense) {
        super(name, driverExperience, typeOfDrivingLicense);
    }

    @Override
    public String toString() {
        return "Водитель: " + getName() + ", категория прав: " + getTypeOfDrivingLicense() + ", водительский стаж: " + getDriverExperience() + " лет.";
    }
}