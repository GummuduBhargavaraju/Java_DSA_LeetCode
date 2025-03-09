class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> Bhargav2B = new HashMap<>();
        for(int i=0 ;i<nums.length;i++)
        {
            if(!Bhargav2B.containsKey(nums[i]))
            {
                Bhargav2B.put(nums[i] , i);
            }
            else{
                int diff = Math.abs(Bhargav2B.get(nums[i]) - i);
                if(diff <= k)
                {
                return true;
                }
                else{
                    Bhargav2B.put(nums[i] ,i);
                }
            }
        }
        return false;
        
    }
}