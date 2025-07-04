package OOP.AbstractClass;
import java.util.*;

import OOP.AbstractClass.Phone;

public class PhoneBook extends Phone {

    private class bookEntry{
        String name;
        String phone;
        bookEntry(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
    private List<bookEntry> phoneBook;
    public PhoneBook() {
        phoneBook = new ArrayList<>();
    }
    @Override
    public void insertPhone(String name, String phone) {
        boolean check = false;
        for(bookEntry entry: phoneBook){
            if(entry.name.equals(name)){
                String oldPhone = entry.phone;
                if(!oldPhone.equals(phone)){
                    entry.phone = oldPhone+" : "+ phone;
                }
                check = true;
                break;
            }
        }
        if(!check){
            phoneBook.add(new bookEntry(name, phone));

        }
    }   
    @Override
    public void removePhone(String name) {
        phoneBook.removeIf(entry -> entry.name.equals(name));
    }
    @Override
    public void updatePhone(String name, String newPhone) {

    }
    @Override
    public void searchPhone(String name) {
    
    }
    @Override
    public void sort() {
        phoneBook.sort(Comparator.comparing(entry -> entry.name));
    }

   public static void main(String[] args){
        PhoneBook pb = new PhoneBook();
        pb.insertPhone ("anhLong", "123456");
        pb.insertPhone ("anhTrieu", "1234567");
        pb.insertPhone ("anhLong", "987654");
        pb.insertPhone ("ahihihi", "123456789");
        for (bookEntry bE: pb.phoneBook){
            System.out.println("Name: " + bE.name + ", Phone: " + bE.phone);
        }
        pb.removePhone("anhLong");
        System.out.println("After removing anhLong:");
        for (bookEntry bE: pb.phoneBook){
            System.out.println("Name: " + bE.name + ", Phone: " + bE.phone);
        }
        
    }
}
