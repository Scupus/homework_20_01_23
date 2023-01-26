import com.sun.source.tree.IfTree;

import java.sql.Driver;

public class Cars extends Transport {


    public Cars(String brand, String model, float engineVolume, String name, String license) {
        super(brand, model, engineVolume, name, license);
    }

    public void printCarPlusPilot() {

        if (L.equals("А")) {
            System.out.println("Машиной марки: " + brand + " " + model);
            System.out.println("Управляет пилот: " + getN());
        } else {
            System.out.println("У этого пилота неподходящая лицензия для управления этой категории ТС!");
        }

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
    public void printPitStop() {
        super.printPitStop();
    }

    @Override
    public void printBestSpeed() {
        super.printBestSpeed();
    }

    @Override
    public void printBestTime() {
        super.printBestTime();
    }

    @Override
    public String toString() {
        return "Легковой автомобиль марки: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " + engineVolume + ".";
    }
}
