public class Main {
    public static void main(String[] args) {
        
        Rational num1 = new Rational(3, 4);
        Rational num2 = new Rational(3, 4);

        // Clone :
        Rational num3 = (Rational) num1.clone();


        // Display values
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println(num1.Addition(num3));

        // Arithmetic operations
        System.out.println("\nOperations with num1 and num2:");
        System.out.println("Addition      : " + num1.Addition(num2));
        System.out.println("Subtraction   : " + num1.Subtraction(num2));
        System.out.println("LCM           : " + num1.LCM(num2));
        System.out.println(num1.GCD(num2));
    }
}
