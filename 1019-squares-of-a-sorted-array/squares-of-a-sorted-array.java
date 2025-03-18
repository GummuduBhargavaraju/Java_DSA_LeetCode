class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] result = new int [nums.length];
        int left = 0;
        int right = nums.length-1;
        for( int i = nums.length-1 ; i >= 0 ;i--)
        {
            int leftSquares = nums[left] * nums[left];
            int rightSquares = nums[right] * nums [right];
            if(leftSquares > rightSquares)
            {
               result[i] = leftSquares;
               left++; 
            }
            else
            {
              result[i] =  rightSquares;
              right--;   
            }
        }
        return result;

        
    }
}