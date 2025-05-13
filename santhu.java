import java.util.Scanner;
public class {
    public static void main(String[] args) {
        int n,sum=0,r,temp;
        temp=num;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.System.out.println("Palindrome");
        }else{
            System.System.out.println("Not a Palindrome");
        }
    }
}