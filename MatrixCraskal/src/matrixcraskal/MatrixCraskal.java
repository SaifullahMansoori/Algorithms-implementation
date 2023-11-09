/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixcraskal;

/**
 *
 * @author Saifullah
 */
public class MatrixCraskal {
  public void matrix(int m1[][],int m2[][])
  {
      if(m1[0].length != m2.length)
      {
          System.out.print("Multiplication undefined ");
      }
      else
      {
          int result[][]=multiple(m1,m2);
          for(int row=0;row<result.length;row++)
          {
              for(int column=0;column<result[0].length;column++)
              {
                  System.out.print(result[row][column]+" ");
              }
              System.out.println();
          }
      }
  }
  public static int [][] multiple(int m1[][],int m2[][])
  {
      int answer[][]=new int[m1.length][m2.length];
      for(int row=0;row<m1.length;row++)
      {
          for(int column=0;column<m2[0].length;column++)
          {
              for(int i=0;i<m1[0].length;i++)
              {
                  answer[row][column]+=m1[row][i]*m2[i][column];
              }
          }
      }
      return answer;
  }
    public static void main(String[] args) {
       int m1[][]={{1,2,3},{4,5,6}};
       int m2[][]={{7,8},{9,10},{11,12}};
       int result[][]=new int[2][2];
       int sum=0;
       for(int i=0;i<2;i++)
       {
           for(int j=0;j<2;j++)
           {
               for(int k=0;k<3;k++)
               {
                 sum=sum+m1[i][k]*m2[k][j];  
               }
               result[i][j]=sum;
               sum=0;
           }
       }
       System.out.print("first style of Multiplication \n");
       for(int i=0;i<2;i++)
       {
           for(int j=0;j<2;j++)
           {
               System.out.print(result[i][j]+" ");       
           }
           System.out.println("");
       }
        System.out.print("second style of Multiplication \n");
        MatrixCraskal ob=new MatrixCraskal();
        ob.matrix(m1,m2);
    }
    
}
