package com.bruse;

import java.util.Scanner;

/** 
* 
*       ��һ������������� 
 * 
 *      ��a������ʵ�δ��뺯��Fun()ʱ,�����ڲ����βεĲ����ı���ԭʼ����a��ֵ, 
 *      ������Ϊ���鴫�ݵ�������,�����õĲ������Ƕ�ԭ������Ĳ��� 
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
            k = (a.length + 1) / 2 - 1;     //�м�������±�  
            while(i != k){  
                time = a[i]; a[i] = a[j]; a[j] = time;  
                i++; j--;  
            }  
        }  
    }  
}