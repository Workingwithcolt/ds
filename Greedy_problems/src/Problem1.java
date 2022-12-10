import javax.swing.text.Element;
import java.util.*;
import java.util.stream.Stream;

public class Problem1 {
    //LoveBabber 238
//    {1,3,0,5,8,5} = start
//    {2,4,6,7,9,9} = end
    //here what we have the two set which hvae the starting and ending time we have
    //(1,2),(3,4),(0,6),(5,7),(8,9),(5,9)
    //2<3 then no colllapse is happen in meeting
    //(1,2) is selected
    //4<0 not
    //4<5 is selected
    static class   Element implements  Comparable<Element> {
        int start;
        int end;

        public Element(int start, int end) {
            this.end = end;
            this.start = start;
        }

        @Override
        public int compareTo(Element o) {
            if (this.end > o.end) {
                return 1;
            }
            if (this.end < o.end) {
                return -1;
            }
            if (this.end == o.end) {
                return 0;
            }
            return 0;
        }
    }
    public static void main(String[] args){
        int[] startarray = {1,3,0,5,8,5};
        int[] endarray =   {2,4,6,7,9,9};
        List<Element> list = new ArrayList<>();
        for(int i=0;i<startarray.length;i++){
             Element e= new  Element(startarray[i],endarray[i]);
            list.add(e);
        }
        Collections.sort(list);
        for (Element e:list) {
            System.out.println(e.end+","+e.start);
        }
//        Stream<Map.Entry<Integer, Integer>> sorted =
//                map.entrySet().stream()
//                        .sorted(Map.Entry.comparingByValue());
//        sorted.forEach(System.out::println);
//        ArrayList<Element> list =new ArrayList<Element>();
//        for(int i=0;i<startarray.length;i++) {
//            Element e = new Element(startarray[i],endarray[i]);
//            list.add(e);
//        }
//        Collections.sort(list);
//        for (Element e:list) {
//            System.out.println(e.end);
//        }

        int i = 0;
        int j = 1;
        int c = 1;
        int n = startarray.length;
        while(j<n){
            if(list.get(i).end < list.get(j).start){
                c++;
                i = j;
                j++;
            }else{
                j++;
            }
        }
        }
    }

