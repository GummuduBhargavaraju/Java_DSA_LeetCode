class Solution {
    public int lengthOfLIS(int[] nums) {

        int [] D = new int [nums.length];

        for(int i = 1; i<nums.length;i++)
        {
            for(int j = 0 ; j<i;j++)
            {
                if(nums[i] > nums[j])
                {
                    if(D[j]+1 > D[i])
                    {
                        D[i] = D[j]+1;
                    }
                }
            }
        }

        int maxLength = 0;
        for(int i = 0; i<D.length ; i++)
        {
            if(D[i] > D[maxLength])
            {
                 D[maxLength] = D[i] ;
            }
        }

        return D[maxLength]+1;
        
    }
}