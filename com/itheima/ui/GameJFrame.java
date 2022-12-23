package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.util.Random;

public class GameJFrame extends JFrame {

    //创建一个二维数组
    //目的：管理数组
    //加载图片的时候会根据二维数组中的数据进行加载
    int[][] data = new int[4][4];
    //游戏的业务逻辑写在这里
    //构造方法设定游戏界面的默认
    public GameJFrame() {


        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据（打乱）
        initData();


        //初始化图片（根据打乱之后的结果去加载图片）
        initImage();

        //让界面显示出来，放在最后，不然可能会造成界面显示错误
        this.setVisible(true);
    }


    //初始化数据（打乱）
    private void initData() {
/*
        思路：
        1，定义一个一维数组，这个数组里面的元素对应了每个图片的对应位置
        2，打乱数组中的数据顺序
        3，创建一个二维数组
        4，把打乱的数组里面的元素添加到二维数组里面去
         */

        //1，定义一个一维数组，这个数组里面的元素对应了每个图片的对应位置
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        //2，打乱数组中的数据顺序
        //遍历数组，得到每一个元素，然后用每一个元素跟随机索引上的数进行交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //定义一个变量来储存随机的索引
            int index = r.nextInt(tempArr.length);
            //然后把每一个元素跟这个随机索引上的数进行交换
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }


        //3，遍历一维数组内的元素
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + ",");
        }




//        //4,给二维数组添加数组
//        //解法1
//        //先遍历二维数组
//        //然后把一维数组中的元素逐个添加到二维数组中去
//        for (int i = 0; i < tempArr.length; i++) {
//            data[i / 4][i % 4] = tempArr[i];
//        }
//
//        //遍历二维数组，验证答案是否正确
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                System.out.print(data[i][j] + " ");
//            }
//        }

        //解法2
        //遍历二维数组，给里面的每一个数组赋值
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = tempArr[index];
                index++;
            }
        }

        //遍历二维数组
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
        }
    }

    private void initImage() {

        //路径分为两种
        //绝对路径：一定是从盘符开始的。C:\
        //相对路径：不是从盘符开始的。 aaa\\bbb
        //相对路径是相对当前项目而言
        //在当前项目下，去找项目下的aaa文件夹中的bbb文件
        //先加载的图片在上方，后加载的图片在下方

        //此变量用于对图片编号的计数，以便每次循环都能切换图片
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                //获取当前要加载图片的序号
                int num = data[i][j];
                //创建一个图片ImageIcon对象
                ImageIcon icon = new ImageIcon("C:\\Users\\chenl\\IdeaProjects\\chenllucas\\com\\itheima\\ui\\sport1\\" + num + ".jpg");
                //创建一个JLabel的对象（管理容器）
                JLabel jLabel = new JLabel(icon);
                //指定图片的位置
                jLabel.setBounds(105 * i + 83, 105 * j + 134, 105, 105);

                //给图片添加边框
                //可以传递两个值，1是让图片凹进去，0是凸出来
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //把管理容器添加到界面中
                //这个隐藏容器在创建JFrame的时候就已经创建好了，所以在这里就直接使用getContenPane方法就可以了
                this.getContentPane().add(jLabel);
            }
        }
        //添加背景图片
        ImageIcon bg = new ImageIcon("C:\\Users\\chenl\\IdeaProjects\\chenllucas\\com\\itheima\\ui\\background.png");
        JLabel background = new JLabel(bg);
        background.setBounds(40,40,508,560);
        //把背景图片添加到界面当中
        this.getContentPane().add(background);

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
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("拼图游戏终极版v1.0 开发者；陈龙");
        //设置界面的置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置程序的默认关闭模式，关闭模式为关闭窗口之后程序就停止运行
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
    }
}
