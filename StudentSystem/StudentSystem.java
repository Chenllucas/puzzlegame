package StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        //定义集合以保存学生的信息
        ArrayList<Student> list = new ArrayList<>();


        //打印学生管理系统的主界面
        System.out.println("=================欢迎来到学生管理系统================");
        System.out.println("请根据以下提示操作");
        System.out.println("t添加学生信息请按1");
        System.out.println("删除学生信息请按2");
        System.out.println("修改学生信息请按3");
        System.out.println("查询学生信息请按4");
        System.out.println("请输入您的操作");

        //录入用户的操作
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();


        //对用户录入的操作进行功能实现
        switch (choose){
            case 1:
                addInfo();
                break;
            case 2:
                System.out.println("del");
                break;
            case 3:
                System.out.println("change");
                break;
            case 4:
                System.out.println("query");
                break;
            default:
                System.out.println("参数错误，请重新输入");
        }

    }

    //定义方法，作用：添加学生信息
    private static void addInfo(){
        System.out.println("add");
    }
}
