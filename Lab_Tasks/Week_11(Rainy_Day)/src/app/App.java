package src.app;

import java.util.ArrayList;

import src.models.Int2;
import src.models.Int3;

public class App {

    public void run(){
        
        Int2 x=new Int2(10);
        Int2 x2=(Int2)x.clone();
        x2.increment();
        System.out.println("x= "+x+", x2= "+x2.toString());

        //Anything Inherited Is Also Cloneable: We have extended int3 by int2.
        Int3 x3=new Int3(7);
        x3=(Int3)x3.clone();

        ArrayList v=new ArrayList<>();

        //By default, a new ArrayList in Java is created with a capacity of 10.
        for (int i = 0; i < 10; i++)
        {
        v.add(new Int2(i));
        System.out.println("v: "+v);
        }

        ArrayList v2=(ArrayList)v.clone();
        //Now Clone Each Element:
        
        for (int i = 0; i <v.size(); i++)
        {
        v2.set(i, ((Int2)v2.get(i)).clone());
        }

        // for (Iterator e=v2.iterator();e.hasNext();)
        // {

        // ((Int2)e.next()).increment();

        // }
        for (int i = 0; i <v2.size(); i++) {
            ((Int2)v2.get(i)).increment();          
        }

        //See if it has changed v's elements :
        System.out.println();
        System.out.println("v: "+v);
        System.out.println("v2: "+v2);
     
    }
    
}
