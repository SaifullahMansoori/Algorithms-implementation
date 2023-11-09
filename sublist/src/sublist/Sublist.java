/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sublist;

/**
 *
 * @author Saifullah
 */
public class Sublist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=10;
        int arr[]={1,2,-31,-3,51,12,-102,1,31,1};
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }
                if(sum>maxsum)
                    maxsum=sum;
            }
        }
        System.out.print(maxsum);
    }
    
}
