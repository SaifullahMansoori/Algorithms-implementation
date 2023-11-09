/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_builder;


public class String_builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        char ch=sb.charAt(0);
        System.out.println(ch);
        sb.setCharAt(0, 'D');
        System.out.println(sb);
        sb.insert(4, 'D');
        System.out.println(sb);
        sb.deleteCharAt(4);
        sb.append('o');
        System.out.println(sb);
        int n=100000;
        long start=System.currentTimeMillis();
        String s="";
        for(int i=0;i<=n;i++)
        {
            s+=i;
        }
        long end=System.currentTimeMillis();
        long duration=end-start;
        System.out.println(duration);
         n=100000;
         start=System.currentTimeMillis();
        for(int i=0;i<=n;i++)
        {
            sb.append(i);
        }
         end=System.currentTimeMillis();
         duration=end-start;
        System.out.println(duration);
    }
    
}
