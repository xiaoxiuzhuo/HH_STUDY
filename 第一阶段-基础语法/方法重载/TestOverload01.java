package cn.com.spdb.testidea03;
/*
题目1：比较两个数据是否相等：
两个byte，两个short，两个int，两个long
*/
public class TestOverload01 {
    public static void main(String[] args) {
        System.out.println(numSame(10,20));
        System.out.println(numSame((short)1,(short)1));
        System.out.println(numSame(10L,20L));
        System.out.println(numSame((byte) 10,(byte)20));//大转小为强制类型转换
    }

    // 比较两个数据是否相等
    public static boolean numSame(int a, int b) {
        System.out.println("int");
        return a == b;
    }
    public static boolean numSame(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }
    public static boolean numSame(short a, short b) {
        System.out.println("short");
        return a == b;
    }
    public static boolean numSame(long a, long b) {
        System.out.println("long");
        return a == b;
    }
}
