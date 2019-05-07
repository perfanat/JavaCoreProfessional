package lesson1.t5;

public class WildcardDemoApp {
    public static void main(String args[]) {
        Stats<Integer> iStats = new Stats<>(new Integer[]{1, 2, 3, 4, 5});
        System.out.println("Среднее iStats = " + iStats.avg());


        Stats<Double> dStats = new Stats<>(new Double[]{1.1, 2.2, 3.3, 4.4, 5.5});
        System.out.println("Среднее dStats = " + dStats.avg());


        Stats<Float> fStats = new Stats<>(new Float[]{1.0f, 2.0f, 3.0f, 4.0f, 5.0f});
        System.out.println("Среднее fStats = " + fStats.avg());

        System.out.print("Средние iStats и dStats ");
        if (iStats.sameAvg(dStats)) {
            System.out.println(" равны");
        } else {
            System.out.println("отличаются");
        }

        System.out.print("Средние iStats и fStats ");
        if (iStats.sameAvg(fStats)) {
            System.out.println("равны");
        } else {
            System.out.println("отличаются");
        }
    }
}