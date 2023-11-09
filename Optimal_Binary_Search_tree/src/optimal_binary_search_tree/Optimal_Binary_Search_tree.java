/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package optimal_binary_search_tree;

import java.util.Scanner;
class solution
{
    public void sorting(int node[],int frequency[],int size)
    {
         int minnode,mincost;
        int temp;
            for(int i=0;i<node.length;i++)
        {
            minnode=i;
            mincost=i;
            for(int j=i+1;j<node.length;j++)
            {
                if(node[j]<node[minnode])
                {
                    minnode=j;
                    mincost=j;
                }
            }
            temp=node[minnode];
            node[minnode]=node[i];
            node[i]=temp;
            temp=frequency[mincost];
            frequency[mincost]=frequency[i];
            frequency[i]=temp;
        }
        BST(node, frequency,size-1);    
    }
    public void BST(int key[],int frequency[],int n)
    {
     int dp[][]=new int [n][n];
     for(int g=0;g<dp.length;g++)
     {
         for(int i=0,j=g;j<n;i++,j++)
         {
             if(g==0)
             {
                 dp[i][j]=frequency[i];
             }
             else if(g==1)
             {
                 int f1=frequency[i];
                 int f2=frequency[j];
                 dp[i][j]=Math.min(f1+2*f2, f2+2*f1);
             }
             else
             {
                 int min=Integer.MAX_VALUE;
                 int fs=0;
                 for(int x=i;x<=j;x++)
                 {
                     fs+=frequency[x];
                 }
                 for(int k=i;k<=j;k++)
                 {
                     int left=dp[i][k-1];
                     int right=dp[k+1][j];
                     if(left+right+fs<min)
                     {
                         min=left+right+fs;
                     }
                 }
                 dp[i][j]=min;
             }
         }
     }
        System.out.println("value "+dp[0][n-1]);
    }
}
public class Optimal_Binary_Search_tree {

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter how mony nods you have  ");
        int size=ob.nextInt();
        int node[]=new int[size];
        int frequency[]=new int[size];
        for (int i = 0; i < node.length; i++) {
            System.out.print("Enter the "+i+" node of tree ");
            node[i]=ob.nextInt();
            System.out.print("Enter the frequncy of "+i+" node  ");
            frequency[i]=ob.nextInt();
        }
        solution sol=new solution();
        sol.sorting(node, frequency,size);
    }
    
}
