class Solution {
    public int search(int[] nums, int target) {
        int Bhargav2B = 0;
        int Bhargav1 = 0;
        int Bhargav2 = nums.length-1;
        while(Bhargav1 <= Bhargav2)
        {
            Bhargav2B = (Bhargav2 + Bhargav1)/2;
            if(nums[Bhargav2B] == target)
            {
                return Bhargav2B;
            }
            else if(target < nums[Bhargav2B])
            {
                   Bhargav2 = Bhargav2B -1;
            }
            else
            {
                Bhargav1 = Bhargav2B +1;
            }

        }
        return -1;
        
    }
}