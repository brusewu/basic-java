package stringRank;

import java.util.Scanner;

/** 
 *  ×Ö·û´®ÅÅÐò 
 * 
 *  */ 
public class StringRank {

	public static void main(String[] args){  
        Scanner in  = new Scanner(System.in);  
        int number = 4;  
        String[] string = new String[20];  
        for(int forTime = 0;forTime < number;forTime ++) {  
            string[forTime] = in.next();  
        }  
        int i ,j,k;  
        int time = 0;  
        String change = new String();  
        change = null;  
        for(i = 0; i < number ; i ++){  
            for(j = i + 1; j < number; j++){  
                k = 0;  
                time = 0;  
                while(time == 0 && k < string[i].length() && k < string[j].length()){  
                    if(string[i].charAt(k) > string[j].charAt(k)){  
                        time = 1;  
                    }else if(string[i].charAt(k) < string[j].charAt(k)){  
                        change = string[i]; string[i] = string[j]; string[j] = change;  
                        time = 1;  
                    }else if(string[i].charAt(k) == string[j].charAt(k)) {  
                        if (k == string[i].length() - 1 && k != string[j].length() - 1) {   //abc abcdµÄÇé¿ö  
                            change = string[i];  
                            string[i] = string[j];  
                            string[j] = change;  
                            time = 1;  
                        } else {  
                            time = 0;  
                            k++;  
                        }  
                    }  
                }  
            }  
        }  
        for(int forTime = 0; forTime < number ; forTime ++){  
            System.out.println(string[forTime]);  
        }  
    } 
}
