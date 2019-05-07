package lesson1.t4;

public class StatsDemoApp {
    public static void main(String args[]) {
        Stats<Integer> intStats = new Stats<>(1, 2, 3, 4, 5);
        System.out.println("Ср. знач. intStats равно " + intStats.avg());
        Stats<Double> doubleStats = new Stats<>(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println("Ср. знач. doubleStats равно " + doubleStats.avg());
        // Это не скомпилируется, потому что String не является подклассом Number
        // Stats<String> strStats = new Stats<>("1", "2", "3", "4", "5");
        // System.out.println("Ср. знач. strStats равно " + strStats.avg());

        if (intStats.sameAvg(doubleStats)) {
            System.out.println("Средние значения равны");
        } else {
            System.out.println("Средние значения не равны");
        }
    }
}
