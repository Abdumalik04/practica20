import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Phone  implements Phoneinterface {
    private String brand;
    private String name;
    private int password;
    private Contact [] contacts;

    public Phone(String brand, String name, int password, Contact[] contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return
                "brand:" + brand +
                ", name:" + name +
                ", password:" + password +
                ", contacts:" + Arrays.toString(contacts);
    }


    @Override
    public void turnOn() {
       Scanner sc=new Scanner(System.in);
        System.out.println("Parol teriniz");
        int parol= sc.nextInt();
if (password==parol){
    System.out.println("Phone kuiduu");
    }else {
    System.out.println("Parolduu tuura teriniz");
    }

    }

    @Override
    public String call(long phoneNumber) {
        for (Contact num : contacts) {
            if (phoneNumber == num.getPhoneNumber()) {
            }
           return num.getFullName()+ ": Chalup jatasyz";
        }
        return null;
    }

    @Override
    public String call1(String name) {
        for (Contact contact : contacts) {
            if (name.equals(contact.getFullName())) {
                return contact.getFullName() + contact.getPhoneNumber();
            }

        }
return null;
    }

    @Override
    public Contact searchContact(String name) {
for (Contact contact:contacts){
    if (name.equals(contact.getFullName())){
        return contact;
    }
}
return null;
    }

    @Override
    public Contact updetName(String oldName, String newName) {
        for (Contact contact:contacts){
            if (contact.getFullName().equals(oldName)){
               contact.setFullName(newName);
                return contact;
            }
        }
        return null;
    }


    @Override
    public void getAllContact() {
for (Contact contact:contacts){
    System.out.println(contact);

    }
}

    }


