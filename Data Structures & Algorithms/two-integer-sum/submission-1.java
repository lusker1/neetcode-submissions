class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap <Integer , Integer > prevmap = new HashMap<>() ;

        for (int i = 0 ; i < nums.length; i++) {

            if(prevmap.containsKey(target - nums[i])) { 
                return new int[] { prevmap.get(target - nums[i]) , i } ; 

            }
            prevmap.put(nums[i] , i ); 

        }
        return new int[] {} ; 
    }
}
