
package fibuanci;

public class Fibuanci {
    static int fib(int n)
    {
        if(n==0|| n==1)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
   static int fib2(int n)
   {
       int arr[]=new int[n];
       arr[0]=0;
     if(n>0)
     { 
      arr[1]=1;
       for(int i=2;i<=n;i++)
       {
           arr[i]=(arr[i-1]+arr[i-2]);
       }
     }
       return arr[n];
   }
    public static void main(String[] args) {
        System.out.println("Fibuanci one is  "+fib(5));
        System.out.println("Fibuanci two is  "+fib2(5));
        //System.out.println("Fibuanci three is  "+fib3(5));
    }
    
}
