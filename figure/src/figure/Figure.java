package figure;
//*  
//***  
//*****  
//*******  
//*****  
//***  
//
public class Figure {
	   public static void main(String[] args){  
	        int rbombusH = 10;  
	        int space = (rbombusH - 1) / 2 ;  
	        int countUp = 1;  
	        int whileTime = 1;  
	        int i = 0;  
	        while(whileTime <= (rbombusH - 1) / 2){  
	            i = 0;  
	            while(i < space) {  
	                System.out.print(" ");  
	                i++;  
	            }  
	            space -= 1;  
	            i = 0;  
	            if(whileTime == 1)  
	                while(i < countUp) {  
	                    System.out.print("*");  
	                    i++;  
	                }  
	            else  
	                while(i < countUp) {  
	                    System.out.print("*");  
	                    i++;  
	                }  
	            System.out.print("\n");  
	            countUp += 2;  
	            whileTime++;  
	        }  
	  
	        i = 0;  
	        while(i < countUp){  
	            System.out.print("*");  
	            i++;  
	        }  
	        System.out.print("\n");  
	        whileTime = 1;  
	        space = 1;  
	        while(whileTime <= (rbombusH - 1) / 2){  
	            countUp -= 2;  
	            i = 0;  
	            while(i < space){  
	                System.out.print(" ");  
	                i++;  
	            }  
	            i = 0;  
	            while(i < countUp){  
	                System.out.print("*");  
	                i++;  
	            }  
	            System.out.print("\n");  
	            whileTime++;  
	            space++;  
	        }  
	    }
}
