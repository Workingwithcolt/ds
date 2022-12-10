import java.util.*;

public class Program_for_Shortest_Job_First {
    //    go and watch the vedio on codelibrary under the  program_for_shortest_Job_first
    static class job implements Comparable<job> {
        int id;
        int arrival;
        boolean isfitted = false;
        int burst;

        public job(int id, int arrival, int burst) {
            this.id = id;
            this.arrival = arrival;
            this.burst = burst;
        }

        @Override
        public int compareTo(job o) {
            return this.burst-o.burst;
            }

        }
//    public static void SJF(){
//        Scanner s = new Scanner(System.in);
//        PriorityQueue<job> p = new PriorityQueue<>();
//         ArrayList<job> arrayobjet = new ArrayList<>();
//        int N = s.nextInt();
//        for(int i=0;i<N;i++){
//
//            int id =i+1;
//            int arrival  =  s.nextInt();
//            int burst = s.nextInt();
//            job j = new job(id,arrival,burst);
//            arrayobjet.add(j);
//        }
//
//    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PriorityQueue<job> p = new PriorityQueue<>();
        List<job> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int id = i + 1;
            int arrival = s.nextInt();
            int burst = s.nextInt();
            job j = new job(id, arrival, burst);
            list.add(j);
        }
        Collections.sort(list, (a, b) -> a.arrival < b.arrival ? -1 : a.arrival == b.arrival ? 0 : 1);
        for (job e:list) {
            System.out.println(e.arrival+"it is the element");
        }
        int sumofcpuTime = list.get(0).burst;
        int lastburst = list.get(0).burst;
        System.out.println("lastburst"+lastburst);
        list.remove(0);
        System.out.println(list.get(0).arrival);
        int count = 0;
        boolean istrue = false;
        while (count <4) {
            for(int i=0;i<list.size();i++) {
                if (list.get(i).arrival <= lastburst) {
                    p.offer(list.get(i));
                    list.remove(i);
                    if(i == list.size()-1) {
                        istrue = true;
                    }
                } else if(!p.isEmpty() && istrue){
                    System.out.println(sumofcpuTime + "sumofcpuTime");
                    sumofcpuTime += p.peek().burst;
                    System.out.println(p.peek().burst + "is is the peek");
                    lastburst = p.peek().burst;
                    p.poll();
                    if(p.isEmpty()) {
                        istrue = false;
                    }
                }
            }
//            System.out.println(list.size()+"it is size");
//            for (int r = 0; r < list.size(); r++) {
//                p.add(list.get(r));
//            }
//            for (int m = 0; m < p.size(); m++) {
//                sumofcpuTime += p.peek().burst;
//                p.poll();
//            }
//            if (p.isEmpty()) {
//                break;
//            }
            count++;
        }
        for (int r = 0; r < list.size(); r++) {
                p.add(list.get(r));
        }
        for (int m = 0; m < p.size(); m++) {
            sumofcpuTime += p.peek().burst;
            p.poll();
        }
        System.out.println(sumofcpuTime);
    }
}


