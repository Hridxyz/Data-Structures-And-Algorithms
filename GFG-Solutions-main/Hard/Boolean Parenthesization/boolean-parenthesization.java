//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.countWays(N, S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int countWays(int N, String S){
        // The expression size must be odd (operators and operands)
        if (N % 2 == 0) return 0;
        
        // dp[i][j][0] stores the count of expressions resulting in FALSE
        // dp[i][j][1] stores the count of expressions resulting in TRUE
        int[][][] dp = new int[N][N][2];
        
        // Fill diagonal with operands (T or F)
        for (int i = 0; i < N; i += 2) {
            char operand = S.charAt(i);
            if (operand == 'T') {
                dp[i][i][1] = 1;
            } else {
                dp[i][i][0] = 1;
            }
        }
        
        // Fill dp table
        for (int length = 3; length <= N; length += 2) {
            for (int i = 0; i + length <= N; i += 2) {
                int j = i + length - 1;
                for (int k = i + 1; k < j; k += 2) {
                    char operator = S.charAt(k);
                    int totalIK = dp[i][k - 1][0] + dp[i][k - 1][1];
                    int totalKJ = dp[k + 1][j][0] + dp[k + 1][j][1];
                    
                    if (operator == '&') {
                        dp[i][j][0] += totalIK * totalKJ - dp[i][k - 1][1] * dp[k + 1][j][1];
                        dp[i][j][1] += dp[i][k - 1][1] * dp[k + 1][j][1];
                    } else if (operator == '|') {
                        dp[i][j][0] += dp[i][k - 1][0] * dp[k + 1][j][0];
                        dp[i][j][1] += totalIK * totalKJ - dp[i][k - 1][0] * dp[k + 1][j][0];
                    } else if (operator == '^') {
                        dp[i][j][0] += dp[i][k - 1][0] * dp[k + 1][j][0] + dp[i][k - 1][1] * dp[k + 1][j][1];
                        dp[i][j][1] += dp[i][k - 1][0] * dp[k + 1][j][1] + dp[i][k - 1][1] * dp[k + 1][j][0];
                    }
                    
                    dp[i][j][0] %= 1003;
                    dp[i][j][1] %= 1003;
                }
            }
        }
        
        return dp[0][N - 1][1];
    }
}