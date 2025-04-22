class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
            Set <String>  bannedWordsadd = new HashSet<>();
            for( String bannedWord :  bannedWords)
            {
               bannedWordsadd.add(bannedWord);  
            }
            int count = 0;
            for(int i=0 ;i <message.length ; i++)
            { 
              if( bannedWordsadd.contains(message[i]))
              {
                 count++;
              }
              if(count == 2)
              {
                return true;
              }
            }
            return false;
        
    }
}