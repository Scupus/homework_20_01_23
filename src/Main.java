public class Main {
    public static void main(String[] args) {
        Buses bus1 = new Buses("Икарус", "СТ18", 3.8f);
        Buses bus2 = new Buses("Дэу", "РС160", 4.2f);
        Buses bus3 = new Buses("МАЗ", "МА17", 4.6f);
        Buses bus4 = new Buses("ЛАЗ", "ЛА38", 4.0f);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);
        Cars car1 = new Cars("Лада", "Приора", 1.8f);
        Cars car2 = new Cars("БМВ", "Z.3", 2.4f);
        Cars car3 = new Cars("Мерседес", "SLK/8", 3.2f);
        Cars car4 = new Cars("Додж", "VIPER", 3.4f);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        Trucks truck1 = new Trucks("Мерседес", "Актос.6", 5.8f);
        Trucks truck2 = new Trucks("Ивеко", "С-Вэй", 6.4f);
        Trucks truck3 = new Trucks("Вольво", "W32", 7.2f);
        Trucks truck4 = new Trucks("Даф", "XF105", 7.0f);
        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);
        bus2.printStartMoving();
        car1.printStopMoving();
        System.out.println(truck3);
        System.out.println(truck1);
        truck1.printBestSpeed();
        car3.printPitStop();
        bus2.printBestTime();
        DriverA driver1 = new DriverA("Иванов И.И.", "Да", 6, "A");
        DriverA driver2 = new DriverA("Петров П.П.", "Да", 3, "A");
        System.out.println(driver1);
        System.out.println(driver2);
        DriverB driver3 = new DriverB("Сидоров С.С.", "Да", 1,"B");
        DriverB driver4 = new DriverB("Семенов С.С.", "Да", 3,"B");
        System.out.println(driver3);
        System.out.println(driver4);
        DriverC driver5 = new DriverC("Чайковский П.И.", "Да", 5,"C");
        DriverC driver6 = new DriverC("Растропович М.Л.", "Да", 2,"C");
        System.out.println(driver5);
        System.out.println(driver6);
    }
}

