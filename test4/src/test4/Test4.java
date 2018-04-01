package test4;

import java.util.Scanner;

/** 
 *      编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数   1/1+1/3+...+1/n(利用指针函数) 
 * 
 * */ 
public class Test4 {
	public static void main(String[] args){  
        Scanner in = new Scanner(System.in);  
        double n = in.nextInt();  
        double total = 0;  
        if(n % 2 == 0){  
            while(n > 0){  
                total += 1/n;  
                System.out.print("1"+"/"+n+" ");  
                n -= 2;  
            }  
            System.out.println(total);  
        }else if(n % 2 != 0){  
            while(n > 0){  
                total += 1/n;  
                System.out.print("1"+"/"+n+" ");  
                n -= 3;  
            }  
            System.out.println(total + 1);  
        }else{  
            System.out.print(n);  
        }  
    }  
}
