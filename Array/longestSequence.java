class Solution {
    public int longestConsecutive(int[] nums) {

         if (nums==null || nums.length == 0){
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        int maxLength=0;
        for(int num: set)
        {
            int currLength=1;
            if(!set.contains(num-1))    // smaller number is also there so this cannot be the start
            {

                while(set.contains(num+1))
                {
                    num++;
                    currLength++;
                }
                maxLength=Math.max(maxLength, currLength);
            }
        }
        return maxLength;
    }
}
