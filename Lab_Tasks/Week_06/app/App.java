package app;

import commands.*;
import drawing_tools.Canvas;
import javax.swing.JFrame;

public class App {

    public static void run() {

        // Point P = new Point(20, 40);
        // Point q = new Point(100, 100);
        Canvas canvas = new Canvas();
        // Pen piano=new Pen(canvas);
        
        // piano.movePenToPoint(new Point(100,100));
        // piano.drawLineTo(new Point(300,100));
        // piano.drawLineTo(new Point(200,270));
        // piano.drawLineTo(new Point(100,100));
        
        JFrame frame = new JFrame("Anas Canvas");
        frame.setSize(500, 500);
        frame.add(canvas);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        // Turtle t=new Turtle(new Point(100,100));
        // t.assignCanvas(canvas);
        // t.move(22);
        // t.turnRight();
        // t.move(22);
        // t.turnRight();
        // t.move(22);
        // t.turnRight();
        // t.move(22);
        // t.move(22);
        // t.turnRight();
        // t.move(22);
        // t.turnLeft();
        // t.move(22);
        // t.turnLeft();
        // t.move(22);
        // t.turnRight();
        // t.move(22);
        // t.turnRight();
        // t.move(22);

        // Prebuilt_Commands cmd=new Prebuilt_Commands();
        // cmd.getCanvas(canvas);
        // cmd.Square();
        // cmd.zigZag();

        // User_Commands ayubKhan=new User_Commands();
        // ayubKhan.giveCanvas(canvas);
        // ayubKhan.Commands();
        
        Commands_Input input=new Commands_Input();
        input.assignCanvas(canvas);
        input.Input();
    }
}
