//checking a string is palindrome or not
public class prg7 {
    public static boolean pali(String s){
        int left = 0,right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] arg){
        String s = "racecaR";
        Boolean res = pali(s);
        if(res){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
//Time complexity = O(n) - refers to string size
//space complexity = O(1) - no new string created for checking