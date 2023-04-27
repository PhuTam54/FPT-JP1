package Assignment2;

public class Fraction {
    int numerator, denominator;

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

    /**
     * In phân số
     */
    void printFraction() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    /**
     * // Rút gọn phân số
     *
     * checkGreatestMuliple
     * compactFraction
     */

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

    /**
     * Nghịch đảo phân số
     */

    void inverseFraction() {
        int temp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = temp;
    }

    /**
     * Cộng 2 phân số
     */
    Fraction addFraction(Fraction fr) {
        int numer = this.getNumerator() * fr.getDenominator() + fr.getNumerator() * this.getDenominator();
        int deno = this.getDenominator() * fr.getDenominator();
        Fraction totalFr = new Fraction(numer, deno);
        totalFr.compactFraction();
        return totalFr;
    }

    /**
     * Trừ 2 phân số
     */
    Fraction subFraction(Fraction fr) {
        int numer = this.getNumerator() * fr.getDenominator() - fr.getNumerator() * this.getDenominator();
        int deno = this.getDenominator() * fr.getDenominator();
        Fraction differenceFr = new Fraction(numer, deno);
        differenceFr.compactFraction();
        return differenceFr;
    }

    /**
     * Nhân 2 phân số
     */
    Fraction mulFraction(Fraction fr) {
        int numer = this.getNumerator() * fr.getNumerator();
        int deno = this.getDenominator() * fr.getDenominator();
        Fraction productFr = new Fraction(numer, deno);
        productFr.compactFraction();
        return productFr;
    }

    /**
     * Chia 2 phân số
     */
    Fraction divFraction(Fraction fr) {
        int numer = this.getNumerator() * fr.getDenominator();
        int deno = this.getDenominator() * fr.getNumerator();
        Fraction quotientFr = new Fraction(numer, deno);
        quotientFr.compactFraction();
        return quotientFr;
    }
}
