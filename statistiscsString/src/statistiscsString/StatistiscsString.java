package statistiscsString;
/** 
 * ����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ��� 
 *          ����ȷ 
 * 
 * */
public class StatistiscsString {

    public static void main(String[] args){  
        int countGrapheme = 0,countDigit = 0,countSpace = 0,countOther = 0;  
        String string =new String("askqiwu       1123109q2 w***&^%$#$%1 3m ");  
        int time = 0;  
        while(time < string.length()){      //�������һ��= ��� time <= string.length() �ͻᱨ��,Խ��  
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
