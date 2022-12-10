import java.util.Scanner;
public class COVID_19 {
    //here int the above constrain we have the condition that the column value can be negative
    //row value is start from the positive to positive inifinity
    public static int findSeat(int row ,int column){
        if(row >1){
            if(row % 2 == 0){
                row = row/2;
            }else if(row %2 > 0){
                row = (row/2)+1;
            }
        }
        if(Math.abs(column) > 1){
            if(Math.abs(column) % 2 == 0){
                column = Math.abs(column)/2;
            }else if(Math.abs(column) %2 > 0){
                column = (Math.abs(column)/2)+1;
            }
        }
        return (row*column);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int TestCase = s.nextInt();
        for(int i=0;i<TestCase;i++){
            int row = s.nextInt();
            int column = s.nextInt();
            System.out.println(findSeat(row,column));
        }
    }
}
