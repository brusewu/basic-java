package test1;
/** 
 * 
 * *   ��һ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡� 
* **/ 
public class Test1 {
    public static void main(String[] atgs){  
        System.out.print(getNumber("1989898980"));  
    }  
    public static int getNumber(String string){  
        int oriNumber = Integer.valueOf(string);  
        int newNumber = 0;  
        int numberCount = string.length();  
        int time = string.length() - 1;  
        for(int i = 1;i <= string.length();i++){  
            newNumber += getSpNumber(i,oriNumber) * Math.pow(10,time--);  
        }  
        return newNumber;  
    }  
    public static int getSpNumber(int a,int number){  
        if(a == 1){  
            return number % 10;  
        }else{  
            return (int) ((int) ((number % Math.pow(10,a)) - (number % Math.pow(10,a-1))) / Math.pow(10,(a - 1)));  
        }  
    } 
}
