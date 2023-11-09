/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearch;

import java.util.*;
public class Binarysearch {

    public int binarysearch(int arr[],int key,int low,int high)
    {
        if(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
            {
                return binarysearch(arr,key,low,mid-1);
            }
            else
            {
                mid=mid+1;
                return binarysearch(arr,key,mid+1,high);
            }
        }
        else
            return -1;
    }
    public static void main(String[] args) {
        int arr[]={12,13,5,2,4,6,8,9,0,1};
         int i;
        for(int j=1;j<arr.length;j++)
        {
           int  key=arr[j];
            i=j-1;
            while(i>-1 && arr[i]>key)
            {
               arr[i+1]=arr[i];
               i-=1;
            }
            arr[i+1]=key;
        }
        int key=9;
        Binarysearch ob=new Binarysearch();
        int re=ob.binarysearch(arr, key, 0, arr.length-1);
        if(re!=-1)
            System.out.println("key found in this index  "+re);
        else
            System.out.println("the key is not found  ");
        
    }
    
}
