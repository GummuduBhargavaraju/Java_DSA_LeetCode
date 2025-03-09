class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
       LinkedList<int[]> Bhargav2B=  new LinkedList<>();
       int i=0;
       while(i<intervals.length && intervals[i][1] < newInterval[0])
       {
       Bhargav2B.add(intervals[i]);
       i++;
       }
       while(i < intervals.length && intervals[i][0] <= newInterval[1] )
       {
        newInterval[0]=Math.min(intervals[i][0], newInterval[0]);
        newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
        i++;
       }
       Bhargav2B.add(newInterval);
       while(i < intervals.length)
       {
        Bhargav2B.add(intervals[i]);
        i++;
       }
       return Bhargav2B.toArray(new int[Bhargav2B.size()][]);
       
        
    }
}