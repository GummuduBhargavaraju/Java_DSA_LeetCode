class Solution {
    public int majorityElement(int[] nums) {
        int bhargavVote = 0;
        int Candidate = 0;
        for (int i=0;i<nums.length;i++)
        {
            if(bhargavVote == 0)
            {
                 Candidate = nums[i];
                 bhargavVote = 1;
            }
            else{
                if(Candidate == nums[i])
                {
                   bhargavVote++; 
                }
                else{
                    bhargavVote--;
                }
            }
        }
        return Candidate;
    }
}