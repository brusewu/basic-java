package com.bruse;
/** 
 * ��5��������һ�� 
 * �ʵ�����˶����ꣿ��˵�ȵ�4���˴�2�ꡣ 
 * �ʵ�4������������˵�ȵ�3���˴�2�ꡣ 
 * �ʵ������ˣ���˵�ȵ�2�˴����ꡣ 
 * �ʵ�2���ˣ�˵�ȵ�һ���˴����ꡣ 
 * ����ʵ�һ���ˣ���˵��10�ꡣ 
 * ���ʵ�����˶�� 
 * 
 * 
 *  ʹ�õݹ��㷨 
 * 
 * */
public class Age {
	
    public static void main(String[] args){  
        System.out.print(getAge(5));  
    }  
    public static int getAge(int person){  
        if(person == 1)  
            return 10;  
        else  
            return getAge(person - 1) + 2;  
    } 
}
