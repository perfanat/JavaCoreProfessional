package lesson1.HW.ex1;

public class ArrApp {
    public static void main(String[] args) {
        Arr<Integer> iStats = new Arr<>(new Integer[]{1, 2, 3, 4, 5});
        iStats.printArr();
        iStats.changElements();
        iStats.printArr();
    }
}
