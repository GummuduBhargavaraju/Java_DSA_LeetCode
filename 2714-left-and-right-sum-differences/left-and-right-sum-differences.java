class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftsum [] = new int[nums.length];
        int rightsum [] = new int[nums.length];
         leftsum[0] = 0;
         rightsum[nums.length-1] = 0;
        int r_index = 0 ; int l_index = 1;
        for(int i = 1; i<nums.length; i++)
        {
            leftsum[l_index++] = sumofArray(nums , 0 , i-1);
        }
         for(int i =0; i<nums.length ; i++)
        {
            rightsum[r_index++] = sumofArray(nums , i+1 , nums.length-1);
        }
        int [] answer = new int[nums.length];
        for(int i = 0 ;i<answer.length;i++)
        {
            answer[i] = Math.abs(rightsum[i] - leftsum[i]);
            
        }
        return answer;
    }
    private  static int sumofArray(int nums [] , int start , int end)
    {
        int sum = 0;
        for(int i = start; i <= end ; i++)
        {
            sum += nums[i];
        }
        return sum;
    }  
    
}