package shuzi;
/** 
 * 
 * ��1��2��3��4�����֣�����ɶ��ٸ� ������ͬ �� ���ظ����� ����λ�������Ƕ��٣� 
 * 
 *      ����for!!!!!no-complicatino 
 * 
 * */ 
public class ShuZi {

	public static void main(String[] args){  
        int i,j,k,count = 0;  
        for(i = 1;i <= 4;i++){  
            for(j = 1;j <= 4;j++){  
                if(i != j){  
                    for(k = 1;k <= 4;k++){  
                        if(k!=i && k!=j){  
                            System.out.println(i*100+j*10+k);  
                            count++;  
                        }  
                    }  
                }  
            }  
        }  
        System.out.println("����"+count);  
    }  
}
