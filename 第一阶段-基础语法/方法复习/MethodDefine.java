package cn.com.spdb.testidea02;

public class MethodDefine {
    public static void main(String[] args) {
        System.out.println(maxNum(19,29));
    }
    public static int maxNum(int a,int b){
        int result;
        result = a>b?a:b;
        return result;
    }
}
