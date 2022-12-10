package com.tim;

import java.util.ArrayList;

public class customer{
    private String name;
    private ArrayList<Double> transaction;
    public customer(String name,double initialamount){
        this.name =name;
        this.transaction = new ArrayList<Double>();
        addTransaction(initialamount);
    }
    public void addTransaction(double amount ){
        this.transaction.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
}