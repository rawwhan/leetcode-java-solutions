class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int min1= Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int num: arr)
        {
            if(num<min1)
            {
                min2=min1;
                min1=num;
            }
            else if(num>min1 && num < min2)
            {
            min2=num;
        }
        }
        //Declaring new array list for returning result
        ArrayList<Integer> result  = new ArrayList<>();
        if(min2==Integer.MAX_VALUE)
        {
            result.add(-1);
        }
        else
        {
            result.add(min1);
            result.add(min2);
        }
        return result;
    }
}
