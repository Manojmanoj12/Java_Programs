//Merging two sorted arrays into one
import java.util.*;
public class prg6 {
    public static void main(String[] args){
        int arr1[] = {1,3,5,7};
        int arr2[] = {2,4,6,8,9,20};
        merge(arr1,arr2);
    }
    public static void merge(int[] arr1,int[] arr2){
        int i = 0;
        int j = 0;
        List<Integer> li = new ArrayList<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                li.add(arr1[i++]);
            }
            else{
                li.add(arr2[j++]);
            }
        }
        while(i<arr1.length){
            li.add(arr1[i++]);
        }
        while(j<arr2.length){
            li.add(arr2[j++]);
        }
        System.out.println(li);
    }
}

//time and space = O(n+m) = > size of arr1 and arr2