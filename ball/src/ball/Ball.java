package ball;

/** 
 * һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£������ڵ�10�����ʱ�������������ף���10�η�����ߣ� 
 * 
 * */
public class Ball {
	
    public static void main(String[] args){  
        int time = 1;  
        double h = 100;  
        double totalH = 0;  
        while(time <= 10){  
            totalH = totalH + h + h/2;  
            h = h/2;  
            time++;  
        }  
        System.out.println("10����ع�����: "+totalH+"\n��10�η����߶�Ϊ "+h);  
    }
}
