public interface Challengers {


    default void printPitStop() {
        System.out.println("Пит-стоп, замена резины.");
    }

    default void printBestTime() {
        System.out.println("Лучшее время круга:");
    }

    default void printBestSpeed() {
        System.out.println("Лучшая скорость:");
    }
}
