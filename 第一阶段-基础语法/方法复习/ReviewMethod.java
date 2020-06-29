package cn.com.spdb.testidea02;
/*
题目：打印一个20*5的矩形
 */
public class ReviewMethod {
    public static void main(String[] args) {
    recPrint();
    }
    public static void recPrint(){
        for(int i = 1;i <= 5;i++){
            for(int j = 1;j <= 20;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
