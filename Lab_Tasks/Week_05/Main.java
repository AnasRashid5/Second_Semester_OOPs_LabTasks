
public class Main {
    public static void main(String[] args) {
        try {

            // Default Constructor
            Triangle defaultTriangle = new Triangle();

            System.out.println("The Default Triangle is With" + defaultTriangle);
            System.out.println("The Perimeter Of Default Triangle Is " + defaultTriangle.getPerimeter());
            System.out.println("Is Right Angled ?" + defaultTriangle.isRightAngled());
            System.out.println();
            // One sided Constructor::

            Triangle t2 = new Triangle(5.0);
            System.out.println("The Equilateral Triangle is With" + t2);
            System.out.println("The Perimeter Of Equilateral Triangle Is " + t2.getPerimeter());
            System.out.println("Is Right Angled ?" + t2.isRightAngled());
            System.out.println();

            // Two Sides Constructor::

            Triangle t3 = new Triangle(4.0, 3.0);
            System.out.println("The Isoceles Triangle is With" + t3);
            System.out.println("The Perimeter Of Isoceles Triangle Is " + t3.getPerimeter());
            System.out.println("Is Right Angled ?" + t3.isRightAngled());
            System.out.println();

            // Three Sides COnstructor::
            Triangle t4 = new Triangle(10.0, 80.0, 90.0);
            System.out.println("The Triangle is With" + t4);
            System.out.println("The Perimeter Of Triangle  Is " + t4.getPerimeter());
            System.out.println("Is Right Angled ?" + t4.isRightAngled());
            System.out.println();

            // Copy Constructor::
            // Triangle t5=new Triangle(t4);
            // System.out.println("The Triangle Of Copy Contructor is With"+t5);
            // System.out.println("The Perimeter Of Triangle Of Copy Contructor Is
            // "+t5.getPerimeter());
            // System.out.println("Is Right Angled "+t5.isRightAngled());
            // System.out.println();

            // Clone Method:
            Triangle t5 = (Triangle) t4.clone();
            System.out.println("The Triangle Of Clone Method is With" + t5);
            System.out.println("The Perimeter Of Triangle Of Clone Method  Is " + t5.getPerimeter());
            System.out.println("Is Right Angled " + t5.isRightAngled());
            System.out.println();

            // t5.toString();
            // System.out.println(t5.getSideA());
            // t5.setSideA(2);
            // System.out.println(t5.getSideA());

            System.out.println("The Number Of objects Made till now is " + Triangle.ObjectCount());

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
