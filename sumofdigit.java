import java.util.*;
public class sumofdigit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem,sum=0;
        while(num>0){
            rem=num%10;
            sum+=rem;
            num=num/10;
        }
        System.out.println(sum);
    }
}
