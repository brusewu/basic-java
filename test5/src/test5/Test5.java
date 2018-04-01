package test5;

import java.util.Scanner;

/** 
 * 
 *  有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。 
 * */ 
public class Test5 {
	
	public static void main(String[] args){  
        Scanner in = new Scanner(System.in);  
        int n = in.nextInt();  
        int a[] = new int[100];  
        for(int i = 0;i < n ;i++){  
            a[i] = i + 1;  
        }  
        int i = 0;  
        int count = 1;  
        int newN = n;  
        int j = 0;  
        int time = 0;  
        while(newN >= 3){  
            i = 0;  
            while(a[i] != '\0'){  
                if(count ==3){  
                    j = i;  
                    while(a[j] != '\0'){  
                        a[j] = a[j + 1];  
                        j++;  
                    }  
                    newN--;  
                }else  
                    i++;  
                if(count == 3)  
                    count = 1;  
                else  
                    count++;  
            }  
        }  
        int k = 0 ;  
        while(a[k] != '\0'){  
            System.out.print(a[k++]+" ");  
        }  
    }  

}
