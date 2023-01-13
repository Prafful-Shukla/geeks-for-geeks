//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.findElement(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Compute {
    public int findElement(int arr[], int n){
        
        int max=arr[0];//
        int min=arr[n-1];//
        
        Stack<Integer> st=new Stack<>();
        
        for(int i=n-1;i>=1;i--){
            min=Math.min(min,arr[i]);
            st.push(min);
        }

        
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<=st.peek() && arr[i]>=max){
                //System.out.print("yes");
                   return arr[i];
            }
            st.pop();
            max=Math.max(max,arr[i]);
        }
        return -1;
        
        
    }
    
    // (min)
    // //2,4-----2min
    // 2,5-----2min  1
    // 5,7  ---5min  2
    // 7,max---7min  3
       
       
       
        
        
}
