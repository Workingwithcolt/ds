import java.util.ArrayList;
import java.util.List;

public class GenerateValidIPBydynamicprogramming {
   public List<String> restoreIpAdree(String s){
       List<String> allipAddress = new ArrayList<>();
       int[] path= new int[4];
       snapshotIp(allipAddress,s,0,path,0);
       return allipAddress;
   }
   private void snapshotIp(List<String> allinpaddress,String s,int builderindex,int[] path,int segment){
       if(segment == 4 && builderindex == s.length()){
           allinpaddress.add(path[0]+"."+path[1]+"."+path[2]+"."+path[3]);
           return;
       }else if(segment == 4 || builderindex == s.length()){
           return;
       }
       for(int len = 1;len<=3 && builderindex+len <= s.length();len++){
           String snapshot = s.substring(builderindex,builderindex+len);
           int value = Integer.parseInt(snapshot);
           if(value > 255 || len>=2 && s.charAt(builderindex) == '0'){
               break;
           }
           path[segment] =value;
           snapshotIp(allinpaddress,s,builderindex+len,path,segment+1);
           path[segment] = -1;
       }
   }

    public static void main(String[] args) {
       List<String> l = new ArrayList<>();
       l = new GenerateValidIPBydynamicprogramming().restoreIpAdree("2552");
       for(String el:l){
           System.out.println(el);
       }
    }
}
