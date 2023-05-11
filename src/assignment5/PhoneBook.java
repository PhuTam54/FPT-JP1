package assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class PhoneBook extends Phone{
    private ArrayList<PhoneNumber> phoneList;

    public PhoneBook() {
        phoneList = new ArrayList<>();
    }

    public PhoneBook(ArrayList<PhoneNumber> phoneList) {
        this.phoneList = phoneList;
    }

    public ArrayList<PhoneNumber> getPhoneList() {
        return phoneList;
    }

    // new
    @Override
    void insertPhone(String name, String phone) {
        for (PhoneNumber p: phoneList) {
            if (p.getName().equals(name)) {
                if (p.getPhone().contains(phone)) {
                    return;
                }
                p.getPhone().add(phone);
                return;
            }
        }
        // ra ngoai for chac chan khong co name trung
        PhoneNumber pn = new PhoneNumber(name, phone);
        phoneList.add(pn);
    }

    @Override
    void removePhone(String name) {
        for (PhoneNumber p: phoneList) {
            if (p.getName().equals(name)) {
                phoneList.remove(p);
                return;
            }
        }
        return;
    }

    // old
//    @Override
//    void insertPhone(String name, String phone) {
//        PhoneNumber s = new PhoneNumber(name, phone);
//        for (int i = 0; i < phoneList.size(); i ++) {
//            if (phoneList.equals(name)) {
//                if (!phoneList.equals(phone)) {
////                    s.phone = phone;
//                }
//            } else {
//                phoneList.add(s);
//            }
//        }
//    }

//    @Override
//    void removePhone(String name) {
//        for (int i = 0; i < phoneList.size(); i ++) {
//            if (phoneList.equals(name)) {
//                phoneList.remove(this.phoneList);
//            }
//        }
//    }

    @Override
    void updatePhone(String name, String oldPhone,String newPhone) {
        for (PhoneNumber p: phoneList) {
            if (p.getName().equals(name)) {
                if (p.getPhone().contains(oldPhone)) {
                    p.getPhone().remove(oldPhone);
                    p.getPhone().add(newPhone);
                    return;
                };
                return;
            }
        }
        return;
    }

    @Override
    PhoneNumber searchPhone(String name) {
        for (PhoneNumber p: phoneList) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    @Override
    void sort() {
        // bubble sort
//        int size = phoneList.size();
//        for (int i = 0; i < size - 1; i ++) {
//            for ( int j = 0; j < size - i -1; j ++) {
//                String name_pj = phoneList.get(j).getName();
//                String name_pj1 = phoneList.get(j + 1).getName();
//                if (name_pj.compareTo(name_pj1) > 0) {
//                    PhoneNumber tmp = phoneList.get(j);
//                    phoneList.add(j, phoneList.get(j + 1));
//                    phoneList.add(j + 1, tmp);
//                }
//            }
//        }

        Collections.sort(phoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
