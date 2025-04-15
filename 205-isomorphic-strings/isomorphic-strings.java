class Solution {
    public boolean isIsomorphic(String s, String t) {
        return Bhargav(s).equals( Bhargav(t));   
    }
    public  String Bhargav(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(!map.containsKey(ch))
            {
                map.put(ch,i);
            }
            sb.append(Integer.toString(map.get(ch)));
            sb.append("-");
        }
        return sb.toString();
    }
}