package test2;

import java.util.Scanner;

/** 
 * 
 *      ȡһ������a���Ҷ˿�ʼ��4��7λ 
 * 
 * */ 
public class Test2 {
    public static void main(String[] atgs){  
        Scanner in = new Scanner(System.in);  
        int a = in.nextInt();  
        int n = ( a % (int) Math.pow(10,7) - a % (int) Math.pow(10,3) ) / 1000;  
        System.out.println(n);  
    } 
}
