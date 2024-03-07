
/**
 * @param {number} n
 * @return {number}
 */
var countGoodNumbers = function(n) {
    let ev=BigInt(Math.floor(n/2)+n%2)
    let od=BigInt(Math.floor(n/2))
    
    let evN=5n,odN=4n
    let mod=1000000007n
    function eve(ev){
        if(ev==0n)return 1
        if(ev==1n)return evN%mod
        if(ev%2n==0n){
            let temp =eve(ev/2n)
            return (temp*temp)%mod
            
        }
        else{
             let temp =eve(ev/2n)
             return (((temp*temp)%mod)*evN)%mod
        }
    }
    function odd(od){
        if(od==0n)return 1n
        if(od==1n)return odN%mod
        if(od%2n==0n){
            let temp =odd(od/2n)
            return (temp*temp)%mod
            
        }
        else{
             let temp =odd(od/2n)
             return(((temp*temp)%mod)*odN)%mod
        }
    }
    
    return (eve(ev)*odd(od))%mod
    
};