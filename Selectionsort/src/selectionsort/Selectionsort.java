/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectionsort;
import java.util.Scanner;
class Problem
{
    public void selectionsort(int arr[])
    {
        int min;
        int temp;
            for(int i=0;i<arr.length;i++)
        {
            min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        
    }
}
public class Selectionsort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array  ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter a number for ["+i+"] index ");
            arr[i]=sc.nextInt();
        }
        Problem ob=new Problem();
        ob.selectionsort(arr);
        for(int x:arr)
            System.out.print(x+"  ");
        System.out.println();
    }
    
}
