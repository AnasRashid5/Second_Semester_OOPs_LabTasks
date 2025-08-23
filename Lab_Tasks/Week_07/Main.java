import vector.Vector;

public class Main {

    public static void main(String[] args) {
        
        // Create two 3D vectors
        Vector a = new Vector(2, 4, 6);
        Vector b = new Vector(7, 5, 1);

        // Clone vector b
        Vector copy = b.clone();
        copy.setComponent(0, 1); // modify the copy

        // Printing of original vectors::
        System.out.println("Original a: " + a);
        System.out.println("Original b: " + b);
        System.out.println("Modified copy of b: " + copy);
        System.out.println();

        // Addition of Vectors:
        System.out.println("a + b = " + a.add(b));

        // Dot product of vectors::
        System.out.println("a · b = " + a.dotProduct(b));

        // Cross product of vectors::
        System.out.println("a X b = " + a.crossProduct(b));
        System.out.println();

        // Equality checking of vectors::
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("b.equals(copy): " + b.equals(copy));

        // Iteration using for-each
        System.out.print("Components of a: ");
        for (double v : a) {
            System.out.print(v + " ");
        }
    }
}
