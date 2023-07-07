//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Pair ans = new Solve().getFloorAndCeil(arr, n, x);
            System.out.println(ans.floor + " " + ans.ceil);
        }
    }
}

class Pair {
    int floor, ceil;

    Pair() {
        this.floor = 0;
        this.ceil = 0;
    }

    Pair(int floor, int ceil) {
        this.floor = floor;
        this.ceil = ceil;
    }
}

// } Driver Code Ends


//User function Template for Java




class Solve {
    
    public static int findCeil(int arr[], int n, int x){
        int s = 0;
        int e = n-1;
        int mid = s+((e-s)/2);
        
        while(s<=e){
            
            if(arr[mid] == x){
                return arr[mid];
            }
            else if(arr[mid] < x){
                s = mid+1;
            }
            else if(arr[mid] > x){
                e = mid-1;
            }
            mid = s+((e-s)/2);
        }
        
        if(arr[n-1] < x){
            return -1;
        }
        
        return arr[mid];
    }
    
    public static int findFloor(int arr[], int n, int x)
    {
        int s = 0;
        int e = n-1;
        int mid = s+((e-s)/2);
        
        while(s<=e){
            
            if(arr[mid] == x){
                return arr[mid];
            }
            else if(arr[mid] < x){
                s = mid+1;
            }
            else if(arr[mid] > x){
                e = mid-1;
            }
            mid = s+((e-s)/2);
        }
        
        if(arr[0] > x){
            return -1;
        }
        
        return arr[mid-1];
        
    }
    
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        Arrays.sort(arr);
        return new Pair(findFloor(arr,n,x),findCeil(arr,n,x));
    }
     
}

