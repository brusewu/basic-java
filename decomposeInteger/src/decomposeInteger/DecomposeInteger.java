package decomposeInteger;

import java.util.Scanner; 
/** 
 * ��һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5 
 * 
 *          �Ѳ��� ����ȷ 
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
	            System.out.println("��������!");  
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