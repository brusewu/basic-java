package qiuHe;
/** 
 * ��һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡� 
 * 
 * 
 *                 ����ȷ 
 * */
public class QiuHe {
    public static void main(String[] args){  
        int count = 20;  
        double up = 2, down = 1;  
        double total = 0;  
        int i = 1;  
        double time = 0;  
        while(i <= count){  
            total += up / down;  
            time = down;  
            down = up;  
            up = time + up;  
            i++;  
        }  
        System.out.println(total);  
    }  
}
