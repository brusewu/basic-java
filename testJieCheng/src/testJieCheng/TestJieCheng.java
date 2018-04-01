package testJieCheng;
/** 
 *  求1+2!+3!+...+20!的和 
 * 
 *  注:0! = 1 
 * 
 *  未测试结果 
 *  测试结果为268040729 
 * */
public class TestJieCheng {
	
    public static void main(String[] atgs){  
        int total = 0;  
        for(int i = 1;i <= 20;i++){  
            total += JieCheng(i);  
        }  
        System.out.print(total);  
    }  
    public static int JieCheng(int a){  
        int i = 1;  
        int total = 1;  
        while(i <= a){  
            total = total * i;  
            i++;  
        }  
        return total;  
    }

}
