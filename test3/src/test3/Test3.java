package test3;

import java.util.Scanner;

/** 
 *      ��n��������ʹ��ǰ�����˳�������m��λ�ã����m���������ǰ���m���� 
 * 
 * */  
public class Test3 {

	public static void main(String[] args){  
        Scanner in = new Scanner(System.in);  
        int a[] = new int[100];  
        int count = 10;  
        int m= 9;  
        for(int i =0; i < count ; i ++){  
            a[i] = in.nextInt();  
        }  
        int k = count - m;  
        int timeCount = count;  
        for(int j = count - m; j < count; j ++){  
            a[timeCount++] = a[j];  
        }  
        System.out.println("**" + a[6]+"**"+a[7]);  
        k = count - 1;  
        for(int j = count - m - 1; j >= 0; j--){  
            a[k--] = a[j];  
        }  
        k = count;  
        for(int j = 0 ; j < m ; j ++){  
            a[j] = a[k++];  
        }  
        for(int j = 0 ; j < count ; j ++){  
            System.out.print(a[j]+" ");  
        }  
    }  
}
