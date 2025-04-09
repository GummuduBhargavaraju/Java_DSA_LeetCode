class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
        {
            return false;
        }
        int Bhargav = Integer.bitCount(n);
        if(Bhargav == 1)
        {
            return true;
        }
        return false;
        
    }
}