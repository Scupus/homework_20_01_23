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


    }
}

