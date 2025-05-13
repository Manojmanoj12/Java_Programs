import java.util.*;
public class factorial {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int fact=1;
        int num =sc.nextInt();
        if(num==0 ||num==1){
            System.out.print("Factorial:1");
        }else{
            for(int i=1;i<=num;i++){
                fact=fact*i;
            }
            System.out.print("Factorial is"+fact);
        }
    }
}
