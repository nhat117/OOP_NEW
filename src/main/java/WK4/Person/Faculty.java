package WK4.Person;

import java.time.LocalDate;
import java.time.LocalTime;

public class Faculty extends Employee {
    private LocalTime officeStartTime;
    private LocalTime officeEndTime;
    private String rank;

    //Constructor
    public Faculty(String name, String address, String phone, String email, String office, String salary, LocalDate dateHire, LocalTime officeStartTime, LocalTime officeEndTime, String rank) {
        super(name, address, phone, email, office, salary, dateHire);
        this.officeStartTime = officeStartTime;
        this.officeEndTime = officeEndTime;
        this.rank = rank;
    }

    //Getter and Setter
    public LocalTime getOfficeStartTime() {
        return officeStartTime;
    }

    public void setOfficeStartTime(LocalTime officeStartTime) {
        this.officeStartTime = officeStartTime;
    }

    public LocalTime getOfficeEndTime() {
        return officeEndTime;
    }

    public void setOfficeEndTime(LocalTime officeEndTime) {
        this.officeEndTime = officeEndTime;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    //To string

    @Override
    public String toString() {
        return "Faculty: " + super.toString() +
                "officeStartTime=" + officeStartTime +
                ", officeEndTime=" + officeEndTime +
                ", rank='" + rank;
    }
}
