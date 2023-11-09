/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package findinf_relation_in_tree_using_array;

import java.util.Scanner;

public class Findinf_relation_in_tree_using_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
       int arr[]={0,16,14,10,8,7,9,3,2,4,1};
        System.out.print("Enter a NUMBER to find it,s relation  ");
        int number=ob.nextInt();
        int r=0;
        int parent=0;
        int leftchild=0;
        int rightchild=0;
       for(int i=0;i<arr.length;i++)
       {
           if(number==arr[i])
           {
               r=i/2;
               parent=arr[r];
               r=i*2;
               leftchild=arr[r];
               r=i*2+1;
               rightchild=arr[r];
           }
       }
        System.out.format("relation of %d  are \n parent %d \n leftchild %d \n rightchild %d \n ",number,parent,leftchild,rightchild);
    }
    
}
