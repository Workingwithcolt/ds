import java.util.Stack;

public class LargestRectangleAreaHist {
    static int getMaxArea(int hist[],int n){
        Stack<Integer> s = new Stack<>();
        int max_area =0;
        int tp;
        int area_with_top;
        int i=0;
        while(i<n){
            if(s.empty() || hist[s.peek()] <= hist[i]){
                System.out.println("Before :i"+i);
                int c = i++;
                s.push(c);
                System.out.println("currnet"+c);
                System.out.println("after i:"+i);
            }else{
                System.out.println("else is exeuted");
                tp = s.peek();
                System.out.println("top:"+tp);
                s.pop();
                System.out.println("hist[tp]"+hist[tp]);
                System.out.println("i"+i);
                area_with_top = hist[tp]*(s.empty() ? i:i-s.peek()-1);
                System.out.println(i);
                System.out.println("area_with_top"+area_with_top);
                if(max_area < area_with_top){
                    max_area = area_with_top;
                }
            }
        }
        while (s.empty() == false){
            tp = s.peek();
            s.pop();
            area_with_top = hist[tp]*(s.empty()? i:i-s.peek()-1);
            if(max_area < area_with_top){
                max_area =area_with_top;
            }
        }
        return max_area;
    }

    public static void main(String[] args) {
        int hist[] = {6,2,5,4,5,1,6};
        System.out.println("Maximum area is "+getMaxArea(hist,hist.length));
    }
}
