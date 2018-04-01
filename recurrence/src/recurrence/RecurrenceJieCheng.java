package recurrence;
/** 
 *  利用递归方法求5! 
 * 
 * 网友答案: 
 *   public int getResult(int n){ 
        if(n==1){ 
            return 1; 
        }else{ 
            return n*getResult(n-1); 
        } 
 
 
 * */
public class RecurrenceJieCheng {

	public static final int time = 4;  
    public static int total = 1;  
  
    public static void main(String[] args) {  
        System.out.println(JieCheng2(1));  
        //System.out.println(getResult(4));  
  
  
    }  
  
    public static int JieCheng(int a) {  //不是完美递归  
        if (a < time) {  
            total += total * a;  
            a++;  
            JieCheng(a);  
        }  
        return total;  
    }  
    public static int JieCheng2(int a){     //是递归,不过递归防方向不同,使用了final数据time,使程序繁琐  
        if(a > time)  
            return 1;  
        else{  
            return a * JieCheng2(a + 1);  
        }  
  
    }  
    public static int getResult(int n) {   //完美递归,来自百度知道  
        if (n == 1) {  
            return 1;  
        } else {  
            return n * getResult(n - 1);  
        }  
    }  
}
