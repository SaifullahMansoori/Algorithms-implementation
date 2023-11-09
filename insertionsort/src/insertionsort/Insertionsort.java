/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionsort;
import java.util.*;
class problem
{
    public void insertionsort(int arr[])
    {
        int key,j;
        for(int i=1;i<arr.length;i++)
        {
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
}
public class Insertionsort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int size;
        System.out.print("Enter the size of array ");
        size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter a number for ["+i+"] index  ");
            arr[i]=sc.nextInt();
        }
        problem ob=new problem();
        ob.insertionsort(arr);
        for(int x:arr)
        {
            System.out.print(x+"  ");
        }
        System.out.println();
        
    }
    
}
