package statistiscsString;
/** 
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数 
 *          答案正确 
 * 
 * */
public class StatistiscsString {

    public static void main(String[] args){  
        int countGrapheme = 0,countDigit = 0,countSpace = 0,countOther = 0;  
        String string =new String("askqiwu       1123109q2 w***&^%$#$%1 3m ");  
        int time = 0;  
        while(time < string.length()){      //如果加了一个= 变成 time <= string.length() 就会报错,越界  
            if(((int)string.charAt(time) >= 65 && (int)string.charAt(time) <= 90) || ((int)string.charAt(time) >= 97 && (int)string.charAt(time) <= 122))  
                countGrapheme++;  
            else if((int)string.charAt(time) >= 48 && (int)string.charAt(time) <= 57)  
                countDigit++;  
            else if((int)string.charAt(time) == 32)  
                countSpace++;  
            else  
                countOther++;  
  
            time++;  
        }  
        System.out.println("Grapheme = "+countGrapheme+"\n"+"Digit = "+countDigit+"\n"+"Space = "+countSpace+"\n"+"Other"+countOther);  
    } 
}
