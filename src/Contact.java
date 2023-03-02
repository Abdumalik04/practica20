import java.util.Scanner;

public class Contact{
    private String fullName;
    private long phoneNumber;

    public Contact(String fullName,long phoneNumber) {

        this.phoneNumber=phoneNumber;
        this.fullName=fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return
                "fullName: " + fullName + "\n" +
                        "phoneNumber: " + phoneNumber;
    }
}

