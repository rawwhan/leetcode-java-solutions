/* you are given n pairs sort them 
1.sort by first element (ascending)
2. if first element is equal sort with the second element

First line contains n integer
Second line contains n pairs
Input: 
3
3 6, 2 4, 7 8
Output:
2 4, 3 6, 7 8 */

import java.util.*;
class sortPair
{
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][] = new int[n][2];
        int i;
        for(i= 0;i<n;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        Arrays.sort(arr, new Comparator<>() {
    public int compare(int[] a, int[] b) {
        if(a[0] == b[0]) {                   // if return value come negative then a combes before b
            return a[1] - b[1];              // if positive b comes before a
        }                                    // if 0 both equal
        return a[0] - b[0];
    }
});
        for(i=0;i<n;i++)
        {
        System.out.println(arr[i][0] + " "+ arr[i][1]);
        }
    }
}
