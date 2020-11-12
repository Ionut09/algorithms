package com.lseg.classes;

public class Account {

    private String customerName; //null

    private String iban;

    double balance; //0, 0.0 sau false

    public Account() {
        this("John Anonynous", "0000000000", 0);

        //this is exactly default constrcutor
        System.out.println("Default constructor called");
//        customerName = "John Anonynous";
//        this.iban = "0000000000";
//        this.balance = 0.0;
    }

    public Account(String customerName, String iban, double balance) {
        super();
        System.out.println("Constructor with params called");
        //add validation
        this.customerName = customerName;
        this.iban = iban;
//        setBalance(balance);
        if (balance < 0) {
            throw new IllegalArgumentException("Balance should be positive");
        }
        this.balance = balance;

    }

    //behaviour
    public void deposit(double depositAmount) {

        balance += depositAmount;
        System.out.println("Funds deposited! New balance is: " + balance);
    }

    public void withdraw(double withdrawalAmount) {

        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Insufficent funds! Current balance is: " + this.balance);

        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Funds retrieved! New balance is: " + balance);
        }
    }

    public String getCustomerName() {

        return customerName;
    }

    public void setCustomerName(String customerName) {

        this.customerName = customerName;
    }

    public void setIban(String iban) {
        //add validation
        this.iban = iban;
    }

    public String getIban() {

        return iban;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance should be positive");
        }
        this.balance = balance;
        //myAccount.setBalance(100); this --> myAccount
        // this este o referinta catre obiectul care invoca metoda
    }
}
