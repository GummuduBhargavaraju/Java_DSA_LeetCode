class Solution {
    public List<String> buildArray(int[] target, int n) {

         List<String> Bhargav_2B = new ArrayList<>();
         int input = 1;
         for(int num : target)
         {
            while(input < num)
            {
                Bhargav_2B.add("Push");
                Bhargav_2B.add("Pop");
                input++;
            }
             Bhargav_2B.add("Push");
             input++;
         }
         return Bhargav_2B;
    }
}