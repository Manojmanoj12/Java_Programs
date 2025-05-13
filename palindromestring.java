import java.util.Scanner;

public class palindromestring {
    public static void main(String args[]) {
        String str1 = "";
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        if(str.equals(str1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
}
}
