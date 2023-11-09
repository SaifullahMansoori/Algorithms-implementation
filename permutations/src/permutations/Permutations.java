/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package permutations;
class solution
{
    public void permutations(String str)
    {
        int n=str.length();
        int f=factorial(n);
        for(int i=0;i<f;i++)
        {
            StringBuilder sb=new StringBuilder(str);
            int temp=i;
            for(int div=n;div>=1;div--)
            {
             int q=temp/div;
             int r=temp%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp=q;
            }
            System.out.println();
        }
    }
    private int factorial(int n)
    {
        int val=1;
        for(int i=2;i<=n;i++)
        {
            val*=i;
        }
        return val;
        
    }
}
public class Permutations {

    public static void main(String[] args) {
        solution ob=new solution();
        String s="abc";
        ob.permutations(s);
    }
    
}
