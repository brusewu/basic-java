package inserNumberToArray;

import java.util.Scanner;

/** 
 *��һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ������������� 
 * 
 *      //SP 11112345����� ��ͷ������������ͬ����� 
 * */ 
public class InserNumberToArray {

	   public static int arrayCount = 6;   //�����м�������  
	private static Scanner in;
	    public static void main(String[] args){  
	        in = new Scanner(System.in);  
	        int[] number = new int[100];  
	        for(int i = 0;i < arrayCount;i++){  
	            number[i] = in.nextInt();  
	        }  
	        int[] newNumber = Fun(number,9);  
	        for(int i = 0;i < arrayCount + 1;i++){  
	            System.out.println(newNumber[i]);  
	        }  
	    }  
	    public static int[] Fun(int[] number,int i){  
	        if(number[0] > number[1]){  
	            if(i >= number[0]){  
	                for(int time = arrayCount;time > 0;time--){  
	                    number[time] = number[time - 1];  
	                }  
	                number[0] = i ;  
	            }else{  
	                int time = 0;  
	                while(true){  
	                    if(number[time] >= i && number[time + 1] <= i){  
	                        break;  
	                    }  
	                    if(time != arrayCount - 1)  
	                        time++;  
	                    else  
	                        break;  
	                }  
	                time++;  
	                for(int time1 = arrayCount - 1;time1 >= time;time1 --){  
	                    number[time1 + 1] = number[time1];  
	                }  
	                number[time] = i;  
	             }  
	            return number;  
	        }else if(number[0] < number[1]){  
	            if(i <= number[0]){  
	                for(int time = arrayCount;time > 0;time--){  
	                    number[time] = number[time - 1];  
	                }  
	                number[0] = i ;  
	            }else{  
	                int time = 0;  
	                while(true){  
	                    if(number[time] <= i && number[time + 1] >= i){  
	                        break;  
	                    }  
	                    if(time != arrayCount - 1)  
	                        time++;  
	                    else  
	                        break;  
	                }  
	                time++;  
	                for(int time1 = arrayCount - 1;time1 >= time;time1 --){  
	                    number[time1 + 1] = number[time1];  
	                }  
	                number[time] = i;  
	            }  
	            return number;  
	        }else{  
	            int k = 1;  
	            int j = 2;  
	            while(number[k] == number[j]){  
	                k++;  
	                j++;  
	            }  
	            if(number[k] > number[j]){  
	                if(i >= number[0]){  
	                    for(int time = arrayCount;time > 0;time--){  
	                        number[time] = number[time - 1];  
	                    }  
	                    number[0] = i ;  
	                }else{  
	                    int time = k;  
	                    while(true){  
	                        if(number[time] >= i && number[time + 1] <= i){  
	                            break;  
	                        }  
	                        if(time != arrayCount - 1)  
	                            time++;  
	                        else  
	                            break;  
	                    }  
	                    time++;  
	                    for(int time1 = arrayCount - 1;time1 >= time;time1 --){  
	                        number[time1 + 1] = number[time1];  
	                    }  
	                    number[time] = i;  
	                }  
	                return number;  
	            }else if(number[k] < number[j]){  
	                if(i <= number[k]){  
	                    for(int time = arrayCount;time > 0;time--){  
	                        number[time] = number[time - 1];  
	                    }  
	                    number[0] = i ;  
	                }else{  
	                    int time = k;  
	                    while(true){  
	                        if(number[time] <= i && number[time + 1] >= i){  
	                            break;  
	                        }  
	                        if(time != arrayCount - 1)  
	                            time++;  
	                        else  
	                            break;  
	                    }  
	                    time++;  
	                    for(int time1 = arrayCount - 1;time1 >= time;time1 --){  
	                        number[time1 + 1] = number[time1];  
	                    }  
	                    number[time] = i;  
	                }  
	                return number;  
	            }  
	        }  
	        return number;  
	    }  
}