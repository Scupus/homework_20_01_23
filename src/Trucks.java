public class Trucks extends Transport {
    public Trucks(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void printStartMoving() {
        super.printStartMoving();
    }

    @Override
    public void printStopMoving() {
        super.printStopMoving();
    }


    @Override
    public String toString() {
        return "Грузовик марки: " + getBrand() + " , модель: " + getModel() + ", объем двигателя: " + engineVolume + ".";
    }
}
