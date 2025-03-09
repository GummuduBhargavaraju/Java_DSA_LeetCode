class Solution {
    public int evalRPN(String[] tokens) {
      Stack <String> Bhargav2B = new Stack<>();
      for(String token : tokens)
      {
          if(isOpearter(token))
          {
                int num2 = Integer.parseInt(Bhargav2B .pop());
                int num1 = Integer.parseInt(Bhargav2B .pop());
                int Bhargav = 0;
                if(token.equals("+"))
                {
                    Bhargav = num1+ num2;
                }
                else if (token.equals("-"))
                {
                    Bhargav  = num1 - num2;
                }
                else if (token.equals("*"))
                {
                    Bhargav = num1 * num2;
                }
                else if (token.equals("/"))
                {
                    Bhargav = num1 / num2;
                }
                Bhargav2B .push(Integer.toString( Bhargav));
            
            }
            else
            {
              Bhargav2B.push(token);
            }
        }
      return Integer.parseInt(Bhargav2B.peek());
        
    }
    private boolean isOpearter(String strs)
    {
        if(strs.equals("+") || strs.equals("-")  || strs.equals("*")  || strs.equals("/"))
        {
            return true;
        }
        return false;
    }
}