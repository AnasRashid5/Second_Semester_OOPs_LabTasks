package drawing_tools;

import geometry.Point;

public class Pen {
    
    private Point currentPosition;
    private Canvas canvas;
    
    public Pen(){
        this.currentPosition=new Point(0, 0);
    }
    // public Pen(Canvas cvs) {
    //     this.canvas=cvs;
    //     this.currentPosition=new Point(0,0);
    // }
    public void assignCanvas(Canvas cvs){
        this.canvas=cvs;
        // this.currentPosition=new Point(0,0);
    }

    public void movePenToPoint(Point strPoint){
        this.currentPosition=new Point(strPoint);
    }

    public void drawLineTo(Point endPoint){
        System.out.println("Drawing Line From "+currentPosition+"to"+endPoint);
        canvas.addLine(currentPosition, endPoint);
        this.currentPosition=new Point(endPoint.getX(),endPoint.getY());        

    }


    public Point getCurrentPosition(){
        return this.currentPosition;
    }
    
}


