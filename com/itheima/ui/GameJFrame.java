package com.itheima.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    //游戏的业务逻辑写在这里
    //构造方法设定游戏界面的默认
    public GameJFrame() {


        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化图片
        initImage();

        //让界面显示出来，放在最后，不然可能会造成界面显示错误
        this.setVisible(true);
    }

    private void initImage() {
        //此变量用于对图片编号的计数，以便每次循环都能切换图片
        int number = 1;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                //创建一个图片ImageIcon对象
                ImageIcon icon = new ImageIcon("C:\\Users\\chenl\\IdeaProjects\\chenllucas\\com\\itheima\\ui\\sport1\\" + number + ".jpg");
                //创建一个JLabel的对象（管理容器）
                JLabel jLabel = new JLabel(icon);
                //指定图片的位置
                jLabel.setBounds(105 * i, 105 * j, 105, 105);

                //把管理容器添加到界面中
                //这个隐藏容器在创建JFrame的时候就已经创建好了，所以在这里就直接使用getContenPane方法就可以了
                this.getContentPane().add(jLabel);
                //number循环自增1
                number++;
            }
        }
    }

    private void initJMenuBar() {
        //初始化菜单
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单上面的两个选项的对象（功能、关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创建选项下面的条目
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        //将选项下面的条目添加到选项当中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        aboutJMenu.add(accountItem);

        //把选项添加到Menu中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //将Menu添加到Frame中
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //初始化界面
        //设置界面的宽高
        this.setSize(800, 800);
        //设置界面的标题
        this.setTitle("拼图游戏终极版v1.0 开发者；陈龙");
        //设置界面的置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置程序的默认关闭模式，关闭模式为关闭窗口之后程序就停止运行
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置
        this.setLayout(null);
    }
}
