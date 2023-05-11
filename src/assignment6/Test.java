package assignment6;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        News n1 = new News(1, "Tieu de 1", "11/05/2023", "Phu Tam", "Tik tok", 5);
        News n2 = new News(2, "Tieu de 2", "11/05/2023", "Phu Tam", "Youtube", 4);

        // test display
        n1.display();

        ArrayList<Float> l1 = new ArrayList<>(5);
        n1.setRateList();
        System.out.println(n1.rateList);
    }
}
