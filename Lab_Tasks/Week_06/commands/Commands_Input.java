package commands;

import drawing_tools.Canvas;
import java.util.Scanner;
public class Commands_Input extends User_Commands{
    
    Scanner sc=new Scanner(System.in);
    
    
    public void Input(){
        int n;  //TO ask user 1 or 2 if 1 so prebuilt and 2 for custom commands.
        String input;

        System.out.println("Enter 1 for Prebuilt Movements or 2 for Custom Movements ");
        n=sc.nextInt();

        if (n==1) {
            System.out.println("Enter S for square and Z for zigzag:");
            input=sc.next();
            if ((input.equals("S")) || (input.equals("s"))) {
                Square();                                
            }
            else if((input.equals("Z")) || (input.equals("z"))){
                zigZag();
            }
            else{
                System.out.println("No Command Exists For The Keyword You Typed");
            }
        }
        if (n==2) {
            Commands();            
        }
    }
    
    public void assignCanvas(Canvas canvas) {
        getCanvas(canvas);
    }


}