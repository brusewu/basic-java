package nesting;
/** 
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。 
 *  1.程序分析：(a>b)?a:b这是条件运算符的基本例子。 
 * 
 *     答案正确 
 * */ 
public class Nesting {
    public static void main(String[] args){  
        int grade = 61;  
        System.out.println((grade>=90)?"A":(grade>=60)?"B":"C");  
    } 
}
