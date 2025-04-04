class Solution {
    public void sortColors(int[] nums) {
        int ZeroPointer = 0;
        int lastPointer = nums.length-1;
        int i =0;
        while(i <= lastPointer)
        {
            if(nums[i] == 0)
            {
                swap(nums, i ,  ZeroPointer);
                i++;
                ZeroPointer++;
            }
            else if(nums[i] == 2)
            {
                swap(nums , i ,lastPointer);
                lastPointer--;
            }
            else{
                i++;
            }
        }
    }
    public void swap ( int nums[] ,int nums1 , int nums2)
    {
        int temp = nums[nums1];
        nums[nums1] = nums[nums2];
        nums[nums2] =  temp;

    }
}