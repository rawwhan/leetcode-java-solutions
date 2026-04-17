Sort array according to parity like begining with even and end with odd

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int evenIndex=0;
        for(int currIndex = 0;currIndex<nums.length;currIndex++)
        {
            if(nums[currIndex]%2==0)
            {
                int temp = nums[evenIndex];
                nums[evenIndex] = nums[currIndex];
                nums[currIndex] = temp;
                evenIndex++;
            }
        }
        return nums;
        
        
        
        
        
        
        /*
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>(); 
        for(int n: nums)
        {
            if(n % 2 == 0)
            {
                even.add(n);
            }
            else
            odd.add(n);
        }
        even.addAll(odd);
        int[] arr = new int[nums.length];
        int i =0;
        for(int n: even)
        {
            arr[i++]=n;
        }
        return arr; */
    }
}
