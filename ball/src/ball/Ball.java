package ball;

/** 
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？ 
 * 
 * */
public class Ball {
	
    public static void main(String[] args){  
        int time = 1;  
        double h = 100;  
        double totalH = 0;  
        while(time <= 10){  
            totalH = totalH + h + h/2;  
            h = h/2;  
            time++;  
        }  
        System.out.println("10次落地共经过: "+totalH+"\n第10次反弹高度为 "+h);  
    }
}
