class Solution {
    public int missingNumber(int[] nums) {
        int xor1=0, xor2=0;
        int N= nums.length+1;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ nums[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
      
        return (xor1 ^ xor2); // the missing number
    }
}