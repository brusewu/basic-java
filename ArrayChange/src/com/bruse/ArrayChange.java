package com.bruse;

import java.util.Scanner;

/** 
* 
*       将一个数组逆序输出 
 * 
 *      当a数组以实参传入函数Fun()时,函数内部对形参的操作改变了原始数组a的值, 
 *      这是因为数组传递的是引用,对引用的操作就是对原本数组的操作 
 * 
* **/ 
public class ArrayChange {

	public static void main(String[] args){  
        Scanner in = new Scanner(System.in);  
        int a[] = new int[5];  
        for(int fi = 0;fi < a.length;fi++){  
            a[fi] = in.nextInt();  
        }  
        Fun(a);  
        for(int fj = 0;fj < a.length;fj++){  
            System.out.print(a[fj]);  
        }  
    }  
    public static void Fun(int[] a){  
        int i,j,k;  
        int time;  
        if(a.length % 2 == 0){  
            i = 0;  
            j = a.length - 1;  
            while(i + 1 != j){  
                time = a[i]; a[i] = a[j]; a[j] = time;  
                i++; j--;  
            }  
        }else{  
            i = 0;  
            j = a.length - 1;  
            k = (a.length + 1) / 2 - 1;     //中间数组的下标  
            while(i != k){  
                time = a[i]; a[i] = a[j]; a[j] = time;  
                i++; j--;  
            }  
        }  
    }  
}
