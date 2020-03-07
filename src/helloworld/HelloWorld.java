/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * @author zhuan
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        long l;
        double d;
        float f;
        boolean b;
        char c;
        
        i=3+4;
        i=i-2;
        i+=3; //i=i+1;
        i--; // i=i-1;
        d=((double)i)/3;
        i=i%3;
        System.out.println("i="+i);
        System.out.println("d="+d);
        
        l=100+200;
        l-=500;
        l+=100;
        l--;
        System.out.println("l="+l);
        
        d=4.0+4.2;
        d--;
        d+=5.3;
        System.out.println("d="+d);
        d+=0.999994352452246543432525342543243532543254325432523;
        System.out.println("d="+d);
        
        f=(float)d;
        System.out.println("f="+f);
        
        b=true;
        b= b && false;
        b= b || (3==4);
        b = b || (11>7);
        b = b && (1001==1001);
        b = !b || (254<250);
        b = !(b && (240>200));
        
        if (b && (3<2)) {
            System.out.println("b is true");
        } else {
            System.out.println("b is false");
        }
        System.out.println("b="+b);
        
        c='A';
        System.out.println("c="+c);
        
        System.out.format("i=%-10d;l=%-10d;d=%-10.2f;f=%-10.3f;b=%-10s\n", i,l,d,f,b);
        System.out.printf("i=%d;l=%d;d=%f;f=%f;b=%s\n", i,l,d,f,b);
        
        
        long[] ar=new long[100];
        ar[0]=1;
        ar[1]=1;
        for (int j=2;j<100;j++) {
            ar[j]=ar[j-1]+ar[j-2];
        }
        for (int j=0;j<100;j++)
            System.out.print(ar[j]+",");
        System.out.println();
        
        char[] car=new char[50];
        car[0]='A';
        for (int j=1;j<50;j++) {
            car[j]=(char)(car[j-1]+1);
        }
        for (int j=0;j<50;j++)
            System.out.print(((int)car[j])+",");
        System.out.println();
        
        String s="I am a student";
        System.out.println("s="+s);
        for (int j=0;j<s.length();j++) {
            System.out.println(s.charAt(j));
        }
        
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        System.out.println(s);
        s=sc.next();
        System.out.println(s);
        s=sc.nextLine();
        System.out.print(s);
        s=sc.nextLine();
        System.out.print(s);
    }
    
}
