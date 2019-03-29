//This program simulates a very simple bank account
package Ch8Classes;

public class MattSchneidermanBankAccountV2 {
    //State fields below
    private double balance;
    private int pin;
    private String name;
    private String ssn;
    private Address Address;
    private DateOfBirth DOB;

    //constructors below
    public MattSchneidermanBankAccountV2(String name, String ssn, Address Address, DateOfBirth DOB){
        this.name = name;
        this.ssn = ssn;
        this.Address = Address;
        this.DOB = DOB;
    }
    public MattSchneidermanBankAccountV2(String name, String ssn, Address Address, DateOfBirth DOB,
                                         int pin, double balance){
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

    public Address getAddress() {

        return Address;
    }

    public DateOfBirth getDOB() {

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
