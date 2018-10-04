import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();
    private double monthlyInterestRate;

    public Account(){
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;

        this.annualInterestRate = annualInterestRate;

    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date dateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    public double getMonthlyInterestRate(){
        monthlyInterestRate = annualInterestRate / 12/100;
        return monthlyInterestRate;
    }

    public double withdraw (double withdraw){
        balance -= withdraw ;
        return balance;
    }

    public double deposit (double deposit){
        balance += deposit;
        return balance;
    }
}
