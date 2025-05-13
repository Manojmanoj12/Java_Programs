import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int originalnumber=num;
        int temp,sum=0,digits=0;
        temp=num;
        while(temp>0){
            digits++;
            temp/=10;
        }
        temp=num;
        while(temp>0){
            int digit=temp%10;
            sum+=Math.pow(digit, digits);
            temp/=10;
        }
        if(sum == originalnumber) {
            System.out.println(originalnumber + " is an Armstrong number.");
        } else {
            System.out.println(originalnumber + " is not an Armstrong number.");
        }

    }
}
