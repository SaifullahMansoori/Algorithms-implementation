/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ispalindrome;
import java.util.*;
class solution
{
            public void solution(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                String ss=str.substring(i,j);
                if(isPalindrome(ss)==true)
                {
                    System.out.print(ss);
                }
            }
        }
    }
        private boolean isPalindrome(String s)
        {
            int i=0;
            int j=s.length()-1;
            while(i<=j)
            {
                char s1=s.charAt(i);
                char s2=s.charAt(j);
                if(s1!=s2)
                {
                    return false;
                }
                else
                {
                    i++;
                    j--;
                }
            }
            return true;
        }
}
public class IsPalindrome {

    public static void main(String[] args) {
         Scanner ob=new Scanner(System.in);
         System.out.println("Enter a string   ");
         String str=ob.nextLine();
         solution s=new solution();
         s.solution(str);
    }
    
}
