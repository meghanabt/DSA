//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
   
	public int findK(int matrix[][], int r, int c, int k)
	{
	    // Your code goes here
	    ArrayList <Integer> arrl = new ArrayList<Integer>();
        int top =0;
        int bottom=r-1;
        int left =0;
        int right=c-1;
        while(top<=bottom && left<=right){
            for(int i=top; i<=right; i++){
                if(k==1){
                    return matrix[top][i];
                }
                k--;
            }
            top++;
            for(int i=top; i<=bottom; i++){
                if(k==1){
                    return matrix[i][right];
                }
                k--;
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    if(k==1){
                    return matrix[bottom][i];
                }
                k--;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    if(k==1){
                    return matrix[i][left];
                }
                k--;
                }
                left++;
            }
        }
        return -1;
	}
}