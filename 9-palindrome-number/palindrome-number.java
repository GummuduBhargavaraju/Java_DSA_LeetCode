class Solution {
    private static boolean checkpalindrom(String num)
    {
        int Bhargav = 0;
        int Bhargav2B =num.length()-1;
        while( Bhargav <  Bhargav2B)
        {
            if(num.charAt(Bhargav) != num.charAt( Bhargav2B))
            {
                return false;
            }
            Bhargav ++;
            Bhargav2B --;
        }
        return true;
    }
    public boolean isPalindrome(int x) {
        if( x < 0)
        {
            return false;
        }
        String num = x + "";
        return checkpalindrom(num);
         
         
    

    }
}