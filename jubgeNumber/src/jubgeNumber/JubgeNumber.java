package jubgeNumber;
/*** 
 * 
 *һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��� 
 */ 
public class JubgeNumber {
    public static void main(String[] args){  
        int i = 11;  
        int number =9;  
        //System.out.println((int)Math.sqrt(5));  
        while(true){  
            if(calculate(number + 100) == true && calculate(number + 268) == true){  
                System.out.println(number);  
                break;  
            }  
            number++;  
        }  
    }  
    public static boolean calculate(int number){  
        if((int)Math.sqrt(number) * (int)Math.sqrt(number) == number)  
            return true;  
        return false;  
    } 
}
