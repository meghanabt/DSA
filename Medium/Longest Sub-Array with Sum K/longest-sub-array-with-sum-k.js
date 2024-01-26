//{ Driver Code Starts
//Initial Template for javascript

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();
});

function readLine() {
    return inputString[currentLine++];
}

function printList(res,n){
    let s="";
    for(let i=0;i<n;i++){
        s+=res[i];
        s+=" ";
    }
    console.log(s);
}


function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++)
    {
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        let n = input_ar1[0];
        let k = input_ar1[1];
        let arr = new Array(n);
        input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        for(let i=0;i<n;i++){
            arr[i] = input_ar1[i];
        }
        let obj = new Solution();
        let res = obj.lenOfLongSubarr(arr, n, k);
        console.log(res);
        
    }
}// } Driver Code Ends



// } Driver Code Ends


//User function Template for javascript


/**
 * @param {number[]} arr
 * @param {number} n
 * @param {number} k
 * @returns {number}
*/

class Solution{ 
    lenOfLongSubarr(arr,n, k){
        //code here
        var prefSum=0
        var maxLen=0
        var map=new Map();
        for(let i=0;i<n;i++)
        {
            prefSum+=arr[i];
            
            if(prefSum==k)
            {
                maxLen=Math.max(maxLen,i+1)
            }
            
            let rem=prefSum-k
            
            if(map.has(rem))
            {
                maxLen=Math.max(maxLen, i-map.get(rem))
            }
            if(!map.has(prefSum))
            {
                map.set(prefSum,i)
            }

      
            
        }
        return maxLen;
    }
}
