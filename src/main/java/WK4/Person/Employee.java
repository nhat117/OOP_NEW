package WK4.Person;

import java.time.LocalDate;

public abstract class Employee extends Person {
    private String office;
    private String salary;
    private LocalDate dateHire;

    public Employee(String name, String address, String phone, String email, String office, String salary, LocalDate dateHire) {
        super(name, address, phone, email);
        this.salary = salary;
        this.office = office;
        this.dateHire = dateHire;
    }
    //Generate getter

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getSalary() {
        return salary;
    }

    //Genrate setter

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public LocalDate getDateHire() {
        return dateHire;
    }

    public void setDateHire(LocalDate dateHire) {
        this.dateHire = dateHire;
    }
    //Generate to String

    @Override
    public String toString() {
        return "Employee: " + super.toString() +
                "office='" + office + '\'' +
                ", salary='" + salary + '\'' +
                ", dateHire=" + dateHire;
    }
}
