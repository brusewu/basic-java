package numberChange;

import java.util.Scanner;

/** 
 *      输入数组，最大的与第一个元素交换，最小的与最后一个 
 * 
 * */ 
public class NumberChange {

	public static int numberCount = 5;  
    public static void main(String[] args){  
        Scanner in = new Scanner(System.in);  
        int a[] = new int[100];  
        int i;  
        for(i = 0; i < numberCount; i++){  
            a[i] = in.nextInt();  
        }  
        int m = a[0],n = 0,time;  
        int b[] = a.clone();  
        i = 0;  
        while(a[i] != '\0'){  
            if(a[i + 1] != '\0') {  
                if (a[i + 1] >= m){  
                    m = a[i + 1];  
                    n = i + 1;  
                }  
            }  
            i++;  
        }  
        time = a[0];  
        a[0]= m;  
        a[n] = time;  
        i = 0;  
        while(a[i] != '\0'){  
            System.out.print(a[i]+" ");  
            i++;  
        }  
        System.out.println();  
  
        i = 0;  
        m = b[0];  
        n = 0;  
        while(b[i] != '\0'){  
            if(b[i + 1] != '\0'){  
                if(b[i + 1] < m){  
                    m = b[i + 1];  
                    n = i + 1;  
                }  
            }  
            i++;  
        }  
        time = b[numberCount - 1];  
        b[numberCount - 1] = m;  
        b[n] = time;  
        i = 0;  
        while(b[i] != '\0'){  
            System.out.print(b[i]+" ");  
            i++;  
        }  
  
    }
}
