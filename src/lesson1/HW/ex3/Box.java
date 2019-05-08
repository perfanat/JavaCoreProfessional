package lesson1.HW.ex3;

import java.util.ArrayList;

public class Box <T extends Fruits>  {
    private ArrayList<T> box;

    public Box(ArrayList<T> box) {
        this.box = box;
    }

    public void add (T t){
        box.add(t);
    }

    public double getWeight (){
        double sum = 0;
        for (T t:box) {
            sum+=t.weight;
        }
        return sum;
    }

    public boolean compare(Box<? extends Fruits> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    public void changeBox (Box<?> box){
        Box <?> reserv = box;
        box=this;
        this.box.clear();
    }
}
