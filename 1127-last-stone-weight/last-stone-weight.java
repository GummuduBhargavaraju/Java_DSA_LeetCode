class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pG = new  PriorityQueue<Integer>(
            new Comparator<Integer>()
            {
                public int compare(Integer a , Integer b)
                {
                    return b - a;
                }
            }
        );
        for(int i = 0 ; i < stones.length ; i++)
        {
            pG.add(stones[i]);
        }
        while(pG.size() > 1)
        {
          int stone1 = pG.poll();
          int stone2 = pG.poll();
          if(stone1  > stone2 )
          {
            pG.add(stone1 - stone2);
          }
        }
        if(pG.isEmpty())
        {
            return 0;
        }
        return pG.poll();

        
    }
}