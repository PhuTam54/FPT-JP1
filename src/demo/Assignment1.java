package demo;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
//    1. Nhập 1 số nguyên n, kiểm tra nó có phải số hoàn hảo hay không.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to check if it's a perfect number: ");
        int n = sc.nextInt();
        if (checkPerfectNum(n)) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }

//    2. Nhập 1 số nguyên n, tìm số có vị trí thứ n của dãy Fibonacci.
        System.out.println("-------------------------");
        System.out.println("Enter an integer to check the fibonacci number in that position: ");
        int m = sc.nextInt();
        System.out.println(m + " Fibonacci: " + checkFibonacci(m - 1));

//    3. Nhập 2 số nguyên, tìm ước chung lớn nhất và bội chung nhỏ nhất của 2 số đó.
        //

    }

//    1.
    public static boolean checkPerfectNum(int n) {
        if (n < 1) return false;
        else {
            int pn = 0;
            for (int i = 1; i < n-1; i++) {
                if (n%i == 0) {
                    pn += i;
                }
            }
            if (pn == n) {
                return true;
            }
            else return false;
        }
    }

//    2.
    public static int checkFibonacci(int m) {
        if (m < 0) {
            return -1;
        } else if (m == 0 || m == 1) {
            return m;
        } else {
            return checkFibonacci(m - 1) + checkFibonacci(m - 2);
        }
    }

//    3.
    //

}
