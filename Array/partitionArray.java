class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
      
      int less=0;
      int more=nums.length-1;
      int arr[]= new int[nums.length];
      for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--)
        {
             if(nums[i]<pivot)
            {
                arr[less]=nums[i];
                less++;
            }
            if(nums[j]>pivot)
            {
                arr[more]=nums[j];
                more--;
            }
        }
      
        while(less<=more)
        {
            arr[less]=pivot;
            less++;
           
        }
      
      
      return arr;
      
    
      
      
       /* List<Integer> less= new ArrayList<>();
        List<Integer> more= new ArrayList<>();
        List<Integer> same= new ArrayList<>();
        for(int arr: nums)
        {
            if(arr<pivot)
            {
                less.add(arr);
            }
            else if(arr>pivot)
            {
                more.add(arr);
            }
            else
            {
                same.add(arr);
            }

        }
        less.addAll(same);
        less.addAll(more);
        int[] newArr = new int[nums.length];
        int i =0;
        for(int n: less)
        {
            newArr[i]=n;
            i++;
        }
        return newArr; */

        
    }
}
