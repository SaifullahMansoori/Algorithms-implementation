/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;

import java.util.*;
public class QuickSort {
    public static void sort(int arr[],int start,int end)
    {
        if(start<end)
        {
            int Q=Partition(arr,start,end);
            sort(arr,start,Q-1);
            sort(arr,Q+1,end);
        }
    }
    public static int Partition(int arr[],int start,int end)
    {
     int x=arr[end];
     int temp;
     int i=start-1;
     for(int j=start;j<end;j++)
     {
        if(arr[j]<=x)
        {
            i++;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
     }
     i++;
     temp=arr[end];
     arr[end]=arr[i];
     arr[i]=temp;
     return i;
    }

    public static void main(String[] args) {
        int arr[]={12,3,345,45,17,1};
        int start=0;
        int end=arr.length-1;
        sort(arr,start,end);
        for(int X:arr)
            System.out.print(X+"  ");
    }
    
}
