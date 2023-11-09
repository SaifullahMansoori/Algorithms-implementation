/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bublesort;

import java.util.Scanner;

class problem
{
    public void bublesort(int arr[])
    {
              int temp;
      for(int i=0;i<arr.length;i++)
      {
          for(int j=0;j<arr.length-i-1;j++)
          {
              if(arr[j]>arr[j+1])
              {
                  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
              }
          }
      }
        
    }
}
public class Bublesort {

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
        ob.bublesort(arr);
        for(int x:arr)
        {
            System.out.print(x+"  ");
        }
        System.out.println();
    }
    
}
