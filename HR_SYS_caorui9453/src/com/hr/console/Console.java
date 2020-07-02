package com.hr.console;

import com.hr.bean.Applicant;
import com.hr.bean.ApplicantList;

import java.util.LinkedList;
import java.util.Scanner;

public class Console {
    public void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入招聘者姓名");
        String name = sc.nextLine();//获得学生姓名
        System.out.println("输入招聘者身份证号");
        String id = sc.nextLine();//获得学生身份证号
        Applicant ap = new Applicant(name, id);//创建一个学生对象
        ApplicantList list = new ApplicantList();
        list.getApList().add(ap);//把该对象放到list里
        System.out.println("录入成功");
    }

    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入需要删除的招聘者的身份证号");
        String id = sc.nextLine();//获得学生身份证号
        ApplicantList list = new ApplicantList();
        LinkedList<Applicant> apList = list.getApList();
        //遍历list
        for (Applicant ap : apList) {
            if (ap.getId().equals(id) ) {
                ap.setDeleteStatus(0); //修改ap的属性
                break;
            }
        }


    }

    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入需要更改的招聘者的身份证号");
        String id = sc.nextLine();//获得学生身份证号
        //先找到这个学生，把他的信息拿到，并从列表中删除
        ApplicantList list = new ApplicantList();
        LinkedList<Applicant> apList = list.getApList();
        Applicant student=null;
        //遍历list
        for (Applicant ap : apList) {
            if (ap.getId().equals(id)) {
                student=ap;
                apList.remove(ap);
                break;
            }
        }
        System.out.print("姓名：" + student.getName() + "  "+
                "学校：" + student.getSchool() + "  "+
                "状态：" + student.getProcess()+ "  "+
                "删除状态：" + student.getDeleteStatus() );//输出学生的信息
        System.out.println();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入招聘者姓名");
//        String name = sc.nextLine();//获得学生姓名
//        System.out.println("输入招聘者身份证号");
//        String id = sc.nextLine();//获得学生身份证号
//        Applicant ap = new Applicant(name, id);//创建一个学生对象


        int choice;
        String name;
        System.out.println("是否修改该学生的姓名：如需修改请输入1" );
        choice=sc.nextInt();
        if(choice==1){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("请输入姓名" );
            name=sc1.nextLine();
            student.setName(name);
        }


        System.out.println("是否修改该学生的学校：如需修改请输入1" );
        choice=sc.nextInt();
        if(choice==1){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("请输入学校" );
            String school=sc1.nextLine();
            student.setSchool(school);
        }


        System.out.println("是否修改该学生的状态：如需修改请输入1" );
        choice=sc.nextInt();
        if(choice==1){
            System.out.println("请输入状态：" +
                    "     0：已申请\n" +
                    "     1：简历通过\n" +
                    "     2：笔试通过\n" +
                    "     3：体检通过\n" +
                    "     4：背调通过\n" +
                    "     5：已签约\n" +
                    "     6：已入职" );
            Scanner sc1 = new Scanner(System.in);
            int process=sc1.nextInt();
            student.setProcess(process);
        }



        apList.add(student);
        System.out.println("修改成功");

    }

    /**
     * 查询
     *
     *
     */
    public void select() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入需要查询的招聘者的身份证号");
        String id = sc.nextLine();//获得学生身份证号
        ApplicantList list = new ApplicantList();
        LinkedList<Applicant> apList = list.getApList();
        Applicant stu=null;
        //遍历list
        for (Applicant ap : apList) {
            if (ap.getId() .equals(id) &&ap.getDeleteStatus()==1) {

                stu=ap;
                System.out.print("姓名：" + stu.getName() + "  ");
                System.out.print("ID：" + stu.getId() + "  ");
                System.out.println("状态：" + stu.getProcess());
                break;
            }
        }
        if(stu==null){
            System.out.println("查无此人");
        }

    }

    public static void main(String[] args) {
        ApplicantList list = new ApplicantList();
        LinkedList<Applicant> apList = list.getApList();
        boolean exit = true;
        Console console = new Console();
        while (exit) {
            System.out.println("输入1录入招聘者");
            System.out.println("输入2查询招聘者");
            System.out.println("输入3删除招聘者");
            System.out.println("输入4更改招聘者");
            System.out.println("输入5查看所有招聘者");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 1) {
                console.insert();
            } else if (choice == 2) {
                console.select();
            } else if (choice == 3) {
                console.delete();
            } else if (choice == 4) {
                console.update();
            } else if (choice == 5) {
                System.out.println("共有" + apList.size() + "位招聘者");
                for (Applicant ap : apList) {
                    if(ap.getDeleteStatus()==1){
                        System.out.print("姓名：" + ap.getName() + "  ");
                        System.out.print("学校：" + ap.getSchool() + "  ");
                        System.out.print("ID：" + ap.getId() + "  ");
                        System.out.print("状态：" + ap.getProcess()+ "  ");
                        System.out.println("删除状态：" + ap.getDeleteStatus());
                    }

                }

            } else {
                System.out.println("输入有误，请重新输入");
            }
        }


    }
}
