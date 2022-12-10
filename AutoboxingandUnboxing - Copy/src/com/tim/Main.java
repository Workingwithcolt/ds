package com.tim;
public class Main {
    public static void main(String[] args){
        Bank bank  = new Bank("National Austrailia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adeliade","Tim",50.05);
        bank.addCustomer("Adealiade","Mike",175.53);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Bob",54.54);
        bank.addCustomerTransaction("Adeliade","Tim",44.53);
        bank.addCustomerTransaction("Adeliade","Tim",14.53);
        bank.addCustomerTransaction("Adeliade","Mike",54.53);
        bank.listCustomers("Adeledia",true);
    }
}