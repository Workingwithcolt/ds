package Tim;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Theatre {
    //we want to make the class of the seats
    // that seat class contain the wheter it is reserved or not
private final String theatreName;
private List<Seat> seats  = new ArrayList<>();
public Theatre(String theatreName,int numRows,int seatPerROws){
    this.theatreName = theatreName;
    int lastRow = 'A'+(numRows-1);
    for(char row = 'A';row<=lastRow;row++){
        for(int seatNum = 1;seatNum<=seatPerROws;seatNum++){
            double price = 12.00;
            if((row<'D')&&(seatNum >= 4)&&(seatNum <= 9)){
                price = 14.00;
            }else if((row>'F')||(seatNum<4 || seatNum >9)){
                price = 7.00;
            }
            Seat seat = new Seat(row + String.format("%20d",seatNum),price);
            seats.add(seat);
        }
    }
}
public String getTheatreName(){
    return theatreName;
}
public boolean reserveSeat(String seatNumber){
    Seat requestedSeat = new Seat(seatNumber,0);
    int foundSeat = Collections.binarySearch(seats,requestedSeat,null);
    if(foundSeat >= 0){
        return seats.get(foundSeat).reserve();
    }else{
        System.out.println(foundSeat);
        System.out.println("there is no seat"+seatNumber);
        return false;
    }
}

public Collection<Seat> getSeats(){
    return seats;
}
public class Seat implements Comparable<Seat>{
    private final String seatNumber;
    private double price;
    private boolean reserved = false;
    public Seat(String seatNumber,double price){
        this.seatNumber = seatNumber;
        this.price = price;
    }

    @Override
    public int compareTo(Seat seat) {
        return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
    }
    public boolean reserve(){
        if(!this.reserved){
            this.reserved = true;
            System.out.println("Seat"+seatNumber+"reserved");
            return true;
        }else{
            return false;
        }
    }
    public String getSeatNumber(){
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }
}















}