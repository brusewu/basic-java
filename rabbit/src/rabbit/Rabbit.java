package rabbit;
/** 
��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ� 
 С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣� 
1.��������� ���ӵĹ���Ϊ����1,1,2,3,5,8,13,21.... 
 
            ��:ÿһ����������������ǰ�����µ���������֮�� 
            �Ѳ��� ����ȷ 
 **/ 
public class Rabbit {

	public static void main(String [] args){  
        int[] rabbit = new int[100];  
        int month = 0;  
        rabbit[0] = 1;  
        while(month <= 23){  
            if(month == 0){  
                System.out.printf("��%d�� = %d\n",month+1,rabbit[month]);  
            }  
            if(month == 1){  
                rabbit[month] = rabbit[month-1];  
                System.out.printf("��%d�� = %d\n",month+1,rabbit[month]);  
            }  
            if(month > 1) {  
                rabbit[month] = rabbit[month - 1] + rabbit[month - 2];  
                System.out.printf("��%d�� = %d\n", month + 1, rabbit[month]);  
            }  
                month++;  
        }  
  
    }  
}
