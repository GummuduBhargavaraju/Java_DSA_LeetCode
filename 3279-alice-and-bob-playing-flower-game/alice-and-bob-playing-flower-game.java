class Solution {
    public long flowerGame(int n, int m) {
        long nodd_bhargav = (n + 1) /2;
        long neven_bhargav = n/2;
        long modd_bhargav = (m + 1) /2;
        long meven_bhargav = m/2;
        return neven_bhargav * modd_bhargav + nodd_bhargav * meven_bhargav;
        
        
    }
}