package com.itheima.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //注册相关的业务逻辑

    //用构造方法设定默认值
    public RegisterJFrame(){
        this.setSize(400,600);
        //设置界面的标题
        this.setTitle("注册界面");
        //设置界面的置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置程序的默认关闭模式，关闭模式为关闭窗口之后程序就停止运行
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //并使用setVisible方法把这个窗口显示出来
        this.setVisible(true);
    }
}
