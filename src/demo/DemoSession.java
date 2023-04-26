package demo;

import java.util.Scanner;

public class DemoSession {
//    public static void main(String args[]) {
//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap 1 so tu ban phim:");
//        n = sc.nextInt();
//        System.out.println("So vua nhap:" +n);
//        // Kiem tra n co phai so nguyen to hay khong?
//        int u = 0;
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                u++;
//            }
//        }
//        //da dem xong so uoc
//        if (u == 2) {
//            System.out.println(n + " la so nguyen to");
//        }
//        else {
//            System.out.println(n + " khong phai la so nguyen to");
//        }
//    }
    public static boolean checkSNT(int a) {
        if (a < 2) {
            return false;
        }
        if (a < 4) return true;
        for (int i = 2; i < a/2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int a = sc.nextInt();
        // khởi tạo mảng arr
        int[] arr = new int[a];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < a; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("-----------------------------------");
        for (int i = 0; i < arr.length; i++) {
            if (checkSNT(arr[i])) {
                System.out.println(arr[i] + " là số nguyên tố");
            }
        }
    }
}
