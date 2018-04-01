package yangHui;
/** 
 *                   
 *     1            5 
 *    1 1           4 
 *   1 2 1          3 
 *  1 3 3 1         2 
 * 1 4 6 4 1       1 
 *1 5 10 10 5 1     0 
 * */  
public class YangHui {

	   public static void main(String[] args){  
	        int row = 10;  
	        int timeRow = 1;  
	        int spaceCount = row - 1;  
	        int numberCount = 1;  
	        int[] number = new int[100];  
	        int[] newNumber = new int[100];  
	        newNumber[0] = 1;  
	        number[0] = 1; number[1] = 1;  
	        int m,n;  
	        while(timeRow <= row){  
	            for(int i = 0;i < spaceCount;i++)  
	                System.out.print(" ");  
	            spaceCount --;  
	            if(numberCount == 1)  
	                System.out.print("1 ");  
	            else if(numberCount == 2)  
	                System.out.print("1 1 ");  
	            else{  
	                System.out.print("1 ");  
	                m = 0;n = timeRow - 2;  
	                while((m + 1) <= n){  
	                    System.out.print(number[m] + number[m + 1]+" ");  
	                    newNumber[m + 1] =  number[m] + number[m + 1];      // 1  
	                    m++;  
	  
	                }  
	                newNumber[n + 1] = 1;  
	                System.out.print("1 ");  
	                number = newNumber.clone();                     //难点:不能使用number = newNumber,这是按引用传递,在1处会出错  
	            }                                                   //(在使用1后不是单单对newNumber进行了操作,对number数组也进行了操作,)  
	                                                                //.clone为复制数组,number的操作不会影响newNumber数组  
	            numberCount ++;  
	            timeRow ++;  
	            System.out.print("\n");  
	        }  
	    } 
}
