import java.sql.Driver;

public class Main {
    public static void main(String[] args) {
        Buses bus1 = new Buses("Икарус", "СТ18", 3.8f,"Семенов С.С.", "C");
        Buses bus2 = new Buses("Дэу", "РС160", 4.2f,"Буденый С.С.", "A");
        Buses bus3 = new Buses("МАЗ", "МА17", 4.6f,"Федоров Ф.Ф.", "C");

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);


        Cars car1 = new Cars("Лада", "Приора", 1.8f, "Иванов И.И.", "А");
        Cars car2 = new Cars("БМВ", "Z.3", 2.4f, "Петров П.П.", "A");
        Cars car3 = new Cars("Мерседес", "SLK/8", 3.2f, "Сидоров С.С.", "А");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);


        Trucks truck1 = new Trucks("Мерседес", "Актос.6", 5.8f, "Чайковский П.И.", "C");
        Trucks truck2 = new Trucks("Ивеко", "С-Вэй", 6.4f, "Чайковский П.И.", "C");
        Trucks truck3 = new Trucks("Вольво", "W32", 7.2f, "Жуков Г.К.","B" );

        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);

        bus2.printStartMoving();
        car1.printStopMoving();
        car2.printPitStop();
        truck3.printBestTime();
        System.out.println(truck3);
        truck1.printBestSpeed();
        System.out.println(truck1);

        DriverA driver1 = new DriverA("Иванов И.И.", 6, "A");
        DriverA driver2 = new DriverA("Петров П.П.", 3, "А");
        DriverB driver3 = new DriverB("Сидоров С.С.", 4, "B");
        DriverB driver4 = new DriverB("Семенов С.С.", 2, "B");
        DriverC driver5 = new DriverC("Чайковский П.И.", 5, "C");
        DriverC driver6 = new DriverC("Растропович М.Л.", 3, "C");
        DriverB driver7 = new DriverB("Жуков Г.К.", 2, "B");
        DriverA driver8 = new DriverA("Буденый С.С.", 6, "A");
        DriverC driver9 = new DriverC("Федоров Ф.Ф.", 5, "C");

        driver8.driverStartMoving();
        driver2.driverFillGasTank();

        truck3.printTruckPlusPilot();
        bus2.printBusPlusPilot();
        car3.printCarPlusPilot();
    }
}

