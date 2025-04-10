class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleBhargavsum = 0 ;
        int doubleBhargavsum2 = 0;
        for(int i = 0 ; i<nums.length;i++)
        {
            if(nums[i] < 10)
            {
                 singleBhargavsum += nums[i];
            }
            else
            {
                 doubleBhargavsum2 +=nums[i];
            }
        }
        return (singleBhargavsum != doubleBhargavsum2) ? true: false ;
        
    }
}