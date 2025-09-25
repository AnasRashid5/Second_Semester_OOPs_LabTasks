package Models;

public class Complex {

    private double real;
    private double imagi;

    public Complex() {

    }

    public Complex(double Real, double Imaginary) {
        this.real = Real;
        this.imagi = Imaginary;
    }

    public Complex(Complex other) {
        this.real = other.real;
        this.imagi = other.imagi;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imagi + other.imagi);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imagi - other.imagi);
    }

    public Complex multiply(Complex other) {
        return new Complex((this.real * other.real) - (this.imagi * other.imagi),
                (this.real * other.imagi) + (this.imagi * other.real));
    }

    public Complex divide(Complex other) {
        double denominator = (other.real * other.real) + (other.imagi * other.imagi);
        double realPart = (this.real * other.real + this.imagi * other.imagi) / denominator;
        double imagPart = (this.imagi * other.real - this.real * other.imagi) / denominator;
        return new Complex(realPart, imagPart);
    }

    public void setReal(double Real) {
        this.real = Real;
    }

    public void setImaginary(double Imaginary) {
        this.imagi = Imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imagi;
    }

    @Override
    public Object clone() {
        try {
            return new Complex(real, imagi);
            // super.clone();

        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }

    // @Override
    // public String toString() {
    // return "Real Part is " + real + " Imaginary Part is " + imagi;
    // }

    // Better toString
    @Override
    public String toString() {
        if (imagi >= 0) {
            return real + " + " + imagi + "i";
        } else {
            return real + " - " + imagi + "i";
        }
    }

}
