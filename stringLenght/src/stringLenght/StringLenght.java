package stringLenght;
/** 
 *  写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。  
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
