class Solution {
    public boolean detectCapitalUse(String word) {
       if(AllCaps( word) ||AllLower(word) ||substring(word))
       {
        return true;
       } 
       return false;
    }
    private boolean AllCaps(String word)
    {
        int count = 0;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch))
            {
                 count ++;
            }
        }
         if(word.length() == count )
        {
            return true;
        }  
        return false;
    }
     private boolean AllLower(String word)
    {
        int count =0;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch))
            {
                 count ++;
            }
        }
        if(word.length() == count )
        {
            return true;
        }  
        return false;
    }
    private boolean substring(String word)
    {
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(0);
            String subString = word.substring(1);
            if(Character.isUpperCase(ch) && AllLower(subString))
            {
                return true;
            }
        }
        return false;
    } 
}