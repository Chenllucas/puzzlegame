package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowStateListener;

public class test2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        //设置界面的宽高
        jFrame.setSize(603,680);
        //设置页面标题
        jFrame.setTitle("事件演示");
        //设置界面置顶
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        jFrame.setLayout(null);


        //创建一个按钮对象
        JButton jtb = new JButton("点我啊");
        //设置位置和宽高
        jtb.setBounds(0,0,200,200);
        //给按钮添加动作监听
        //jtb：组件对象，表示你要给哪个组件添加事件
        //addActionListener：表示我要给组件添加哪个事件监听（动作监听鼠标左键，空格）
        jtb.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("看到此项，表示已经点击了按钮");
            }
        });

        //把按钮添加到界面当中去
        jFrame.getContentPane().add(jtb);
        //让框架显示出来
        jFrame.setVisible(true);
    }
}
