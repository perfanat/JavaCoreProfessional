package lesson1.HW.ex1;

public class Arr <T> {
    private T [] obj1;

    public Arr (T... obj1){
        this.obj1=obj1;
    }

    public void printArr (){
        for (T o:obj1)
            {System.out.print(o+" ");}
    }

    public void changElements (){
        T x=obj1 [0];
        obj1[0]=obj1[1];
        obj1[1]=x;
    }
}
