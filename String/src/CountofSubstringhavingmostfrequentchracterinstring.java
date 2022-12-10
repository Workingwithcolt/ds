import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountofSubstringhavingmostfrequentchracterinstring {
    static int  substringCount(String s){
        int[] freq = new int[26];
        char max_char = '#';
        int maxfreq = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            System.out.println(s.charAt(i));
            System.out.println(freq[s.charAt(i)-'a']);
            if(maxfreq < freq[s.charAt(i)-'a']){
                maxfreq = freq[s.charAt(i)-'a'];
            }
        }
        System.out.println("maxfreq"+maxfreq);
        for(int i=0;i<26;i++){
            if(maxfreq == freq[i]){
                max_char = (char) (i+'a');
                System.out.println(i+'a');
                System.out.println(max_char);
                break;
            }
        }
        for(int el:freq){
            System.out.print(el+" ");
        }
        int ans = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(max_char == ch){
                ans+=(s.length()-i);
            }
        }
        return ans;
    }
    public static int findmin(int[] arr){
         Map<Integer,Integer> map = new HashMap<>();
         int numberelement = 0;
         Set<Integer> set = new HashSet<>();
         for(int i=0;i<arr.length;i++){
             if(map.containsKey(arr[i])){
                 int count = map.get(arr[i]);
                 count+=1;
                 map.put(arr[i],count);
             }else{
                 map.put(arr[i],1);
                 numberelement+=1;
             }
         }
         for(int i=0;i<arr.length;i++){
             set.add(arr[i]);
         }
         int smallest = Integer.MAX_VALUE;
        System.out.println(map.size());
        for(int i=0;i<arr.length;i++){
            if(smallest > map.get(arr[i])){
               smallest = map.get(arr[i]);
            }
        }
        System.out.println(smallest+"smallest");
        int greatest = 0;
        for(int j = 0;j< arr.length;j++){
            if(greatest< map.get(arr[j])){
                greatest = map.get(arr[j]);
            }
        }
        return greatest-smallest;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,2,3,3};
        System.out.println(findmin(arr));

    }
}
