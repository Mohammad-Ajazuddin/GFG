//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            long N;
            N = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            long res = obj.countBits(N);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

//1-N Nos in Binary form and counting No. of 1's
class Solution {
    public static long countBits(long N) {
        // code here
        // ArrayList<Long> BinaryNo=new ArrayList<Long>();
        // for(long n=1;n<=N;n++)
        // {
        //     long t=n;
        //     while(t>0)
        //     {
        //         BinaryNo.add(t%2);
        //         t=t/2;
        //     }
        // }
        // long count=0;
        // for(int i=0;i<BinaryNo.size();i++)
        // {
        //     if(BinaryNo.get(i)==1)
        //     {
        //         count++;
        //     }
        // }
        // return count;
        //TLE
        
        
        StringBuffer BinStr=new StringBuffer();
        for(long n=1;n<=N;n++)
        {
            BinStr.append(Long.toBinaryString(n));
        }
        long count=0;
        for(int i=0;i<BinStr.length();i++)
        {
            if(BinStr.charAt(i)=='1')
            {
                count++;
            }
        }
        return count;
    }
}
        
