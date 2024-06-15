import java.util.*;
class AddressBook{
    HashMap<String, String>map = new HashMap<>();

    public void createContact(String k, String v){
        map.put(k, v);
        System.out.println(map);
    }
    public void editContact(String k, String v){
        map.get(k);
        createContact(k, v);
    }
    public void deleteContact(String k){
        map.remove(k);
        System.out.println(map);
    }
}
public class addressBookProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        AddressBook obj = new AddressBook();


        obj.createContact("kotu rao", "malhotra building near chembur mumbai maharatra india pin 23233 ");
    }
}
