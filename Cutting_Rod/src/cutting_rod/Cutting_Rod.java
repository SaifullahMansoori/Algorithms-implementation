/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cutting_rod;

class problem {

    public int cutting(int n, int p[]) {
        if (n == 0) {
            return 0;
        } else {
            int q = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i++) {
                int temp = cutting(n - i, p) + p[i];
                if (temp > q) {
                    q = temp;
                }
            }
            return q;
        }
    }
   public int memoizedcutting(int n,int p[],int arr[])
   {
       int temp,q=Integer.MIN_VALUE;
       if(n==0 || arr[n]>-1)
           return arr[n];
       else
       {
           for(int i=1;i<=n;i++)
           {
               temp=memoizedcutting(n-i,p,arr)+p[i];
               if(temp>q)
               {
                   q=temp;
               }
           }
           arr[n]=q;
           return q;
       }
   }
}


public class Cutting_Rod {

    public static void main(String[] args) {
        problem ob = new problem();
        int p[] = {0, 1, 3, 4, 5, 10, 12, 18, 22, 23, 24, 25};
        int n = p.length - 1;
        System.out.println("first way of cutting rod " + ob.cutting(n, p));
        int arr[]={0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        System.out.println("first way of cutting rod " + ob.memoizedcutting(n, p,arr));
        
    }

}
