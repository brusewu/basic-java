package stringLenght;
/** 
 *  дһ����������һ���ַ����ĳ��ȣ���main�����������ַ�����������䳤�ȡ�  
 * 
 * */
public class StringLenght {
    public static void main(String[] args) {  
        System.out.println(Fun("absdn hsjnah"));  
    }  
  
    public static int Fun(String string) {  
        int i = 0;  
        try {  
            while (string.charAt(i) != '\0')  
                i++;  
        } catch (Exception e) {  
            return i;  
        }  
    return 0;  
    } 
}
