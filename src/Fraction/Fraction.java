package Fraction;

public final class Fraction extends Number{
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int number) {
        this.numerator = number;
        this.denominator = 1;
    }

    public Fraction sum(Fraction other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }

    public Fraction sum(int number) {
        return this.sum(new Fraction(number));
    }

    public Fraction minus(Fraction other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }

    public Fraction minus(int number) {
        return this.minus(new Fraction(number));
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(int number) {
        return this.multiply(new Fraction(number));
    }

    public Fraction div(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction div(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return this.div(new Fraction(number));
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public int getNumerator() { return numerator; }
    public int getDenominator() { return denominator; }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
