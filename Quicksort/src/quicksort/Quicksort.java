/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;

/**
 *
 * @author Saifullah
 */
public class Quicksort {
    public void quickSort(int arr[], int begin, int end) 
    {
    if (begin < end) {
        int partitionIndex = partition(arr, begin, end);

        quickSort(arr, begin, partitionIndex-1);
        quickSort(arr, partitionIndex+1, end);
    }
   }
    private int partition(int arr[], int begin, int end) {
    int pivot = arr[end];
    int i = (begin-1);
    int temp;
    for (int j = begin; j < end; j++) {
        if (arr[j] <= pivot) {
            i++;

             temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    temp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = temp;
    return i+1;
}
    public static void main(String[] args) {
        int arr[]={1,2,34,5,1,34,4,555};
        Quicksort ob=new Quicksort();
        int begin=0,end=arr.length-1;
        ob.quickSort(arr, begin, end);
        for(int x:arr)
            System.out.print(x+"  "); 
    }
    
}
