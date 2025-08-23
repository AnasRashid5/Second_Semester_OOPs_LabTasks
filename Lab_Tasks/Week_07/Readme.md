The Vector class is a custom implementation of mathematical vectors in Java.
It supports vector creation, component access, basic vector operations, and implements Iterable<Double> so vectors can be used in enhanced for-loops.

**Features:**

Constructors:

1)Vector() → Creates an empty vector.
2)Vector(double x, double y) → Creates a 2D vector.
3)Vector(double x, double y, double z) → Creates a 3D vector.

**Component Methods:**

1)getComponent(i) → Returns the component at index i.
2)setComponent(i, val) → Updates or adds the component at index i. If the index doesn’t exist, it fills missing spots with 0.0.
3)length() → Returns the number of components (dimension) of the vector.

**Vector Operations:**

1)add(Vector other)
Adds two vectors of the same dimension and returns a new Vector.
Throws an exception if dimensions don’t match.

2)dotProduct(Vector other)
Calculates the dot product of two vectors of the same dimension.
Returns the result as a formatted string.

3)crossProduct(Vector other)
Calculates the cross product of two 3D vectors.
Throws an exception if vectors are not 3D.

4)equals(Vector other)
Checks if two vectors are equal by comparing dimensions and each component.

**Utility Methods:**

1)toString() → Returns a string representation of the vector, e.g., Vector: (1.0, 2.0, 3.0).
2)clone() → Creates a deep copy of the vector.
3)iterator() → Allows iteration over vector components using for-each.

Example Usage
Vector v1 = new Vector(1, 2, 3);
Vector v2 = new Vector(4, 5, 6);

System.out.println(v1.add(v2));           // Vector: (5.0, 7.0, 9.0)
System.out.println(v1.dotProduct(v2));    // Dot Product is: 32.0
System.out.println(v1.crossProduct(v2));  // Cross Product is: (-3.0, 6.0, -3.0)
System.out.println(v1.equals(v2));        // false
