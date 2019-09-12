package com.david;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Account bobsAccount = new Account();
        Account davidAccount = new Account();

        davidAccount.setBalance(1000);
        davidAccount.setCustomerName("David Lee");

        bobsAccount.setBalance(12000);
        bobsAccount.setCustomerEmailAddress("ryonlee@gmail.com");
        bobsAccount.setCustomerName("Bob Bob Bob");

        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(1000);
        bobsAccount.deposit(500);
        bobsAccount.withdrawal(300);

//        Scanner scanner = new Scanner();
//        You need to make some more extension of this program
//        The concenpt I want is to get input from system.
//        Input will be reflected to sender and receiver by transfer
//        After determining it is possible to transfer, show the result

        davidAccount.withdrawal(5000);

        bobsAccount.transfer(davidAccount, 5000);

        davidAccount.withdrawal(5000);
    }



}
