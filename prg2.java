public class prg2 {
    public static int kadane(int[] arr){
        //sum adds contiguous values 
        int sum = 0;
        //fixing max vakue for finding final element
        //largest number in given array
        int maxval = Integer.MIN_VALUE;
        for(int num:arr){
            maxval = Math.max(maxval,num);//assign the max value to min value
        }
        for(int i=0;i<arr.length;i++){
            //if the two contiguous number added result in negative it should be reinitialized with zero
            if(arr[i]+sum <0){
                sum=0;
                //then cont with next subarray
                continue;
            }
            else{
                //if positive sub it will add and check for maxval
                sum+=arr[i];
                maxval = Math.max(sum,maxval);//checks the max value
            }
        }
        //finally returns maxvalue
        return maxval;
    }
    public static void main(String[] args){
        //use scanner for user inputs
        int[] arr = {1,2,-4,3,1};
        int res = kadane(arr);
        System.out.println(res);
    }
}
//OUTPUT = 4 {3,1};
//Time Complexity - O(1) for finding maxval