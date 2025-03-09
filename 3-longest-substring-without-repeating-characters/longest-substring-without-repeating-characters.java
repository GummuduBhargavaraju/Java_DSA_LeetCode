class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> Set= new HashSet<>();
        int Max =0;
        int Bhargav = 0;
        for(int Bhargav2B =0 ; Bhargav2B <s.length() ; Bhargav2B ++)
        {
           char ch = s.charAt(Bhargav2B);
           while(Set.contains(ch))
           {
            Set.remove(s.charAt(Bhargav));
            Bhargav ++;
           }
           Set.add(ch);
           int length = Bhargav2B - Bhargav +1;
            Max = Math.max(Max , length);

        }
        return Max;     
        
    }
}