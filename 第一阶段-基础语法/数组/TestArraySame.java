package cn.com.spdb.testidea04;

public class TestArraySame {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);

//        int[] arrayB = new int[3];
        int[] arrayB = arrayA;// 将arrayA的地址赋值给B
        arrayB[1] = 10;
        arrayB[2] = 20;
        System.out.println(arrayB);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);

        int[] scores = new int[]{5,15,25};
        int len = scores.length;// 获取数组长度
        System.out.println(scores);
        System.out.println("数组的长度是"+len);

        scores = new int[]{5,15,25,26};
        int len0 = scores.length;// 获取数组长度
        System.out.println(scores);
        System.out.println("数组的长度是"+len0);

    }
}
