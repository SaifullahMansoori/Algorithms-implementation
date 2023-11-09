/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package akarman;
import java.util.*;
class problem
{
    public int akarman(int m,int n)
    {
        if((m<0)||(n<0))
            return 0;
        else if(m==0)
            return n+1;
        else if(n==0)
            return akarman(m-1,1);
        else
            return akarman(m-1,akarman(m,n-1));
    }
}

public class Akarman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number for a ");
        a=sc.nextInt();
        System.out.print("Enter a number for b ");
        b=sc.nextInt();
        problem ob=new problem();
        int result=ob.akarman(a, b);
        System.out.println("the result is  "+result);
    }
    
}
