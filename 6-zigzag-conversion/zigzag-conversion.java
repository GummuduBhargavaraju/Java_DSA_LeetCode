class Solution {
    public String convert(String s, int numRows) {
        String [] str = new String[numRows];
           for( int i=0; i<numRows; i++)
           {
                 str[i] = "";
           }
           int i = 0;
           while( i < s.length())
           {
             for( int index = 0; index<numRows && i < s.length(); index++)
             {
                str[index] += s.charAt(i++);
             }
             for(int index = numRows-2; index > 0 && i< s.length(); index --)
             {
                str[index] += s.charAt(i++);
             }
           }
           String res = "";
           for(String ent : str)
           {
             res += ent;
           }
           return res;

        
    }
}