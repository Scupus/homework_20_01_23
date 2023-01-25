public class DriverC extends Drivers {
    private final String typeOfLicense;

    public String getTypeOfLicense() {
        return typeOfLicense;
    }

    public DriverC(String name, String haveLicense, int driverExperience, String typeOfLicense) {
        super(name, haveLicense, driverExperience);
        this.typeOfLicense = typeOfLicense;
    }

    public void printDriverStartMoving() {
        System.out.println("Начать гонку!");
    }

    public void printDriverStopMoving() {
        System.out.println("Остановиться!");
    }

    public void printDriverFillGasTank() {
        System.out.println("Заправить авто.");
    }

    @Override
    public String toString() {
        return "Водитель: " + name + ", наличие прав - " + haveLicense +
                ", категория прав: " + typeOfLicense + ", водительский стаж: " + driverExperience + " лет.";
    }
}