package assignment4;

import assignment4.Person;

import java.util.*;

public class Room {
    String name;
    String position;
    ArrayList<Person> listPerson;

    public Room(String name, String position, ArrayList<Person> listPerson) {
        this.name = name;
        this.position = position;
        this.listPerson = listPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ArrayList<Person> getListPerson() {
        return listPerson;
    }

    public void setListPerson(ArrayList<Person> listPerson) {
        this.listPerson = listPerson;
    }

    // In ra thông tin của phòng gồm: tên, vị trí và danh sách user
    public void printRoom() {
        System.out.println("Name: " + this.name);
        System.out.println("Position: " + this.position);
        System.out.println("List Person: " + this.listPerson);
    }

    // thêm 1 người vào danh sách
    public void add(List<Person> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input name: ");
        String name = sc.nextLine();
        System.out.print("input age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("input telephone: ");
        int telephone = Integer.parseInt(sc.nextLine());
        System.out.print("input address: ");
        String address = sc.nextLine();

        Person s = new Person(name, age, telephone, address);
        list.add(s);
    }

    // xóa 1 người khỏi danh sách
    public void remove(List<Person> list, int i) {
        for (int j = 0; j < list.size(); j++) {
            if (j == i) {
                list.remove(j);
                break;
            }
        }
    }

    // Sắp xếp người trong phòng theo tên (alphabet)
    public void sortInRoom(Room room) {
//        return Collections.sort(room.listPerson);
    }
}
