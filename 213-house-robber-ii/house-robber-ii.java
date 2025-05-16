class Solution {
    public int rob(int[] nums) {
        if (nums.length < 2)
        {
            return nums[0];
        }

        int [] dp1 = new int [nums.length-1];
        int [] dp2  = new int [ nums.length -1];

        for(int i = 0 ; i<nums.length-1 ; i++)
        {
             dp1[i] = nums[i];
             dp2[i] = nums[i+1];
        }

        int dp1Max = robHouse(dp1);
        int dp2Max = robHouse(dp2);

        int Max = Math.max(dp1Max , dp2Max);

        return Max;
    }
    private int robHouse(int[] nums) {
        if(nums.length <2)
        {
            return nums[0];
        }

        int [] dp = new int [nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i = 2 ; i< nums.length ; i++)
        {
          dp[i] = Math.max(dp[i-2] + nums[i] , dp[i-1]);
        }
        return dp[nums.length-1];
        
    }

}