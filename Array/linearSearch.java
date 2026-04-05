import java.util.*;

class linearSearch
{
    public static void linear(int n,int[] arr)
    {
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(n==arr[i])
            {
                index=i;
            }
        }
        System.out.println(index);
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr={2,5,9,7,8,4,0,6};
        linear(n,arr);
        sc.close();
    }
    
    }
