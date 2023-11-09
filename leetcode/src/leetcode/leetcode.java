
package leetcode;
class solution
{
public void compression1(String str)
{
    String s=str.charAt(0)+"";
    for(int i=1;i<str.length();i++)
    {
        char curr=str.charAt(i);
        char prev=str.charAt(i-1);
        if(curr!=prev)
        {
            s+=curr;
        }
    }
    System.out.println("first "+s);
}
 public void compression2(String str)
 {
     String s=str.charAt(0)+"";
     int count=1;
     for(int i=1;i<str.length();i++)
     {
         char curr=str.charAt(i);
         char prev=str.charAt(i-1);
         if(curr==prev)
         {
             count++;
         }
         else
         {
             if(count>1)
             {
                 s+=count;
                 count=1;
             }
             s+=curr;
         }
          if(count>1)
             {
                 s+=count;
                 count=1;
             }
     }
     System.out.println("second  "+s);  
 }
}
public class leetcode {
    public static void main(String[] args) 
    {
     solution ob=new solution();
     String ss="aaabbbcdegggfff";
     ob.compression1(ss);
     ob.compression2(ss);
     
    }
    
}
