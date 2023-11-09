/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asccigap;
class solution
{
    public String Gap(String str)
    {
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++)
        {
            char cur=str.charAt(i);
            char pre=str.charAt(i-1);
            int gap=cur-pre;
            sb.append(gap);
            sb.append(cur);
            
        }
        return sb.toString();
    }
}
public class AscciGap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        solution ob=new solution();
        System.out.println(ob.Gap("abdgca"));
    }
    
}
