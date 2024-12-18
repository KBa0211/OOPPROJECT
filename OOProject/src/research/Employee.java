package research;

public abstract class Employee extends User {
    public Employee(String name, int id, String email, String password) {
        super(name, id, email, password);
    }

    public String sendMessages() {
        return "Message sending: ";
    }
    public String sendComplaints() {
        return "Complaints sending: ";
    }

}
