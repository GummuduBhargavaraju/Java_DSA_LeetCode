class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxword = 0;
        for(String sentence : sentences )
        {
            int count = 0;
            String [] words = sentence.split(" ");
            count = words.length;
             maxword = Math.max( count , maxword );
        }
        return maxword;
        
    }
}