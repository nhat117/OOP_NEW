package WK4.Person;

import java.time.LocalDate;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phone, String email, String office, String salary, LocalDate dateHire, String title) {
        super(name, address, phone, email, office, salary, dateHire);
        this.title = title;
    }

    //Getter setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + super.toString() +
                "title= " + title;
    }
}
