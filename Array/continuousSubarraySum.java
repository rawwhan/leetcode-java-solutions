class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        /*int len=nums.length;
        int sum=0;    //this is brute force can be optimized using hashmap
        for(int i=0;i<len;i++)
        {
            sum=nums[i];
            for(int j=i+1;j<len;j++)
            {
                sum=sum+nums[j];
               if(sum%k==0)
               {
                return true;
               }
            }
        }
        return false;
        
        }
        }*/

        Map<Integer, Integer> remainderIndexMap = new HashMap<>();
        remainderIndexMap.put(0, -1); // To handle the case where the subarray starts from index 0
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;

            if (remainderIndexMap.containsKey(remainder)) {
                if (i - remainderIndexMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                remainderIndexMap.put(remainder, i);
            }
        }

        return false;
    }
}
