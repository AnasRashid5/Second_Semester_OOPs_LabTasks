package app;

import Models.Complex;

public class App {

    public void run(){

        Complex num1=new Complex(3,4);
        Complex num2=(Complex)num1.clone();
        num2.setReal(5);

        System.out.println(num2);
        System.out.println(num1);
        Complex num3=num1.add(num2);
        System.out.println(num3);
    }
    
}
