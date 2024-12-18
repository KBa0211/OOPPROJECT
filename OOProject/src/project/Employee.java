package project;

public abstract class Employee extends User {
    public Employee(String name, String password) {
        super(name, password);
    }

    public String sendMessages() {
        return "Message sending: ";
    }
    public String sendComplaints() {
        return "Complaints sending: ";
    }

}
