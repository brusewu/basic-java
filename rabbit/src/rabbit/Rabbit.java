package rabbit;
/** 
题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子， 
 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？ 
1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21.... 
 
            解:每一个月兔子总数等于前两个月的兔子总数之和 
            已测试 答案正确 
 **/ 
public class Rabbit {

	public static void main(String [] args){  
        int[] rabbit = new int[100];  
        int month = 0;  
        rabbit[0] = 1;  
        while(month <= 23){  
            if(month == 0){  
                System.out.printf("第%d月 = %d\n",month+1,rabbit[month]);  
            }  
            if(month == 1){  
                rabbit[month] = rabbit[month-1];  
                System.out.printf("第%d月 = %d\n",month+1,rabbit[month]);  
            }  
            if(month > 1) {  
                rabbit[month] = rabbit[month - 1] + rabbit[month - 2];  
                System.out.printf("第%d月 = %d\n", month + 1, rabbit[month]);  
            }  
                month++;  
        }  
  
    }  
}
