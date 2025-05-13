//Longest Common Subsequnce
//Dynamic programming using dp table
public class prg8 {
    public static void main(String[] args){
        String s1 = "abcdaf";
        String s2 = "acbcf";
        int res = lcs(s1,s2);
        System.out.print(res);
    }
    public static int lcs(String s1, String s2){
        int [][] dp = new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j] = 0;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
//Time complexity - O(m*n) for iteration purpose time takes for entire matrix
//space Complexity - O(m*n) for creating 2d dp array