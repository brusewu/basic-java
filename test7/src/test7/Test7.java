package test7;
/** 
 *  ��0��7������ɵ����������� 
 * 
 *      ���´���Ϊ 0-7������ɵ�7λ���� 
 *      δ�������Ŀ,������6λ���� 
 * */ 
public class Test7 {

	   public static final int lim = 7;  
	    public static void main(String[] args){  
	        int i = 0;  
	        int count = 0;  
	        while(i <= lim){  
	            if(i == 0){  
	  
	            }else if(i % 2 != 0){  
	                count += Fun(lim + 1 - 1) - Fun(lim + 1 - 2);    //��ĿΪ0 - 7 ����Ҫ lim + 1  
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
