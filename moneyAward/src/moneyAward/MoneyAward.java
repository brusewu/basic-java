package moneyAward;

import java.util.Scanner;

/** 
 * ��ҵ���ŵĽ������������ɡ�����(I)���ڻ����10��Ԫʱ���������10%�� 
 * �������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣��ɿ����7.5%�� 
 * 20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%�� 
 * 40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%�� 
 * 60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%�� 
 * ����100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ� 
 * �Ӽ������뵱������I����Ӧ���Ž��������� 
 * 
 * 
 * */
public class MoneyAward {

	public static void main(String[] args){  
        Scanner in = new Scanner(System.in);  
        double profit = in.nextDouble();  
        double moneyAward = 0;  
        if(profit <= 100000){  
            moneyAward = profit * 0.1;  
        }else if(profit < 200000){  
            moneyAward = 100000 * 0.1 + (profit - 100000) * 0.075;  
        }else if(profit < 400000){  
            moneyAward = 200000 * 0.1 + (profit - 200000) * 0.05;  
        }else if(profit < 600000){  
            moneyAward = 400000 * 0.1 +(profit - 400000) * 0.03;  
        }else if(profit < 1000000){  
            moneyAward = 600000 * 0.1 +(profit - 600000) * 0.15;  
        }else{  
            moneyAward = 1000000 * 0.1 +(profit - 1000000) * 0.01;  
        }  
        System.out.println(moneyAward);  
    }  
}
