package twoNumberFunction;
/** 
 * 
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数 
 * 
 * 
 *               答案正确 
 *              求最大公约数使用google的辗除法,未理解,记住即可,涉及欧几里**, 
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
	            while(time != 0){               //利用辗除法(记住即可)  
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
