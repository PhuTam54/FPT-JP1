package Assignment3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Cart {
    int id;
    String customer;
    float grandTotal;
    Object[] productList;
    String city;

    public Cart() {

    }

    public Cart(int id, String customer, float grandTotal, String[] productList, String city) {
        this.id = id;
        this.customer = customer;
        this.grandTotal = grandTotal;
        this.productList = productList;
        this.city = city;
    }

    public float getTotal(Cart cart) {
        if (cart.city == "HN" || cart.city == "HCM") {
            cart.grandTotal = cart.grandTotal + (cart.grandTotal * 1/100);
        } else{
            cart.grandTotal = cart.grandTotal + (cart.grandTotal * 2/100);
        }
        return grandTotal;
    }

    public static Object[] addToCart(Object[] productList, Object...elements) {
        Object[] tempList = new Object[productList.length + elements.length];
        System.arraycopy(productList, 0, tempList, 0, productList.length);

        for (int i = 0; i < elements.length; i++)
            tempList[productList.length + i] = elements[i];
        return tempList;
    }
}


