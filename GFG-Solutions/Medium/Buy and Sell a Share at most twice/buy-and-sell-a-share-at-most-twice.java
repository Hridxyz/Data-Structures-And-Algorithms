//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine().trim());
            
            
            int[] price = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.maxProfit(n, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int maxProfit(int n, int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int[] profit = new int[n];
        for (int i=0; i<n; i++) {
            profit[i] = 0;
        }

        // Maximum profit if only one transaction is allowed
        int max_price = prices[n-1];
        for (int i=n-2; i>=0; i--) {
            if (prices[i] > max_price) {
                max_price = prices[i];
            }
            profit[i] = Math.max(profit[i+1], max_price - prices[i]);
        }

        // Add the profit of the second transaction
        int min_price = prices[0];
        for (int i=1; i<n; i++) {
            if (prices[i] < min_price) {
                min_price = prices[i];
            }
            profit[i] = Math.max(profit[i-1], profit[i] + (prices[i] - min_price));
        }

        return profit[n-1];
    }
}
        
