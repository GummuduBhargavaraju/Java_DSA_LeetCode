class Solution {
    public int maxSum(int[] nums) {
        int max = -1;
        for(int i = 0; i<nums.length ; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if( maxdigits(nums[i]) ==  maxdigits(nums[j]))
                {
                    max = Math.max(max , (nums[i] + nums[j]));
                }
            }
        }
        return max;
        
        
    }
    private int maxdigits(int nums)
    {
        int maxdigt = 0;
        while (nums != 0)
        {
            if((nums%10) > maxdigt )
            {
                maxdigt = nums%10;
            }
            nums = nums/10;
        }
        
        return  maxdigt;
    }
}