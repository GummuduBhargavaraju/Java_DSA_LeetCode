class Solution {
    public int diagonalSum(int[][] mat) {
        int Bhargav = mat.length;
        int sum = 0;
        for(int i=0 ; i<Bhargav ; i++)
        {
            sum += mat[i][i];
            sum += mat[Bhargav - 1 -i][i];
        }
        if(Bhargav %2 != 0)
        {
            sum  -= mat[Bhargav/2][Bhargav/2];
        }
        return sum;
        
    }
}