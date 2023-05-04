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

    public void addToCart(Cart cart, Product product) {
        // Tạo mảng
        String[] arr = {};

        // In mảng ban đầu
        System.out.println("-----------------\nOld arr:\n"
                + Arrays.toString(arr));

        // Lấy độ dài mảng ban đầu
        int N = arr.length;

        /*Tạo một mảng mới cùng tên có độ dài N+1 và copy mảng ban đầu */
        arr = Arrays.copyOf(arr, N + 1);

        //Thêm 1 phần tử vào mảng mới
        arr[N] = product.productName;

        // In mảng kết quả
        System.out.println("New arr:\n" + Arrays.toString(arr));
    }

//    public static Object[] addToCart(Object[] productList, Object...elements) {
//        Object[] tempList = new Object[productList.length + elements.length];
//        System.arraycopy(productList, 0, tempList, 0, productList.length);
//
//        for (int i = 0; i < elements.length; i++)
//            tempList[productList.length + i] = elements[i];
//        return tempList;
//    }
}


