/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/


  
  class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
          int required = target - nums[i]; // 9-2=7 is required to complete target
        
         if (map.containsKey(required)) {
                return new int[]{map.get(required), i};
            }

            // add current number and index to map
            map.put(nums[i], i);
        }

        return new int[]{};  // no solution found
    }
        
    
}
