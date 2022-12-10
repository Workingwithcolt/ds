public class SimpleSieve {
    static  class Values{
        int value;
        boolean isdivisible;
        public Values(int value){
            this.value= value;
        }
    }
    public static void prime(int n){
        Values[] a = new Values[n-1];
        for(int i=0;i<a.length;i++){
            System.out.println(i);
            Values c = new Values(i+2);
            a[i] = c;
            a[i].isdivisible = false;
        }
        for(int i=0;i<a.length;i++){
            if(a[i].isdivisible == true){
                continue;
            }
            for(int j = i+1;j<a.length;j++){
                if(a[j].value % a[i].value == 0 && a[j].isdivisible == false){
                    a[j].isdivisible = true;
                }
            }
        }
        for(Values el:a){
            if(el.isdivisible == false){
                System.out.print(el.value+" ");
            }
        }
    }

    public static void main(String[] args) {
        prime(100);
    }
}
