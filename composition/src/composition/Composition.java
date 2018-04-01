package composition;

/** 
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+222,2+222,22(此时共有5个数相加)， 
 * 几个数相加有键盘控制。 
 *  1.程序分析：关键是计算出每一项的值。 
 * 
 *          
 *          答案正确 
 * */

public class Composition {
	
	
	 public static void main(String[] args){  
	        System.out.println(calculate(1,10));  
	    }  
	    public static int calculate(int baseData,int comTime){  
	        int total = 0;  
	        int time=0;  
	        int nowData = 0;  
	        int lastData = 0;  
	        while(time < comTime){  
	            nowData = baseData * (int)Math.pow(10,time++) + lastData;  
	            total = total + nowData;  
	            lastData = nowData;  
	            System.out.println(nowData);  
	        }  
	        return total;  
	}

}
