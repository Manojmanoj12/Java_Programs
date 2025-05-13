//Two pointer technique
public class prg3{
    public static int[] twosum(int[] arr, int target){
        //using two pointers low and high as start and end
        int low =0,high = arr.length-1;
        while(low<high){
            int sum = arr[low] + arr[high];
            if(sum == target){//checks the condition
                return new int[]{arr[low],arr[high]};
            }
            else if(sum<target){
                low++;
            }
            else{
                high--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int target = 6;
        int res[] = twosum(arr,target);
        System.out.println(res[0]+","+res[1]);
    }
}
//time complexity = O(n)
//space complexity = O(1)


