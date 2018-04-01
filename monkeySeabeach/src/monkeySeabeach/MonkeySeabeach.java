package monkeySeabeach;
/** 
 *  题目：海滩上有一堆桃子，五只猴子来分。 
 *  第一只猴子把这堆桃子凭据分为五份，多了一个， 
 *  这只猴子把多的一   个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份， 
 *  又多了一个，它同样把多的一个扔入海中   ，拿走了一份，第三、第四、第五只猴子都是这样做的， 
 *  问海滩上原来最少有多少个桃子？ 
 * 
 * */
public class MonkeySeabeach {
	 public static void main(String[] args){  
	        int x = 2;  
	        int m = 1;  
	        int y = 0;  
	        int i = 0;  
	        int t = 0;  
	        while(true){  
	            for(i = 0 ; i < 5 ; i ++){  
	                t = 0;  
	                if(i == 0)  
	                    y = x;  
	                if((x - 1) % 5 == 0){  
	                    x = (x - 1) - (x - 1) / 5;  
	                }else{  
	                    t = 1;  
	                    x = y;  
	                    break;  
	                }  
	            }  
	            if(i == 5 && t == 0)            //i == 5 ,  不是 i == 4 !!!!!!!!  
	                break;  
	            x++;  
	        }  
	        System.out.println("y="+y);  
	    }  
}
