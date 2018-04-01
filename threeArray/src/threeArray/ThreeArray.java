package threeArray;
/** 
 * 
 *  求一个3*3矩阵对角线元素之和 
 * 
 * */ 
public class ThreeArray {

    public static void main(String[] args) {  
        int[][] threeArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};  
        int total1 = 0;  
        int total2 = 0;  
        int i, j;  
        for( i = 0,j = 0;i < 3 && j < 3;i++,j++) {  
            total1 += threeArray[i][j];  
        }  
        for(i = 0 ,j = 2;i < 3 && j >= 0;i++,j--){  
            total2 += threeArray[i][j];  
        }  
        System.out.println(total1+" "+total2);  
    }
}
