package com.lseg.classes;

public class BranchService {

    public static void main(String[] args) {

//        id 1 din Account table
//        "John Doe", "RO19RNCB811829172918291729", 0  --> un obiect din clasa Account

        Account johnAccount = new Account("John Doe", "RO19RNCB811829172918291729", 0);
//       deposit(row);
//        johnAccount.setCustomerName("John Doe");
//        johnAccount.setIban("RO19RNCB811829172918291729");

        johnAccount.deposit(1000);
        johnAccount.withdraw(200);//euro

        Account account2 = new Account("John Big", "RO19RNCB811829172918291729", 10);
        account2.balance = -100;
        System.out.println(account2.getBalance());

        System.out.println("=========================");
        Account defaultAccount = new Account();
        System.out.println(defaultAccount.getCustomerName());
        System.out.println(defaultAccount.getIban());
    }
}
