//Right rotation array
import java.util.*;
public class prg5 {
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5};
        int k = 2;
        rotatearray(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotatearray(int[]arr,int k){
        int n = arr.length;
        k = k%n;
        rev(arr,0,n-1);
        rev(arr,0,k-1);
        rev(arr,k,n-1);
    }
    public static void rev(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]  = temp;
            start++;
            end--;
        }
    }
}
//rotating the array in a specified format
//time.c = O(n);
//space = O(1);