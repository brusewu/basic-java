package recurrence;
/** 
 *  ���õݹ鷽����5! 
 * 
 * ���Ѵ�: 
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
  
    public static int JieCheng(int a) {  //���������ݹ�  
        if (a < time) {  
            total += total * a;  
            a++;  
            JieCheng(a);  
        }  
        return total;  
    }  
    public static int JieCheng2(int a){     //�ǵݹ�,�����ݹ������ͬ,ʹ����final����time,ʹ������  
        if(a > time)  
            return 1;  
        else{  
            return a * JieCheng2(a + 1);  
        }  
  
    }  
    public static int getResult(int n) {   //�����ݹ�,���԰ٶ�֪��  
        if (n == 1) {  
            return 1;  
        } else {  
            return n * getResult(n - 1);  
        }  
    }  
}
