/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearch;

import java.util.*;
class problem
{
    public int solve(int arr[],int key, int low,int high)
    {
        int mid;
       while(low<=high)
       {
        mid=(low+high)/2;
        if(arr[mid]==key)
            return mid;
        else if(arr[mid]<key)
            low=mid+1;
        else
            high=mid-1;
       }
        return -1;
    }
     public int resolve(int arr[],int key, int low,int high)
     {
         int mid;
         while(low<=high)
         {
             mid=(low+high)/2;
             if(arr[mid]==key)
                 return mid;
             else if(arr[mid]<key)
             {
                 low=mid+1;
                resolve(arr,key,low,high);
             }
             else
             {
                 high=mid-1;
                 resolve(arr,key,low,high);
             }
         }
         return -1;
                 
     }
}
public class Binarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array  ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter a number for ["+i+"] index ");
            arr[i]=sc.nextInt();
        }
        problem ob=new problem();
        int low=0,high=arr.length-1;
        System.out.print("Enter a number to search ");
        int key=sc.nextInt();
        int result=ob.solve(arr, key, low, high);
        if(result==-1)
            System.out.println("the number is note found ");
        else
            System.out.println("the number is in index "+result);
        
         int result2=ob.resolve(arr, key, low, high);  
                if(result==-1)
            System.out.println("recursion style the number is note found  ");
        else
            System.out.println("recursion style the number is in index "+result);
    }
    
}
