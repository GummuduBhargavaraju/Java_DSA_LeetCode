class Solution {
    public int minDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        int [][] Dp = new int [m+1][n+1];

        for(int i = 1 ;i<=m ; i++)
        {
             Dp[i][0]= i;
        }
        for(int j = 1 ;j<=n ; j++)
        {
            Dp[0][j] = j;
        }

        for(int i = 1;i<=m ; i++)
        {
            for(int j = 1 ; j<= n ; j++)
            {
                if(word1.charAt(i-1) == word2.charAt(j-1))
                {
                    Dp[i][j] = Dp[i-1][j-1]; 
                }
                else{
                    int topLeft = Dp[i-1][j-1];
                    int top = Dp[i-1][j];
                    int left = Dp[i][j-1];

                    Dp[i][j] = Math.min(topLeft , Math.min(top , left))+1;
                }
            }
        }
        return Dp[m][n];
        
    }
}