class Solution {
    public void rotate(int[] nums, int k) {
        int bhargavlength= nums.length;
        int [] resultbahrgav = new int [bhargavlength];
        for(int i=0;i<nums.length;i++)
        {
           resultbahrgav[(i+k) % bhargavlength] = nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i] =resultbahrgav[i];
        }
        
    }
}