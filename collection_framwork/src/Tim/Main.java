package Tim;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Radhika", 8, 12);
        if(theatre.reserveSeat("D09")){
            System.out.println("Please Pay D09");
        }else{
            System.out.println("Sorry seat is taken");
        }
        if(theatre.reserveSeat("B03")){
            System.out.println("please pay B03");
        }else{
            System.out.println("Sorry seat is token ");

        }
        if(theatre.reserveSeat("C01")){
            System.out.println("please pay C03");
        }else{
            System.out.println("Sorry seat is token ");

        }

    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat:list){
            System.out.print(""+seat.getSeatNumber()+" "+seat.getPrice());
        }
        System.out.println();
        System.out.println("================");

    }
}

