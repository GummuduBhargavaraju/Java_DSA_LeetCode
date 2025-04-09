class Solution {
    public int missingNumber(int[] nums) {
        int n  = nums.length;
        int sumBhargav = 0;
        for(int i = 0; i < nums.length;i++)
        {
            sumBhargav += nums[i];
        }
        int sumBhargav2 = (n*(n+1))/2 ;
        int missingnumber =  sumBhargav2 - sumBhargav;
        return  missingnumber;
    }
    
    
}