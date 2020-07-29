/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;

import java.util.Scanner;
/**
 *
 * @author home
 */
public class countnumber {
    public static void main(String[] args)
    { 
        System.out.println("enter the numbers");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int c;
        int a=0,b=0,d=0;
        for(int i=0;i<n;i++)
        {
            c=obj.nextInt();
            if(c>0)
                a++;
            else if(c<0)
                b++;
            else
                d++;
        }
        System.out.println("positive no count"+a+"\n negative no count"+b+"\n zero count"+d);
         
    }
        
}
