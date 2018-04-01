package decomposeInteger;

import java.util.Scanner; 
/** 
 * 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5 
 * 
 *          已测试 答案正确 
 * */
public class DecomposeInteger {
	 public static void main(String[] args){  
	        int[] a = new int[30];  
	        int i = 0;  
	        int number = 0;  
	        int time = 2;  
	        Scanner scanner =new Scanner(System.in);  
	        try{  
	            number = scanner.nextInt();  
	        }catch(Exception e){  
	            System.out.println("输入有误!");  
	        }  
	        while(calculatePrimeNumber(number) == false) {  
	            while (number % time != 0) {  
	                time++;  
	            }  
	            number = number / time;  
	            a[i++] = time;  
	            time = 2;  
	        }  
	        a[i] = number;  
	        for(int forTime = 0;forTime <= i;forTime++){  
	            if(forTime == 0){  
	                System.out.print("="+a[forTime]);  
	            }else {  
	                System.out.print("*"+a[forTime]);  
	            }  
	        }  
	  
	    }  
	    public static boolean calculatePrimeNumber(int number){  
	        for(int forTime = 2;forTime <=Math.sqrt(number);forTime++){  
	            if(number%forTime == 0){  
	                return false;  
	            }  
	        }  
	        return true;  
	    } 
}
