
package maxsubarray;
import java.util.*;
public class Maxsubarray {
public static int maxSubArraysum(int[] arr)
{
    int maxsum=arr[0];
    int sum=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(sum<0)
        {
            sum=arr[i];
        }
        else
        {
            sum=sum+arr[i];
        }
        maxsum=Math.max(sum, maxsum);
   }
    return maxsum;
}
public static void main(String[] args) {
 int arr[]={1,2,-5,4,3,8,5};
 int sum=maxSubArraysum(arr);
    System.out.println("maximum sum of sub array is "+sum);
    }
    
}
