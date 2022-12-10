package com.tim;

import java.util.Scanner;

public class Main {
    private static Scanner  s=new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0038 330 4404");

    public static void main(String[] args){

        boolean quit = false;
        startPhone();
        printAction();
        while(!quit){
            System.out.println("\n Enter the action:(6 to show availabele action)");
            int action  = s.nextInt();
            s.nextLine();
            switch (action){
                case 0:
                    System.out.println("\n shouting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts ();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printAction();
                    break;

            }
        }
    }
    private static void addNewContact(){
        System.out.println("Enter the new contact name");
        String name = s.nextLine();
        System.out.println("Enter the phone number");
        String phone  = s.nextLine();
        Contact newContact =Contact.createContact(name,phone);
        if(mobilePhone.addnewContact(newContact)){
            System.out.println("New contact added:"+name+",phone = "+phone);
        }else{
            System.out.println("can not add"+ name +"already on file");
        }
    }
    public static void updateContact(){
        System.out.println("Enter the existing contact name:");
        String name =s.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            return;
        }

        System.out.println("Enter new contact name:");
        String newName = s.nextLine();
        System.out.println("Enter new Contact phone number");
        String newNumber = s.nextLine();
        Contact newContact  = Contact.createContact(newName,newNumber);
        if(mobilePhone.updateContact(existingContactRecord,newContact)){
            System.out.println("Successfully updated record");
        }else{
            System.out.println("Error updating record");
        }

    }
    private static void removeContact(){
        System.out.println("Enter existing contact name:");
        String name = s.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found!!");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted ");
        }else{
            System.out.println("Enter deleting contact ");
        }

    }

    public static void queryContact(){
        System.out.println("Enter the existing contact name:");
        String name = s.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println();
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Enter deleting contact");
        }
    }

    private static void startPhone(){
        System.out.println("Starting phone..");
    }
    private static void printAction() {
        System.out.println("\n Availabel action:\npress");
        System.out.println("\n 0-to shutdown\n +" +
                "1 -  to print contact\n"+
                "2 - to add a new contact \n"+
                "3 - to update existing an existing contact\n"+
                "4 - to remove an existing contact\n"+
                "5 - query if an existing contact exist\n"+
                "6 - to print a list available to action");
        System.out.println("Choose an action");
    }
}
