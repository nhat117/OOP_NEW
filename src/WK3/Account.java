package WK3;

import java.util.Date;


public class Account {

    //Driver code
    public static void main(String[] args) {
        Acc ob1 = new Acc(1122,20000,4.5);
        ob1.withdraw(2500);
        ob1.deposit(3000);
        System.out.println(ob1);
    }

    public static class Acc {
        //Atribute
        private int id;
        private double balance;
        private double annualInterestRate;
        private Date dateCreated;
        //Constructor
        public Acc() {
            this.id = 0;
            this.balance = 0;
            this.annualInterestRate = 0;
            this.dateCreated = java.util.Calendar.getInstance().getTime();
        }

        public Acc (int id, double balance,double annualInterestRate, Date Datecreate) {
            this.id = id;
            this.balance = balance;
            this.annualInterestRate = annualInterestRate;
            this.dateCreated = Datecreate;
        }

        public Acc (int id, double balance,double annualInterestRate) {
            this.id = id;
            this.balance = balance;
            this.annualInterestRate = annualInterestRate;
            this.dateCreated = java.util.Calendar.getInstance().getTime();
        }

        //Getter

        public int getId() {
            return id;
        }

        public double getBalance() {
            return balance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        //Setter

        public void setId(int id) {
            this.id = id;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }
        //Methode

        public double getMonthlyInterestRate() {
            return getAnnualInterestRate() / 12;
        }

        public double getMonthlyInterest (){
            return (this.getMonthlyInterestRate() * this.getBalance() / 100);
        }

        public void withdraw (double amount) {
            this.setBalance(this.getBalance() - amount);
            System.out.println("Account id: " + getId());
            System.out.printf("Sucessfully withdraw %f\n", amount);
            System.out.printf("Remaining balance %f\n", this.getBalance());
        }

        public void deposit (double amount) {
            this.setBalance(this.getBalance() + amount);
            System.out.println("Account id: " + getId());
            System.out.printf("Sucessfully deposit %f\n", amount);
            System.out.printf("Remaining balance %f\n", this.getBalance());
        }

        @Override
        public String toString() {
            return "Account id: " + getId() + "\nCreate date: " + getDateCreated() + "\nMonthly interest rate: " + getMonthlyInterestRate() + "%" + "\nCurrent Balance: " + getBalance() + "\nMonthly Interest: " +getMonthlyInterest();
        }
    }
}
