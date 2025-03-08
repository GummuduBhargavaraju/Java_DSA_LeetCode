class Solution {
    public boolean containsDuplicate(int[] nums) {
   // bhargav first create a hashset to store the elements for array
     HashSet<Integer>   BhargavSearchHashSet = new HashSet<>(); //HashSet Duplicates not allows
     // Iterate through each element in the array
     for(int num : nums){
     // check if the element is already in the Hashset
        if(BhargavSearchHashSet.contains(num)) {
            return true;                                  //(this code ---> Time cpxty =O(n))
        }                       //(space complexity = O(n)...why..this is  linear search       
         //Add the element to the HashSet
         BhargavSearchHashSet.add(num);
     }
     //If every element is not a twice return false
     return false;
        
        
    }
    
}