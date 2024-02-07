/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {

    let minPrice= Number.MAX_VALUE
    let maxPrice= Number.MIN_VALUE

    for( let price of prices)
    {
        minPrice= Math.min(minPrice, price)
        maxPrice=Math.max(maxPrice,price-minPrice)
    }
    return maxPrice
    
};