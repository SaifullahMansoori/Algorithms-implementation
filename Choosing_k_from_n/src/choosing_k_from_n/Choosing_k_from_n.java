/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package choosing_k_from_n;

/**
 *
 * @author Saifullah
 */
public class Choosing_k_from_n {

    static int choosing(int k,int n)
    {
     int arr[][]=new int [k+1][n+1];
     for(int i=0;i<n;i++)
     {
         arr[0][i]=1;
     }
     for(int i=0;i<k;i++)
     {
         arr[i][i]=1;
     }
     for(int i=1;i<=k;i++)
     {
         for(int j=i;j<=n;j++)
         {
             arr[i][j]=arr[i][j-1]+arr[i-1][j-1];
         }
     } 
     int re=arr[k][n];
     return re;
    }
    static int bin(int n,int k)
    {
        if(k==0||n==k)
            return 1;
        else
            return bin(n-1,k-1)+bin(n-1,k);
    }
    static int choosing3(int n,int k)
    {
        int arr[][]=new int[n+1][k+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=k; j++) {
                if(j==0||i==j)
                {
                    arr[i][j]=1;
                }
                else
                {
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                }
            }
        }
        return arr[n-1][k-1];
    }
    public static void main(String[] args) {
        System.out.println("chosing1 5 from 8 "+choosing(5,8)); 
        System.out.println("chosing2 5 from 8 "+bin(8,5)); 
        System.out.println("chosing3 5 from 8 "+choosing3(8,5)); 
    }
    
}
