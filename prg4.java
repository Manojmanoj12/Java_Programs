//Sliding Window problem
import java.util.*;
public class prg4 {
    public static int slidingwindow(String s){
        int start = 0;
        int end = 0;
        int maxval = Math.min(s.length(),1);
        Set<Character> seen = new HashSet<Character>();
        while(end<s.length()){
            char c = s.charAt(end);
            while(seen.contains(c)){
                seen.remove(s.charAt(start));
                start+=1;
            }
            seen.add(c);
            int window = end-start+1;
            maxval = Math.max(window,maxval);
            end+=1;
        }
        return maxval;
    }
    public static void main(String[] args){
        String s = "aababcd";
        int res = slidingwindow(s);
        System.out.println(res);
    }
}
//most important concepts in DSA