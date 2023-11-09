
package one;


public class One {


    public static void main(String[] args) {
        String s="saifullah";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            System.out.print(ch+"  ");
        }
        System.out.println();
        System.out.println(s.substring(1,4));
        System.out.println(s.substring(2));
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                System.out.print(s.substring(i,j)+"  ");
            }
            System.out.println();
        }
        String s1="saifullah";
        String s2="mansoori";
        String s3=s1+"  "+s2;
        System.out.println(s3);
        s3+='H';
        s3+=10;
        s3+='M';
        System.out.println(s3);
        String A="abd cde fgh igh klm nop qrs zzz ???";
        String arr[]=A.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        
    }
    
}
