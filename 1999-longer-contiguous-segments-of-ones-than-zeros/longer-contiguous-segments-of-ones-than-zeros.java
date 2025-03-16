class Solution {
    public boolean checkZeroOnes(String s) {
        int onesCount = 0; int ZeroCount = 0;
        int MaxOnes = 0;    int MaxZero = 0;
        for(int i=0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '1')
            {
               onesCount ++;
               ZeroCount = 0;
            }
            else
            {
                ZeroCount ++;
                onesCount = 0;
            }
             MaxOnes = Math.max(MaxOnes ,onesCount);
             MaxZero = Math.max (MaxZero ,ZeroCount); 
        }
         if( MaxOnes > MaxZero )
         {
           return true;
         }
        return false;
    }
}