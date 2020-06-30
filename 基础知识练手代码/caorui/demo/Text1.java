package com.caorui.demo;

public class Text1 {
    public static void main (String[] args) {
        int score=89;
        resultShow(score);
    }
    public static void  resultShow(int score){
        if(score>100){
            System.out.println("成绩输入有误");
        }else if(score>=90){
            System.out.println("优秀");
        }else if(score>=80){
            System.out.println("好");
        }else if(score>=70){
            System.out.println("良");
        }else if(score>=60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
    }
}
