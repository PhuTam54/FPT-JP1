package Assignment2;

public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    //in phan so
    void printFraction() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    //rut gon phan so
    int checkGreatestMuliple(int numerator, int denominator) {
        int x = numerator;
        int y = denominator;
        while (x != y) {
            if (x > y) {
                x -= y;
            } else {
                y -= x;
            }
        }
        return x;
    }

    void compactFraction() {
        int i = checkGreatestMuliple(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator() / i);
        this.setDenominator(this.getDenominator() / i);
    }

    //nghich dao phan so
    void inverseFraction() {

    }

    // Cong 2 phan so
    void addFraction(Fraction fr) {
        int numer = this.getNumerator() * fr.getDenominator() + fr.getNumerator() * this.getDenominator();
        int deno = this.getDenominator() * fr.getDenominator();
        Fraction totalFr = new Fraction(numer, deno);
        totalFr.compactFraction();
        System.out.println("Sum of 2 fractions = " + totalFr.numerator + "/" + totalFr.denominator);
    }

    // Tru 2 phan so
    void subFraction(Fraction fr) {
        int numer = this.getNumerator() * fr.getDenominator() - fr.getNumerator() * this.getDenominator();
        int deno = this.getDenominator() * fr.getDenominator();
        Fraction differenceFr = new Fraction(numer, deno);
        differenceFr.compactFraction();
        System.out.println("Difference of 2 fractions = " + differenceFr.numerator + "/" + differenceFr.denominator);
    }

    // Nhan 2 phan so
    void mulFraction(Fraction fr) {
        int numer = this.getNumerator() * fr.getNumerator();
        int deno = this.getDenominator() * fr.getDenominator();
        Fraction productFr = new Fraction(numer, deno);
        productFr.compactFraction();
        System.out.println("Product of 2 fractions = " + productFr.numerator + "/" + productFr.denominator);
    }

    // Chia 2 phan so
    void divFraction(Fraction fr) {
        int numer = this.getNumerator() * fr.getDenominator();
        int deno = this.getDenominator() * fr.getNumerator();
        Fraction quotientFr = new Fraction(numer, deno);
        quotientFr.compactFraction();
        System.out.println("Product of 2 fractions = " + quotientFr.numerator + "/" + quotientFr.denominator);
    }

}
