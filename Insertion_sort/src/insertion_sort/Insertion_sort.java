/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertion_sort;

public class Insertion_sort {
    public void sort(int arr[])
    {
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
    }

    public static void main(String[] args) {
        int arr[]={5,3,7,0,-9,16,67,13};
        Insertion_sort ob =new Insertion_sort();
        ob.sort(arr);
        for(int x:arr)
        {
            System.out.print(x+"  ");
        }
    }
    
}
