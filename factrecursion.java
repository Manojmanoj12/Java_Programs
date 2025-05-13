import java.util.Scanner;

public class factrecursion {
    
    public static int fact(int num){
        if(num==0||num==1){
        return 1;
        }else{
        return num*fact(num-1);
    }
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int s= fact(num);
        System.out.print("Factorial is "+ s);
    }
}
