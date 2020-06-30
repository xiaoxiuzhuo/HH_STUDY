package cn.com.spdb.testidea04;

/*
题目1：遍历数组
题目2：求出数组中的最大值
题目3：数组元素翻转
*/
public class TestArrayTraversal {
    public static void main(String[] args) {
        //题目1
        int[] array0 = new int[]{10, 20, 40, 23, 87};
        for (int i = 0; i <= array0.length - 1; i++) {
            System.out.println(array0[i]);
        }

        // 题目2
        int max0 = array0[0];
        for (int j = 1; j < array0.length; j++) {
            if (array0[j] > max0) {
                max0 = array0[j];
            }
        }
        System.out.println(max0);

        System.out.println("=========================");
        // 题目3
        for (int min = 0, max = array0.length-1; min < max; min++,max--) {
            int temp;
            temp = array0[max];
            array0[max] = array0[min];
            array0[min] = temp;
        }
/*        for (int i = 0; i < array0.length; i++) {
            System.out.println(array0[i]);
        }*/

        // 数组作为方法参数
        printArray(array0);

        // 数组作为方法返回值
        System.out.println(sum(10,20)[1]);
    }
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static int[] sum(int a,int b){
        int sum = a+b;
        int del = a-b;
        int[] array = new int[2];
        array[0] = sum;
        array[1] = del;
        return array;
    }
}
