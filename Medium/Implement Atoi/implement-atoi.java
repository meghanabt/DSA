//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			System.out.println(obj.atoi(str));
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int number=0,sign=0, count=0,index=0;
    boolean isNegative=false;
    int atoi(String str) {
	// Your code here
	
	if(str.length()==0)
	return isNegative? -number : number;
	 
	if((Character.isDigit(str.charAt(0)) || str.charAt(0)== '+' || str.charAt(0)== '-') && count<2 )
	{
	    
	 if( (str.charAt(0)== '-' || str.charAt(0)== '+' ) )
	 {
	     if(index==0)
          {       
        isNegative=str.charAt(0)=='-' ? true : false;
        count++;
    	str=str.substring(1);
    	index++;
    	return atoi(str);
    
        }
        else{
    return -1;
        }
	 }

	 else{
    	number=number*10+str.charAt(0)-'0';
    	str=str.substring(1);
    	index++;
    	return	atoi(str);
	 }
	 

    	 
	}
	
	else 
	return -1;
	
	
    }
}
