/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chainmatrixmultiplaction;
import java.io.*;
import java.util.*;
class solution
{
    public int mcm(int arr[])
    {
        int dp[][]=new int[arr.length-1][arr.length-1];
        for(int g=0;g<dp.length;g++)
        {
            for(int i=0,j=0;j<dp.length;i++,j++)
            {
                if(g==0)
                {
                    dp[i][j]=0;
                }
                else if(g==1)
                {
                    dp[i][j]=arr[i]*arr[j]*arr[j+1];
                }
                else
                {
                    int min=Integer.MAX_VALUE;
                    for(int k=i;k<j;k++)
                    {
                        //dp-> i,k left, and k+1,j right half
                        //arr->i*k=1 lefthalf k+1,i+1 right half
                        int lc=dp[i][k];
                        int rc=dp[k+1][j];
                        int mc=arr[i]*arr[k+1]*arr[j+1];
                        int tc=lc+rc+mc;
                        if(tc<min)
                        {
                            min=tc;
                        }
                    }
                    dp[i][j]=min;
                }
            }
        }
        return dp[0][dp.length-1];
    }
}
public class ChainMatrixmultiplaction {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("enter number of matrix ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        solution ob=new solution();
        System.out.print(ob.mcm(arr));
    }
    
}
