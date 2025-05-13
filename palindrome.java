import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int n, sum = 0, r, temp;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}