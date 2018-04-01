package test2;

import java.util.Scanner;

/** 
 * 
 *      取一个整数a从右端开始的4～7位 
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
