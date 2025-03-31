class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] bhargav = new int [2*nums.length];
        for(int i = 0; i< nums .length;i++)
        {
            bhargav[i] = nums[i];
        }
        int Bhargav2B = nums.length;
        for(int i = 0 ;i<nums.length;i++)
        {
            bhargav[Bhargav2B] = nums[i];
            Bhargav2B ++;
        }
        return bhargav;
    }
}