/*
Создать следующие классы согласно схеме.
Заметка – у вас есть класс Address – это класс, который является просто полем вашего класса Person.
Student/Professor – наследники от класса Person.
*/
public class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Address  a = new Address();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getA() {
        return a;
    }

    public void Purchase_Parking_Pass(){

    }
}

