class Solution {
    public int findPeakElement(int[] nums) {
        int Bhargav2B = 0;
        int Bhargav1 =0;
        int Bhargav2 = nums.length-1;
        while(Bhargav1 < Bhargav2)
        {
            Bhargav2B = (Bhargav1 + Bhargav2)/2;
            if(nums[Bhargav2B] < nums[Bhargav2B + 1])
            {
                Bhargav1 = Bhargav2B + 1;  
            }
            else{
                Bhargav2 = Bhargav2B;
            }
        }
        return  Bhargav1;
        
    }
}