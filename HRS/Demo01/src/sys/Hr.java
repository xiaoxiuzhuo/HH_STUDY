package sys;

import bean.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author ：Timber
 * @date ：Created in 2020/7/2 16:03
 * @modified By：
 */
public class Hr {
    //使用集合存储招聘学生
    List<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    //新增招聘学生
    public void addStudent(){
        System.out.print("请输入姓名：");
        String name = sc.next();
        //保证身份证号码唯一
        System.out.print("请输入身份证号码：");
        String id = sc.next();
        for (Student student : students) {
            if (student.getStudentID().equals(id)){
                System.out.println("学生信息重复，新增失败");
                return;
            }
        }
        System.out.print("请输入手机号码：");
        String num = sc.next();
        System.out.print("请输入邮件：");
        String email = sc.next();
        System.out.print("请输入应聘职位：");
        String position = sc.next();
        Student stu = new Student(name,id,num,email,position,1);
        students.add(stu);
        System.out.println("添加学生信息完成");
    }


    //删除一条学生记录，并不是真正的从集合中删除而是把状态位标记为0，这样的话查询的时候只需筛选状态位非0的对象即可
    public void delStudent(){
        System.out.print("请输入要删除学生的身份证号码：");
        String id = sc.next();
        int f = 0;
        for (Student student : students) {
            if(student.getStudentID().equals(id)){
                Student student1 = student;
                student1.setState(0);
                Collections.replaceAll(students,student,student1);
                f = 1;
                System.out.println("删除成功");
            }
        }
        if (f == 0){
            System.out.println("查无此人，无法删除");
        }
    }

    //修改招聘学生信息
    public void modifyInfo(){
        System.out.print("请输入需要修改的学生身份证号码：");
        String id = sc.next();
        int f = 0;
        for (Student student : students) {
            if (student.getStudentID().equals(id)){
                System.out.print("请输入姓名：");
                String name = sc.next();
                System.out.print("请输入手机号码：");
                String num = sc.next();
                System.out.print("请输入邮件：");
                String email = sc.next();
                System.out.print("请输入应聘职位：");
                String position = sc.next();
                Student stu = new Student(name,id,num,email,position,1);
                //把当前学生对象替换掉
                Collections.replaceAll(students,student,stu);
                f = 1;
            }
        }
        if (f == 0){
            System.out.println("查无此人，无法修改");
        }
    }

    //查询招聘学生
    public void searchStudents(){
        for (Student student : students) {
            if (student.getState() == 1){
                System.out.println(student);
            }
        }
    }

    Hr(){
        while (true){
            System.out.println("****浦发银行校园招聘系统****");
            System.out.println("添加招聘学生信息请按----1");
            System.out.println("删除招聘学生信息请按----2");
            System.out.println("修改招聘学生信息请按----3");
            System.out.println("查询招聘学生信息请按----4");
            System.out.println("退出请按--------------5");
            System.out.println("****浦发银行校园招聘系统****");
            int choice = sc.nextInt();
            int f = 1;
            switch (choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    delStudent();
                    break;
                case 3:
                    modifyInfo();
                    break;
                case 4:
                    searchStudents();
                    break;
                case 5:
                    f = 0;
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
            }
            if (f == 0){
                break;
            }
        }
        sc.close();
        System.out.println("您已退出浦发银行校园招聘系统");
    }

    public static void main(String[] args) {
        new Hr();
    }
}
