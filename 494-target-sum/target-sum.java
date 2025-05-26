class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        Map<Integer, Integer> dp = new HashMap<>();

        dp.put(0,1);

        for(int num : nums)
        {

            Map<Integer , Integer> nextdp = new HashMap<>();

            for(int sum : dp.keySet())
            {
                int count = dp.get(sum);

                nextdp.put(sum+num , nextdp.getOrDefault(sum+num ,0)+count);
                nextdp.put(sum-num , nextdp.getOrDefault(sum-num ,0)+count);
            }
            dp = nextdp;
        }

        return dp.getOrDefault(target,0);
        
    }
}


/*dp.put(0,1)--> 0 sume defaultvalur and 1 count
k ---> method key value small ---> S --> capatil */