package Assignment2;

public class Main {
    public static void main(String[] args) {
        Fraction a = new Fraction(2, 2);
        Fraction b = new Fraction(8, 2);
        a.printFraction();
        b.printFraction();

        a.addFraction(b);
        b.subFraction(a);
        a.mulFraction(b);
        a.divFraction(b);
    }
}
