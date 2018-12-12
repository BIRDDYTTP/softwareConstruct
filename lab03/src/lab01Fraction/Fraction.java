package lab01Fraction;


public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void add(Fraction fraction){
        this.numerator = (this.numerator * fraction.denominator) + (this.denominator * fraction.numerator);
        this.denominator = denominator * fraction.denominator;
    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return  numerator + "/" + denominator ;
    }
}
