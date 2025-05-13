import java.util.Scanner;

class prg11{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            int sum = i+1;
            System.out.println("Enter the " + sum + " number : ");
            arr[i] = sc.nextInt();
        }

        for(int array : arr){
            System.out.print(array+" ");
        }
    }
}