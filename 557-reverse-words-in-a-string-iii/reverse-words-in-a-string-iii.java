class Solution {
    public String reverseWords(String s) {
        String word[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for( int i=0;i<=word.length-2;i++)
        {
            String wordresvers3 = reversWordeach(word[i]);
            sb.append(wordresvers3 + " ");
        }
        String wordresvers4 = reversWordeach(word[word.length-1]);
        sb.append(wordresvers4);
        return sb.toString();
        
    }
    public String reversWordeach(String word)
    {
        String result = "";
       for(int i = word.length()-1;i>=0;i--)
       {
          result += word.charAt(i);
       }
       return result; 
    }
}