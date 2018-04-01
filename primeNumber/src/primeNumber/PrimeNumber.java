package primeNumber;

/** 
 * 
 * //import static java.lang.Math.sqrt;        //如果用这种方式导入 调用sqr方法是不需要使用Math.来调用 可直接使用函数sqrt()
 *  题目：判断101-200之间有多少个素数，并输出所有素数。 
 1.程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除， 
 则表明此数不是素数，反之是素数。 
 
        已测试,答案正确 
 
 */
public class PrimeNumber {

	public static void main(String [] args){  
        int number = 101,count = 0;  
        while(number <= 200){  
            if(calculatePrimeNumber(number) == false){  
                count++;  
                System.out.println(number+"是素数");  
            }  
            number++;  
        }  
        System.out.println("共有"+count+"个素数");  
    }  
    public static boolean calculatePrimeNumber(int number){  
        for(int forTime = 2;forTime <=Math.sqrt(number);forTime++){  
            if(number%forTime == 0){  
                return true;  
            }  
        }  
        return false;  
    }  
}
