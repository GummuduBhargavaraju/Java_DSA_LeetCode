class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points ,(a,b) ->Integer.compare(a[0],b[0]));

        int arrows = 1;

        int prevestar = points[0][0];
        int preveend = points[0][1];

        for(int i=1;i<points.length;i++)
        {
            int currtstart = points[i][0];
            int currtEnd = points[i][1];

            if(currtstart > preveend)
            {
                arrows++;
                prevestar = currtstart;
                preveend  =  currtEnd;
            }
            else{
                prevestar = Math.max(prevestar , currtstart);
                preveend  = Math.min( preveend  , currtEnd);
            }
        }

        return arrows;

        
    }
}