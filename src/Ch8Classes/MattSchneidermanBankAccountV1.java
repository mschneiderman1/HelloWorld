//This program simulates a very simple bank account
package Ch8Classes;

public class MattSchneidermanBankAccountV1 {
    //State fields below
    private double balance;
    private int pin;
    private String name;
    private String ssn;
    private String Address;
    private String DOB;

    //constructers below
    public MattSchneidermanBankAccountV1(String name, String ssn, String Address, String DOB){
        this.name = name;
        this.ssn = ssn;
        this.Address = Address;
        this.DOB = DOB;
    }
    public MattSchneidermanBankAccountV1(String name, String ssn, String Address, String DOB, int pin, double balance){
        this.name = name;
        this.ssn = ssn;
        this.Address = Address;
        this.DOB = DOB;
        this.pin = pin;
        this.balance = balance;
    }
    //getters
    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public String getAddress() {
        return Address;
    }

    public String getDOB() {
        return DOB;
    }

    //setter
    public void Deposit(double cash){
        this.balance += cash;
    }
    public void Withdrawl(double amount){
        this.balance -= amount;
    }

    //toString

    public String toString(){
        return "Name: " + name + "\nBalance: " + balance + "\n";
    }

}
