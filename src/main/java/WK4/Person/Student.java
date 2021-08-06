package WK4.Person;

public class Student extends Person {
    private Status status;

    //Constructor
    public Student(String name, String address, String phone, String email, Status status) {
        super(name, address, phone, email);
        this.status = status;
    }

    //Getter
    public Status getStatus() {
        return status;
    }

    //Setter
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + "" +
                "status=" + status +
                '}';
    }
}
