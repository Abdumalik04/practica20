public class Main {
    public static void main(String[] args) {

        Contact contact = new Contact("Turatbek uulu Abdumalike: ", 13434333);
        Contact[] contacts = {contact};
        Phone phone = new Phone("Iphone", "13 Pro Max", 1101, contacts);
        phone.turnOn();
        System.out.println(phone.call(13434333));
        System.out.println(phone.call1("Turatbek uulu Abdumalike: "));
        System.out.println(phone.searchContact("Turatbek uulu Abdumalike: "));
        System.out.println(phone.updetName("Turatbek uulu Abdumalike: ","Asanbekov Abdumalik"));
        phone.getAllContact();
    }
}