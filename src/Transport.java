import java.util.Objects;

public abstract class Transport implements Challengers{
    final String brand;
    final String model;
    final float engineVolume;

    public Transport(String brand, String model, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public float getEngineVolume() {
        return engineVolume;
    }


    public void printStopMoving() {
        System.out.println("Прекратить движение!!!");
    }

    public void printStartMoving() {
        System.out.println("Начать движение!!!");
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
