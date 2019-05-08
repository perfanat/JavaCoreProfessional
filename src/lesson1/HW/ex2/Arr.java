package lesson1.HW.ex2;

import java.util.ArrayList;

public class Arr <T> {
    private T [] obj1;

    public Arr (T... obj1){
        this.obj1=obj1;
    }

    public ArrayList <T> arrToArrList (){
        ArrayList<T>arrayList=new ArrayList<>();
        for (T o:obj1)
        {arrayList.add(o);}
        return arrayList;
    }
}
