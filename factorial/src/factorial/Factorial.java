package factorial;
/** 
 * 求1+2!+3!+...+20!的和 
 * 
 * !是阶乘的符号。对于所有正整数n，n!=1*2*3... *n；而规定0!=1 
 * 
 *              答案正确 268040729 
 * 
 * */ 
public class Factorial {
	   public static void main(String[] args){  
	        int count = 20;  
	        int i = 1;  
	        int total = 0;  
	        while(i <= count){  
	            total += calculate(i++);  
	        }  
	        System.out.println(total);  
	    }  
	    public static int calculate(int number){  
	        int i = 1;  
	        int total = 1;  
	        while(i <= number){  
	            total = total * i;  
	            i++;  
	        }  
	        return total;  
	    }
}
