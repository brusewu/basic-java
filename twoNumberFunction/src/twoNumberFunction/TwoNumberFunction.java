package twoNumberFunction;
/** 
 * 
 * ��Ŀ����������������m��n���������Լ������С������ 
 * 
 * 
 *               ����ȷ 
 *              �����Լ��ʹ��google��շ����,δ���,��ס����,�漰ŷ����**, 
 * 
 * */ 
public class TwoNumberFunction {

	 public static void main(String[] args){  
	        System.out.println(calculateMax(7,102));  
	        System.out.println(calculateMin(10,101));  
	    }  
	    public static int calculateMax(int a,int b){  
	        int time = -1;  
	        if(a>b){  
	            while(time != 0){               //����շ����(��ס����)  
	                time = a%b;  
	                a = b;  
	                b = time;  
	            }  
	            return a;  
	        }else{  
	            while(time != 0){  
	                time = b%a;  
	                b = a;  
	                a = time;  
	            }  
	            return b;  
	        }  
	    }  
	    public static int calculateMin(int a,int b){  
	        int time;  
	        if(a>b){  
	            time = a;  
	            while(time%a != 0 || time%b !=0){  
	                time++;  
	            }  
	            return time;  
	        }else{  
	            time = b;  
	            while(time%a != 0 || time%b != 0 ){  
	                time++;  
	            }  
	            return time;  
	        }  
	    }
}
