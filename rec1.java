public class rec1{
    static void santhu(int n){
    if(n == 0){
    return;
    }
   
   santhu(n-1);
   System.out.print(n + " ");

    

    }

    public static void main (String[] args){
      santhu(5);
    }
}