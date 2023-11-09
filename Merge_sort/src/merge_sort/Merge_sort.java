/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package merge_sort;

import java.util.ArrayList;


public class Merge_sort {
    public void megre_sort(int arr[])
    {
        if(arr.length<2)
            return;
        int midindex=arr.length/2;
        int left[]=new int[midindex];
        int right[]=new int[arr.length-midindex];
        for(int i=0;i<midindex;i++)
        {
            left[i]=arr[i]; 
        }
         for(int i=midindex;i<arr.length;i++)
        {
            right[i-midindex]=arr[i]; 
        }
        megre_sort(left);
        megre_sort(right);
        merge(arr,left,right);
    }
    private static void merge(int arr[],int left[],int right[])
    {
        int lsize=left.length;
        int rsize=right.length;
        int i=0, j=0, k=0;
        while(i<lsize && j<rsize)
        {
            if(left[i]<right[j])
            {
                arr[k]=left[i];
                i++;
            }
            else
            {
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<lsize)
        {
            arr[k]=left[i];
            i++;
            k++;
        }
         while(j<lsize)
        {
            arr[k]=right[j];
            j++;
            k++;
        }
        
    }
  
    public static void main(String[] args) {
        int arr[]={5,3,7,0,-9,16,67,13};
        Merge_sort ob=new Merge_sort();
        ob.megre_sort(arr);
        for(int X: arr)
        {
            System.out.print(X+"  ");
            
        }
      
    }
    
}
