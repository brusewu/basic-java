package wanShu;
/** 
 * 题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程 找出1000以内的所有完数 
 * 
 * */ 
public class WanShu {
    public static void main(String [] args){  
        int total = 0;  
        int time = 1;  
        int time1 = 0;  
        int forTime;  
        while(time <= 1000){  
            for(forTime = 1;forTime < time;forTime++){      //不能forTime <= time ,不能加上 = ;  
                if(time%forTime == 0){  
                    total=total+forTime;  
                }  
            }  
  
            if(time == total){  
                System.out.println(time+" 是完数!");  
            }  
            time++;  
            total = 0;  
        }  
    }  

}
