package assignment4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Nguyen Phu Tam", 19, 145678, "BN");
        Person p2 = new Person("NPT", 18, 345678, "HN");
        // test room
        Room r1 = new Room("Dao tao", "CNTT", null);
        Room r2 = new Room("Dao tao", "AI", null);

        r1.printRoom();
        r1.add(r1.listPerson);
        r1.remove(r1.listPerson, 0);
        r1.sortInRoom(r1);
    }
}
