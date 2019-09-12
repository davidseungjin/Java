package com.david;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;


    public Account(){
        System.out.println("Empty constructor called");


    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Constructor having five arguments called here");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " processed. So remaining balance = " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
            System.out.println("Only "+ this.balance + " available. So, withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. So remaining balance = " + this.balance);
        }
    }
    public void transfer(Account receiver, double amount){

        System.out.println("Transfer amount is " + amount);
        if(amount>this.balance){
            System.out.println("Amount you want to transfer exceeds sender's balacne. Stop processing.");
        } else {
            System.out.println("Amount you want to transfer is within sender's balacne. Processing starts.");

            System.out.println("===== Sender and Receiver =====");
            System.out.println("sender's name is " + this.customerName);
            System.out.println("receiver's name is " + receiver.customerName);

            System.out.println("===== Initisal status =====");
            System.out.println("sender's balance is " + this.balance);
            System.out.println("receiver's balance is " + receiver.balance);

            System.out.println("===== Transfer Amount =====");
            System.out.println("Transfer Amount is " + amount);

            this.balance -= amount;
            receiver.balance += amount;

            System.out.println("===== After status =====");
            System.out.println("sender's balance is " + this.balance);
            System.out.println("receiver's balance is " + receiver.balance);
        }
    }



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerphoneNumber) {
        this.customerPhoneNumber = customerphoneNumber;
    }
}
