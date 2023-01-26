import java.sql.Driver;
import java.util.Objects;

public abstract class Transport<L, N extends Driver> implements Race {
    String brand;
    String model;
    float engineVolume;
    final String N;
    final String L;


    public Transport(String brand, String model, float engineVolume, String name, String license) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        N = name;
        L = license;
    }

    public String getN() {
        return N;
    }

    public String getL() {
        return L;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void printStopMoving() {
        System.out.println("Прекратить движение!!!");
    }

    public void printStartMoving() {
        System.out.println("Начать движение!!!");
    }

    @Override
    public void printPitStop() {
        Race.super.printPitStop();
    }

    @Override
    public void printBestTime() {
        Race.super.printBestTime();
    }

    @Override
    public void printBestSpeed() {
        Race.super.printBestSpeed();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }
}
