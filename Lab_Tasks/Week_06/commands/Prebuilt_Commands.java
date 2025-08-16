package commands;

import drawing_tools.Canvas;
import geometry.Point;
import turtle.Turtle;

public class Prebuilt_Commands{

    Turtle t = new Turtle(new Point(250,250));
    
    // Canvas canvas = new Canvas();

    public void getCanvas(Canvas cvs) {
        t.assignCanvas(cvs);
    }

    // For Square:
    public void Square() {
        t.move(40);
        t.turnRight();
        t.move(40);
        t.turnRight();
        t.move(40);
        t.turnRight();
        t.move(40);
    }

    // Forigzag
    public void zigZag() {
        t.move(50);
        t.turnRight();
        t.move(50);
        t.turnLeft();
        t.move(50);
        t.turnRight();
        t.move(50);
        t.turnLeft();
        t.move(50);
    }
}
