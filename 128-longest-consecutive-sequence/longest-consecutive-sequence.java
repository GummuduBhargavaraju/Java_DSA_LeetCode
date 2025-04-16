class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer , Boolean> map = new HashMap<>();
        int currentlength = 0;
    
        for(int num : nums)
        {
            map.put(num , Boolean.FALSE);
        }

        for( int num : nums)
        {
            int curtLength = 1;
            int  Bhargav = num + 1;
            while(map.containsKey(Bhargav) && map.get(Bhargav) == false )
            {
                 curtLength ++;
                 map.put(Bhargav , Boolean.TRUE);
                 Bhargav++;
            }
            int Bhargav1 = num -1;
             while(map.containsKey(Bhargav1) && map.get(Bhargav1) == false)
            {
                 curtLength ++;
                 map.put(Bhargav1 , Boolean.TRUE);
                 Bhargav1--;
            }

            currentlength = Math.max(currentlength , curtLength);  
        }
        return currentlength;    
    }
}