package cn.com.spdb.testidea02;

/*
题目1：定义一个方法用来比较两个数字是否相同。
题目2：计算1-100所有数字的和。
题目3：打印相应次数的hellworld
*/
public class NumCompare {
    public static void main(String[] args) {
        boolean same = numSame(10, 10);
        System.out.println(same);
        System.out.println("1-100相加结果是"+sumNum());
        printNum(5);
    }

    public static boolean numSame(int a, int b) {
        /*boolean result;
        if (a == b) {
            result = true;
        } else {
            result = false;
        }*/
        return a == b;
    }
    public static int sumNum(){
        int sum=0;
        for(int i=1;i<=100;i++){
            sum +=i;
        }
        return sum;
    }
    public static void printNum(int i){
        for(int j=1;j<=i;j++){
            System.out.println("helloworld");
        }
    }
}
