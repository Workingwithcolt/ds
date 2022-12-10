package com.tim;

import java.util.ArrayList;

public class Branch{
    private String name;
    private ArrayList<customer> customers;
    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<customer> getCustomers() {
        return customers;
    }

    public boolean newcustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new customer(customerName,initialAmount));
            return true;
        }
        return false;
    }
    public boolean addTransaction(String customerName,double amount){
        customer existingCustomer  = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
    private customer findCustomer(String customerName){
        for(int i=0;i<this.customers.size();i++){
            customer checkedcustomer = this.customers.get(i);//for retrieving the element from the particular list
            if(checkedcustomer.getName().equals(customerName)){
                return checkedcustomer;
            }
        }
        return null;
    }

}