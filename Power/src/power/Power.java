/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package power;
import java.util.*;
class problem
{
   public int power(int m,int n)
   {
       if(m==0)
           return 1;
       if(m==1)
           return n;
       else
           return n*power(n,m-1);
       
   }
}
public class Power {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Base number ");
        n=sc.nextInt();
        System.out.print("Enter a number for power ");
        m=sc.nextInt();
        problem ob=new problem();
        int result=ob.power(m, n);
        System.out.print("power is equal to s "+result );
        System.out.println("\n");
    }
    
}
