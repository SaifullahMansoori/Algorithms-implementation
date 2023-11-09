
package jobs_scheduling;
import java.util.*;
public class Activity_Selecting
{
    public Map<Integer,String> activity(String Jobs[],int start[],int finish[])
    {
       int temp,index;
       String tempj;
       Map<Integer,String> selected=new HashMap<>();
       for(int i=0;i<finish.length;i++)
       {
         for(int j=i+1;j<finish.length;j++)
         {
             if(finish[i]>finish[j])
             {
                 temp=finish[i];
                 finish[i]=finish[j];
                 finish[j]=temp;
                 temp=start[i];
                 start[i]=start[j];
                 start[j]=temp;
                 tempj=Jobs[i];
                 Jobs[i]=Jobs[j];
                 Jobs[j]=tempj;
             }
         }
       }
       for(int i=0;i<finish.length;i++)
       {
            for(int j=0;j<start.length;j++)
            {
                if(finish[i]<=start[j])
                {
                  String name=Jobs[i];
                  if(i==0)
                  {
                          index=i+1;
                  }
                  else
                  {
                           index=i;
                  }
                  selected.put(index,name);
                  break;
                }
            } 
       }
     return selected;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number of Activities ");
       int size=sc.nextInt();
       String Jobs[] =new String[size];
       int start[]=new int[size];
       int finish[]=new int[size];
       for(int i=0;i<Jobs.length;i++)
       {
           System.out.print("Enter the name of jobs ["+(i+1)+"] index ");
           Jobs[i]=sc.next();
           System.out.print("Enter the job "+Jobs[i]+" starting time ");
           start[i]=sc.nextInt();
           System.out.print("Enter the job "+Jobs[i]+" finished time ");
           finish[i]=sc.nextByte();
       }
       Map<Integer,String> selected=new HashMap<>();
       Activity_Selecting ob=new Activity_Selecting();
       selected.putAll(ob.activity(Jobs, start, finish));
        System.out.println("this is finish time sorted  ");
        for(int f:finish)
            System.out.print(f+" ");
        System.out.println();
        System.out.println("this is start time sorted  ");
        for(int s:start)
           System.out.print(s+" ");
        System.out.println();
        System.out.println("this is Jobs time sorted  ");
        for(String job:Jobs)
           System.out.print(job+" ");
        System.out.println();
        System.out.println("selected Jobs ");
        System.out.print(selected);
       }   
}
    

