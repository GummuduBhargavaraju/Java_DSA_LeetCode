class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int lastindex = nums[nums.length-1];
        int last2index = nums[nums.length-2];
        int result =  (lastindex - 1)*(last2index - 1);
        return result;
        
    }
}