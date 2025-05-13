import java.util.Scanner;

public class primeornot {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.print("Not a prime");
                break;
            }else{
                System.out.print("Prime");
                break;
            }
        }
    }
}
