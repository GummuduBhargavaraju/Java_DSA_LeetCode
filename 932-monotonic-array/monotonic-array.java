class Solution {
    public boolean isMonotonic(int[] nums) {
         boolean isIncresing = true;
          boolean isDecresing = true;

          for(int i =1;i<nums.length;i++)
          {
            if( nums[i-1] > nums[i])
            {
                isIncresing = false;
            }
            if( nums[i-1] < nums[i])
            {
               isDecresing = false;
            }
          }
          if(isIncresing ||isDecresing  )
          {
            return true;
          }
          return false;
    }
}