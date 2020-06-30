package com.caorui.demo;

/**
 * continue一旦执行，立刻跳过当前循环的剩余内容，马上开始下一次循环
 */
public class TestContinue {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            if(i==3){
                continue;//不打印数字3
            }
            System.out.println(i);
        }
    }
}
