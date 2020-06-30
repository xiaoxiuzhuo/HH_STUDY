package cn.com.spdb.testidea04;

public class TestArray01 {
    public static void main(String[] args) {
        int[] scores = new int[300];// new一个数组
        double[] array0 = new double[10];
        String[] array1 = new String[5];

        int[] scores1 = new int[]{5,15,25};
        String[] array2 = new String[]{"hello","java","world"};

        int[] scores3 = {5,15,25};// 省略格式

        System.out.println(scores3[1]);
        System.out.println(scores3);// 直接打印，是打印数组的内存地址

        System.out.println(array0[1]);
        array0[1] = 123.8;
        System.out.println(array0[1]);
    }
}
