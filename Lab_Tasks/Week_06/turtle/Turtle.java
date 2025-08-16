package turtle;

import drawing_tools.Pen;
import geometry.Point;

public class Turtle extends Pen {

    private Point positionOfTurtle;
    private Point nextPositionOfTurtle;
    int count = 1;

    public Turtle(Point setPosition) {
        this.positionOfTurtle = setPosition;
        this.nextPositionOfTurtle = new Point(setPosition);
        movePenToPoint(positionOfTurtle);

    }

    public void move(int distance) {
        // nextPositionOfTurtle.set(positionOfTurtle.getX(), positionOfTurtle.getY()-distance);

        if (count == 1) {
            nextPositionOfTurtle = new Point(positionOfTurtle.getX() + distance, positionOfTurtle.getY());
        } else if (count == 2) {
            nextPositionOfTurtle = new Point(positionOfTurtle.getX(), positionOfTurtle.getY() + distance);
        } else if (count == 3) {
            nextPositionOfTurtle = new Point(positionOfTurtle.getX() - distance, positionOfTurtle.getY());
        } else if (count == 4) {
            nextPositionOfTurtle = new Point(positionOfTurtle.getX(), positionOfTurtle.getY() - distance);
        } else {
            // Handle default case if needed
        }

        drawLineTo(nextPositionOfTurtle);
        positionOfTurtle = nextPositionOfTurtle;
    }
    
    public void turnRight() {
        count++;
        if (count > 4) {
            count = 1;
        }
    }

    public void turnLeft() {
        count--;
        if (count<1) {
            count=4;
        }
      
    }

}
