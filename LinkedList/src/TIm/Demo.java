package TIm;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placestoVist = new LinkedList<String>();
        addInOrder(placestoVist,"Satara");
        addInOrder(placestoVist,"Pune");
        addInOrder(placestoVist,"mumbai");
        addInOrder(placestoVist,"America");
        addInOrder(placestoVist,"Kolhapur");
        printlist(placestoVist);
        addInOrder(placestoVist,"Satara");
        printlist(placestoVist);
        visit(placestoVist);

        placestoVist.add(1,"Alice Spring");
        printlist(placestoVist);
        placestoVist.remove(4);
        printlist(placestoVist);
    }

    private static void printlist(LinkedList<String> Linkedlist){
        Iterator<String> i = Linkedlist.iterator();
        while(i.hasNext()){//here i.next is saying there is another entry
            System.out.println("Now to visiting "+i.next());//i.next is return the entry and also moves to the next
        }
        System.out.println("\n ====================================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){//[that will execute when their is some element present in the linklist
            int comaparision  = stringListIterator.next().compareTo(newCity);
            if(comaparision == 0){
                System.out.println(newCity + "is already included as a destination");
                return false;
            }else if(comaparision > 0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comaparision < 0){
            }
        }
        stringListIterator.add(newCity);//for adding the element at start
        return true;
    }
    private static void visit(LinkedList cities){
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.getFirst() == "Satara"){
            System.out.println("No cities in the intenerary ");
            return;
        }else{
            System.out.println("Now Visiting "+ listIterator.next());
            printMenu();
        }
        while(!quit){
            int action = s.nextInt();
            s.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Holiday (vocation) Over");
                    quit = true;
                    break;
                case 1:
                    if(listIterator.hasNext()) {
                        System.out.println("Now Visiting" + listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list");
                    }break;
                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting "+ listIterator.previous());
                    }else{
                        System.out.println("we are at start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
            }
        }
        private static void printMenu(){
            System.out.println("Available action :\npress");
            System.out.println("0- to quit\n"+
                               "1- go to next city"+
                               "2 - go to previous city\n" +
                               "3 - print menu options");
        }
    }

