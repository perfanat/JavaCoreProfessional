package lesson1.HW.ex2;

public class ArrApp {
    public static void main(String[] args) {
        Arr<Integer> iStats = new Arr<>(new Integer[]{1, 2, 3, 4, 5});

        System.out.println("Тип iStats.arrToArrList() - "+iStats.arrToArrList().getClass().getName());
    }
}
