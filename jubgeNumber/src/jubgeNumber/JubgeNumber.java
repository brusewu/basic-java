package jubgeNumber;
/*** 
 * 
 *一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少 
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
