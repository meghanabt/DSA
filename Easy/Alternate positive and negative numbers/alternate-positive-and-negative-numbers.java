//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
 
       ArrayList<Integer> pos=new ArrayList<Integer>();
      ArrayList<Integer> neg=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
           if(arr[i]<0){
               neg.add(arr[i]);
           }else{
               pos.add(arr[i]);
           }
        }
        int p=0,ne=0;
        
        for(int i=0 ;i<n;i++){
            if(i%2==0 && p<pos.size()){
                arr[i]=pos.get(p++);
            }else if(ne<neg.size()){
                arr[i]=neg.get(ne++);
            }else{
                if(pos.size()>neg.size()){
                arr[i]=pos.get(p++);
            }else{
                arr[i]=neg.get(ne++);
            }
            } 
        }
                

    }
}