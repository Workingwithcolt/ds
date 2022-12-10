package com.tim;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;
    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName,String customerName,double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newcustomer(customerName,initialAmount);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName,String customerName,double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addTransaction(customerName,amount);
        }
        return false;
    }
    private Branch findBranch(String branchName){
        for(int i=0;i<this.branches.size();i++){
            Branch checkedBranch = this.branches.get(i);//for retrieving the element from the particular list
            if(checkedBranch.getName().equals(branchName)){
                return checkedBranch;
            }
        }
        return null;
    }
    public boolean listCustomers(String branchName,boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("customer detail for branch "+ branch.getName());
            ArrayList<customer> branchCustomers =branch.getCustomers();
            for(int i=0;i<branchCustomers.size();i++){
                customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer:"+branchCustomer.getName()+"["+(i+1)+"]");
                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransaction();
                    for(int j=0;j<transactions.size();j++){
                        System.out.println("["+(j+1)+"] Amount "+ transactions.get(i));
                    }
                }
            }
            return true;
        }else {
            return false;
        }
    }

}
