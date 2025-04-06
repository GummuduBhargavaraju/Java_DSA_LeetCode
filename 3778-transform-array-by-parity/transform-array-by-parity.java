class Solution {
    public int[] transformArray(int[] nums) {
        int [] res = new int [nums.length];
        int Evencount = 0;
        for(int i = 0 ; i< nums.length;i++)
        {
            if(nums[i] %2 == 0)
            {
              Evencount ++;  
            }
        }
        int index = 0;
        while(Evencount != 0)
        {
            res[index] = 0;
            index ++;
            Evencount --;
        }
        for(int i = index ; i<res.length ; i++)
        {
            res[i] = 1;
        }
        return res;
    }
}