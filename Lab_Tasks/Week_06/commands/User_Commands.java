package commands;

import java.util.Scanner;

public class User_Commands extends Prebuilt_Commands{

    Scanner sc=new Scanner(System.in);

    private int distance;
    
    // Canvas canvas=new Canvas();

    
    public void Commands(){
        
        System.out.println("Enter Custom Commands for eg: F+F+F+F to draw a square or any command you like it:");
        String command = sc.nextLine();
        System.out.println("Enter Distance For Moving Turtle Forward:");
        distance=sc.nextInt();
        String[] arr=new String[command.length()];
        
        // To be continued tomorrow.Logic to build is to take input command and make turtle move acc to it.
        arr=command.split("");

        for (String i : arr) {
            if (i.equals("+")) {
                t.turnRight();
            } else if (i.equals( "F")) {
                t.move(distance);
            } else {
                t.turnLeft();
            }
        }
}
 
}
