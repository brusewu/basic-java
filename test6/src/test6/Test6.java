package test6;
/** 
 *  题目：809*??=800*??+9*??+1 
 *   其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。求??代表的两位数，及809*??后的结果。 
 * 
 * */ 
public class Test6 {

    public static void main(String[] args){  
        int i;  
        for(i = 10 ; i <= 99 ; i ++){  
            if(8 * i >= 10 && 8 * i <= 99)  
                if(9 * i >= 100 && 9 * i <= 999)  
                    if(809 * i == 800 * i + 9 * i + 1)  //这个题目无解  除非去掉算式最后的+1  
                        break;  
        }  
        System.out.println(i);  
    } 
}
