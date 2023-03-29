//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printSquare(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printSquare(int n) {
        // code here
        int top,left,right,bottom;
        for(int i=0;i<((2*n)-1);i++){
            for(int j=0;j<((2*n)-1);j++){
                top=i;
                left=j;
                right=(2*n)-2-i;
                bottom=(2*n)-2-j;
                System.out.print(n-Math.min(Math.min(left,right),Math.min(top,bottom))+" ");
            }
            System.out.println(" ");
        }
    }
}