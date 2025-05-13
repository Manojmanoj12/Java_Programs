public class rec2{
    static int sum = 0;
    static void santhu(int n){
        
        if(n==0){
            return;
        }
        sum += n;
        santhu(n-1);
       
    }
    public static void main(String[] args){  
        santhu(15);
        System.out.print(sum);
    }
}