class Solution {
    public int[] rearrangeArray(int[] nums) {
        int result[] = new int [nums.length];
        int posBhargav = 0; int negbhargav = 1;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i] > 0)
            {
                result[posBhargav] = nums[i];
                posBhargav = posBhargav +2;
            }
            else{
                
                result[negbhargav] = nums[i];
                negbhargav = negbhargav +2;

            }

        }
        return result;
        
    }
}