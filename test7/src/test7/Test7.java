package test7;
/** 
 *  求0—7所能组成的奇数个数。 
 * 
 *      以下代码为 0-7所能组成的7位奇数 
 *      未能完成题目,还需求6位奇数 
 * */ 
public class Test7 {

	   public static final int lim = 7;  
	    public static void main(String[] args){  
	        int i = 0;  
	        int count = 0;  
	        while(i <= lim){  
	            if(i == 0){  
	  
	            }else if(i % 2 != 0){  
	                count += Fun(lim + 1 - 1) - Fun(lim + 1 - 2);    //题目为0 - 7 所以要 lim + 1  
	            }  
	            i ++;  
	        }  
	        System.out.println(count);  
	    }  
	    public static int Fun(int a){  
	        int i = 1;  
	        int t = 1;  
	        if(a == 1)  
	            return 1;  
	        while(i <= a){  
	            t = i * t;  
	            i++;  
	        }  
	        return t;  
	    }  
}
