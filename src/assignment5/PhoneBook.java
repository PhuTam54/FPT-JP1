package assignment5;

import java.util.ArrayList;
import java.util.Objects;

public class PhoneBook extends Phone{
    ArrayList<PhoneNumber> phoneList;

    public PhoneBook(ArrayList<PhoneNumber> phoneList) {
        this.phoneList = phoneList;
    }

    public ArrayList<PhoneNumber> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(ArrayList<PhoneNumber> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    void insertPhone(String name, String phone) {
        PhoneNumber s = new PhoneNumber(name, phone);
        for (int i = 0; i < phoneList.size(); i ++) {
            if (phoneList.equals(name)) {
                if (!phoneList.equals(phone)) {
                    s.phone = phone;
                }
            } else {
                phoneList.add(s);
            }
        }
    }
    @Override
    void removePhone(String name) {
        for (int i = 0; i < phoneList.size(); i ++) {
            if (phoneList.equals(name)) {
                phoneList.remove(this.phoneList);
            }
        }
    }

    @Override
    void updatePhone(String name, String newPhone) {
        for (int i = 0; i < phoneList.size(); i ++) {
            if (phoneList.equals(name)) {
//                searchPhone().phone = newPhone;
            }
        }
    }

    @Override
    PhoneNumber searchPhone(String name) {
        return null;
    }

    @Override
    void sort() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return Objects.equals(phoneList, phoneBook.phoneList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneList);
    }
}
