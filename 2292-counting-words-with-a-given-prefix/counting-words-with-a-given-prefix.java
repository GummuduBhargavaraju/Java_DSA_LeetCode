class Solution {
    public int prefixCount(String[] words, String pref) {
        int pref_leng = pref.length();
        int count = 0;
        for(int i =0; i< words.length;i++)
        {
            if(words[i].length() >= pref_leng )
            {
                String checkprefx = words[i].substring(0, pref_leng );
                if(pref.equals(checkprefx))
                {
                    count ++;
                }
            }
        }
        return count;
        
    }
}