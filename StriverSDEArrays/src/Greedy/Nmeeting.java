package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Nmeeting {
  static  class meeting{
        public int start;
        public int end;
        public int pos;
        public meeting(int start,int end,int pos){
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }
    class meetingComparator implements Comparator<meeting> {
        @Override
        public int compare(meeting o1, meeting o2) {
            if (o1.end < o2.end) {
                return -1;
            } else if (o1.end > o2.end) {
                return 1;
            } else if (o1.pos < o2.pos) {
                return -1;
            }else{
                return 1;
            }
        }
    }

    class Meeting{
         void maxMeetings(int start[],int[] end,int n){
            ArrayList<meeting> meet =new ArrayList<>();
            for(int i=0;i<start.length;i++){
                meet.add(new meeting(start[i],end[i],i+1));
            }
            meetingComparator mc = new meetingComparator();
             Collections.sort(meet,mc);
             ArrayList<Integer> answer = new ArrayList<>();
             answer.add(meet.get(0).pos);
             //here we are adding the first element so that we can compare the second element
             //by the limit
             int limit = meet.get(0).end;
             for(int i=1;i<start.length;i++){
                 if(meet.get(i).start > limit){
                     limit =meet.get(i).end;
                     answer.add(meet.get(i).pos);
                 }
             }
             for(int i=0;i<answer.size();i++){
                 System.out.println(answer.get(i)+" ");
             }
        }
    }
}
