package Assignment2;

public class Main {
    public static void main(String[] args) {
        Fraction a = new Fraction(3, 2);
        Fraction b = new Fraction(8, 15);

        System.out.println("Fraction: ");
        a.printFraction();
        b.printFraction();

        System.out.println("Sum of 2 fractions: ");
        a.addFraction(b).printFraction();

        System.out.println("Difference of 2 fractions: ");
        a.subFraction(b).printFraction();

        System.out.println("Product of 2 fractions: ");
        a.mulFraction(b).printFraction();

        System.out.println("Quotient of 2 fractions: ");
        a.divFraction(b).printFraction();

        System.out.println("Inverse of fraction a: ");
        a.inverseFraction();
        a.printFraction();

        System.out.println("Inverse of fraction b: ");
        b.inverseFraction();
        b.printFraction();
    }
}
