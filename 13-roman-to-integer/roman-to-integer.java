class Solution {
    public int romanToInt(String s) {
            Map <Character,Integer> Bhargav = new HashMap<>();
            Bhargav.put('I',1);
            Bhargav.put('V',5);
            Bhargav.put('X',10);
            Bhargav.put('L',50); 
            Bhargav.put('C',100);
            Bhargav.put('D',500);
            Bhargav.put('M',1000);

            char [] chars = s.toCharArray();
           int result =0;
            int i,j;
            for(i=0, j=1; j<chars.length; i++ ,j++)
            {
                if(Bhargav.get(chars[i]) >= Bhargav.get(chars[j]))
                {
                    result +=  Bhargav.get(chars[i]);
                }
                else{
                    result -= Bhargav.get(chars[i]);
                }
            }
            result += Bhargav.get(chars[i]);
            return result; 
        }   
        
    }