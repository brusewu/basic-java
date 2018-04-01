package factorial;
/** 
 * ��1+2!+3!+...+20!�ĺ� 
 * 
 * !�ǽ׳˵ķ��š���������������n��n!=1*2*3... *n�����涨0!=1 
 * 
 *              ����ȷ 268040729 
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
