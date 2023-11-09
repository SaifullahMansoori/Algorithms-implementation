/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heap_implemention;
import java.util.*;
class MaxHeap {

    private int capacity;
    private int arr[];
    private int position;

    public MaxHeap(int size) {
        position = 1;
        this.capacity = size;
        arr = new int[capacity];
    }

    public void insert(int value) {
        arr[position++] = value;
        int child = position -1;
        int parent = child / 2;
        while (arr[parent] < arr[child] && parent > 0) {
            int temp = arr[parent];
            arr[parent] = arr[child];
            arr[child] = temp;
            child = parent;
            parent = child / 2;
            if (position == capacity) {
                capacity++;
            }
        }
    }

    public int parent(int value) {
        for (int j = 0; j < capacity; j++) {
            if (arr[j] == value) {
                int temp = j / 2;
                return arr[temp];
            }
        }
        return 0;
    }

    public int left(int value) {
        for (int i = 0; i < capacity; i++) {
            if (arr[i] == value) {
                int temp = 2*i+1;
                return arr[temp];
            }
        }
        return 0;
    }

    public int right(int value) {
        for (int i = 1; i < capacity; i++) {
            if (arr[i] == value) {
                int temp = 2 * (i + 1);
                return arr[temp];
            }
        }
        return 0;
    }

    public void print() {
        for (int i = 1; i < position; i++) {
            System.out.print(arr[i] + " , ");
        }
    }
}

class HeapApp {

    public void MinHeap(int arr[]) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            heap.add(arr[i]);
        }
        System.out.println();
        System.out.println("Min Heap is here ");
        Iterator it= heap.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+"  ");
        }
    }        



    public void MaxHeap(int arr[])
    {
        PriorityQueue heap=new PriorityQueue(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            heap.add(arr[i]);
        }
        System.out.println();
        System.out.println("Max Heap  is here ");
        Iterator it= heap.iterator();
          while(it.hasNext())
        {
            System.out.print(it.next()+"  ");
        }
    }
}
public class Heap_implemention {
    public static void main(String[] args) {
        MaxHeap hp = new MaxHeap(7);
        hp.insert(12);
        hp.insert(7);
        hp.insert(6);
        hp.insert(10);
        hp.insert(8);
        hp.insert(20);
        hp.print();
        System.out.print("\n parent of 10 is " + hp.parent(10) + " \n ");
        System.out.print("\n left child of 10 is " + hp.left(10) + " \n ");
        System.out.print("\n right child  of 10 is " + hp.right(10) + " \n ");
        System.out.println("/////////////////////////////////////////////////////////////////////////////");
        int arr[]={12,7,6,10,8,20};
        HeapApp ob=new HeapApp();
       ob.MaxHeap(arr);
       ob.MinHeap(arr);
    }
    
}
