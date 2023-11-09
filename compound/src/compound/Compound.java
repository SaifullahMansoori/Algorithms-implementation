/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compound;
import java.util.*;
class problem
{
    public int compound(int n,int m)
            {
                if((n==m)||m==0)
                    return 1;
                else
                    return compound(n-1,m)+compound(n-1,m-1);
            }
}
public class Compound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        System.out.print("Enter a number for n ");
        n=sc.nextInt();
        System.out.print("Enter a number for m ");
        m=sc.nextInt();
        problem ob=new problem();
        int result=ob.compound(n, m);
        System.out.print("tarkeb = "+result);
        System.out.println("\n");
        
    }
    
}
