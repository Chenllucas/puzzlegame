package com.itheima.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    //游戏的业务逻辑写在这里

    //构造方法设定游戏界面的默认值
    //设定像素宽为800像素，高为800像素
    //并使用setVisible方法把这个窗口显示出来
    public GameJFrame(){
        this.setSize(800,800);
        this.setVisible(true);
    }
}
