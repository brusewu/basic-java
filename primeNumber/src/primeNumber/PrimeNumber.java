package primeNumber;

/** 
 * 
 * //import static java.lang.Math.sqrt;        //��������ַ�ʽ���� ����sqr�����ǲ���Ҫʹ��Math.������ ��ֱ��ʹ�ú���sqrt()
 *  ��Ŀ���ж�101-200֮���ж��ٸ���������������������� 
 1.����������ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)������ܱ������� 
 ���������������������֮�������� 
 
        �Ѳ���,����ȷ 
 
 */
public class PrimeNumber {

	public static void main(String [] args){  
        int number = 101,count = 0;  
        while(number <= 200){  
            if(calculatePrimeNumber(number) == false){  
                count++;  
                System.out.println(number+"������");  
            }  
            number++;  
        }  
        System.out.println("����"+count+"������");  
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
