package wanShu;
/** 
 * ��Ŀ��һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ"����"������6=1��2��3.��� �ҳ�1000���ڵ��������� 
 * 
 * */ 
public class WanShu {
    public static void main(String [] args){  
        int total = 0;  
        int time = 1;  
        int time1 = 0;  
        int forTime;  
        while(time <= 1000){  
            for(forTime = 1;forTime < time;forTime++){      //����forTime <= time ,���ܼ��� = ;  
                if(time%forTime == 0){  
                    total=total+forTime;  
                }  
            }  
  
            if(time == total){  
                System.out.println(time+" ������!");  
            }  
            time++;  
            total = 0;  
        }  
    }  

}
