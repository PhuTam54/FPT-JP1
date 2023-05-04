package Assignment3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1, "SP1", 99, 99);
        Product p2 = new Product(2, "SP2", 0, 69);
        // Test Product 1
        System.out.println("ID: " + p1.id + " Name: " + p1.productName + " Qty: " + p1.qty + " Price: " + p1.price);
        if (p1.checkQty(p1.qty)) {
            System.out.println("Còn hàng");
        } else {
            System.out.println("Hết hàng");
        };
        // Test Product 2
        System.out.println("ID: " + p2.id + " Name: " + p2.productName + " Qty: " + p2.qty + " Price: " + p2.price);
        if (p2.checkQty(p2.qty)) {
            System.out.println("Còn hàng");
        } else {
            System.out.println("Hết hàng");
        };

        // Test Cart
        Cart cart = new Cart(1, "PhuTam", 99, null, "HCM");
        Cart c = new Cart();
        c.id = 2;
        c.customer= "PT";
        c.grandTotal = 99;
        c.productList = null;
        c.city = "HN";

        // Tính tổng số tiền
        System.out.println("Total 1: " + c.getTotal(c));
        System.out.println("Total 2: " + cart.getTotal(cart));
    }
}
