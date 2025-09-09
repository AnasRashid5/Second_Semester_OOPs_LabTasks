public class Rational implements Cloneable {

    private int numerator1, denominator1;

    public Rational() {
        this.numerator1 = 0;
        this.denominator1 = 1;
    }

    public Rational(int num, int den) {
        this.numerator1 = num;
        this.denominator1 = den;
    }

   //This gcd function is written to return numbers in simplified form .
    private int gcdLoop(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // Addition
    public String Addition(Rational other) {
        if (this.denominator1 == 0 || other.denominator1 == 0) {
            return "Denominator cannot be zero!";
        }

        int num = (this.numerator1 * other.denominator1) + (other.numerator1 * this.denominator1);
        int den = this.denominator1 * other.denominator1;

        int gcd = gcdLoop(num, den);
        num /= gcd;
        den /= gcd;

        if (num == 0) {
            return "Addition is 0";
        } else if (den == 1) {
            return "Addition is " + num;
        } else {
            return "Addition is " + num + "/" + den;
        }
    }

    // Subtraction
    public String Subtraction(Rational other) {
        if (this.denominator1 == 0 || other.denominator1 == 0) {
            return "Denominator cannot be zero!";
        }

        int num = (this.numerator1 * other.denominator1) - (other.numerator1 * this.denominator1);
        int den = this.denominator1 * other.denominator1;

        int gcd = gcdLoop(num, den);
        num /= gcd;
        den /= gcd;

        if (num == 0) {
            return "Subtraction is 0";
        } else if (den == 1) {
            return "Subtraction is " + num;
        } else {
            return "Subtraction is " + num + "/" + den;
        }
    }

    // LCM of two rationals
    public String LCM(Rational other) {
         //Formula for lcm of rational is lcm of numerator upon gcd of denominator. 
        // gcd of denominators
        int gcdDen = gcdLoop(this.denominator1, other.denominator1);

        // lcm of numerators
        int lcmNum = 1;
        for (int i = Math.max(this.numerator1, other.numerator1); i <= this.numerator1 * other.numerator1; i++) {
            if (i % this.numerator1 == 0 && i % other.numerator1 == 0) {
                lcmNum = i;
                break;
            }
        }

        int gcd = gcdLoop(lcmNum, gcdDen);
        int num = lcmNum / gcd;
        int den = gcdDen / gcd;

        if (num == 0) {
            return "LCM is 0";
        } else if (den == 1) {
            return "LCM is " + num;
        } else {
            return "LCM is " + num + "/" + den;
        }
    }

    // GCD of two rationals
    public String GCD(Rational other) {
        
        //Formula for gcd of rational is gcd of numerator upon lcm of denominator. 
        // gcd of numerators
        int gcdNum = gcdLoop(this.numerator1, other.numerator1);

        // lcm of denominators
        int lcmDen = 1;
        for (int i = Math.max(this.denominator1, other.denominator1); i <= this.denominator1 * other.denominator1; i++) {
            if (i % this.denominator1 == 0 && i % other.denominator1 == 0) {
                lcmDen = i;
                break;
            }
        }

        int gcd = gcdLoop(gcdNum, lcmDen);
        int num = gcdNum / gcd;
        int den = lcmDen / gcd;

        if (num == 0) {
            return "GCD is 0";
        } else if (den == 1) {
            return "GCD is " + num;
        } else {
            return "GCD is " + num + "/" + den;
        }
    }

    // Getters and setters
    public int getNumerator1() {
        return numerator1;
    }

    public void setNumerator1(int numerator1) {
        this.numerator1 = numerator1;
    }

    public int getDenominator1() {
        return denominator1;
    }

    public void setDenominator1(int denominator1) {
        this.denominator1 = denominator1;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String toString() {
        return "NUMBER IS " + numerator1 + "/" + denominator1;
    }
}
