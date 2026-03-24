/* Input an array arr of size n and find out all the possible pairs and find all the sum and print the max among them.

input: "1  -2  6  -1  3 "
output: maxSubarray sum = 8*/

// we can solve this problem using kadane algorith as this brute force nested loop approach use n cube time complexity
// so using kadane it gets reduce to n time complexity. 

import java .util.*;
class maxSubarraysum
{

    public static void printmaxSum(int[] arr,int n)
    {
       
       int currSum=arr[0];
       int maxSum=arr[0];
       for(int i = 1;i<arr.length;i++)
       {
        currSum=Math.max(arr[i],currSum+arr[i]);
        maxSum=Math.max(maxSum,currSum);
       }
       System.out.println(maxSum);
       
       /*int maxsum=Integer.MIN_VALUE;
        
        for(int i =0;i<arr.length;i++)
        {
            for(int j=i;j<=arr.length;j++)
            {
                int currSum=0;
                for(int k=i;k<j;k++)
                {
                    currSum=currSum+arr[k];
                }
                System.out.println(currSum);
                maxsum=Math.max(maxsum,currSum);
            }
        }
        System.out.println(maxsum);*/
    }


    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        printmaxSum(arr,n);
    }
}


