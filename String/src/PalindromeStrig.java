public class PalindromeStrig {
    public void isPalindrome(char[] arr){
     int l = 0;
     int h = arr.length-1;
     while(l < h){
         if(arr[l++] != arr[h--]){
             System.out.println("The given word is not palindrome");
             return;
         }
     }
        System.out.println("It is palindrome");
    }
}
