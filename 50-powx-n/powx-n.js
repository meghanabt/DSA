/**
 * @param {number} x
 * @param {number} n
 * @return {number}
 */
var myPow = function(x, n) {

    let ans=1
    let nn=n

    if(n<0) nn=nn*-1

    while(nn)
    {
        if(nn%2)
        {
            ans=ans*x
            nn=nn-1
        }
        else{
            x=x*x;
            nn=nn/2;
        }


        
    }

    if(n<0) return ans=1/ans
    
    return ans
    
};