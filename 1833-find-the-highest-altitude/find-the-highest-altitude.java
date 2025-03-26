class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int currt = 0;
        for(int i =0;i<gain.length;i++)
        {
            currt += gain[i];
            max = Math.max(max , currt);
        }
        return max;
        
    }
}