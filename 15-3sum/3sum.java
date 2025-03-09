class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3)
        {
            return new  ArrayList<>();
        }
         Set<List<Integer>> Bhargav2B = new HashSet<>();
         Arrays.sort(nums);
         for(int i=0 ;i<nums.length-2;i++)
         {
            int j = i+1;
            int k = nums.length-1;
            while(j < k)
            {
                int sum = nums[i] + nums[j] + nums[k];
               List <Integer> Bhargav = new ArrayList<>();
               if(sum ==0)
               {
                Bhargav.add(nums[i]);
                Bhargav.add(nums[j]);
                Bhargav.add(nums[k]);
                j++;
                k--;
                 Bhargav2B.add(Bhargav);
               }
               else if(sum > 0)
               {
                k--;
               }
               else
               {
                j++;
               }
            }           
         }
         return new ArrayList<List<Integer>>( Bhargav2B);
        
    }
}