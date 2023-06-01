package com.example.clientsystem.frame;


import com.example.clientsystem.util.WindowUtil;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//主界面
public class MainFrame extends JFrame {
    private JMenuBar menuBar;    //应用菜单条。
    private JMenu product_menu;    //"学生管理"菜单。
    private JMenu score_Management;    //"成绩管理"菜单。
    private JMenu personal_Management;    //"个人管理"菜单。
    private JMenuItem add_Student;    //"添加学生"菜单项。
    private JMenuItem query_Student;    //"查询学生信息"菜单项。
    private JMenuItem modify_Student;    //"修改学生信息"菜单项。
    private JMenuItem delete_Student;    //"删除学生"菜单项。
    private JMenuItem add_Score;    //"添加学生成绩"菜单项。
    private JMenuItem modify_Score;    //"修改学生成绩"菜单项。
    private JMenuItem query_Score;    //"成绩查询"菜单项。
    private JMenuItem score_Statistics;    //"成绩统计"菜单项。
    private JMenuItem change_Password;    //"修改密码"菜单项。
    private JMenuItem logout;    //"退出登录"菜单项。
    private JFrame jf;    //当前窗口。


    public MainFrame() {
        super("Welcome to B-V mart, " + "xxx ! !");
        this.jf = this;
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        product_menu = new JMenu("Marts");    //创建"学生管理"菜单。
        menuBar.add(product_menu);    //添加"学生管理"菜单。

        add_Student = new JMenuItem("添加学生");    //创建"添加学生"菜单项。
        //注册"添加学生"菜单项事件监听
        add_Student.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                AddStudentFrame addStudentFrame = new AddStudentFrame(jf, "添加学生", true);
            }
        });
        product_menu.add(add_Student);    //添加"添加学生"菜单项。

        query_Student = new JMenuItem("查询学生信息");    //创建"查询学生"菜单项。
        //注册"查询学生"菜单项事件监听。
        query_Student.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                QueryStudentFrame queryStudentFrame = new QueryStudentFrame(jf, "查询学生信息", true);

            }
        });
        product_menu.add(query_Student);    //添加"查询学生信息"菜单项。

        modify_Student = new JMenuItem("修改学生信息");    //创建"修改学生信息"菜单项。
        //注册"修改学生信息"菜单项事件监听
        modify_Student.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ModifyStudentFrame modifyStudentFrame = new ModifyStudentFrame(jf, "修改学生信息", true);

            }
        });
        product_menu.add(modify_Student);    //添加"修改学生"菜单项。

        delete_Student = new JMenuItem("删除学生");    //创建"删除学生"菜单项。
        //注册"删除学生"按钮事件监听
        delete_Student.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                DeleteStudentFrame deleteStudentFrame = new DeleteStudentFrame(jf, "删除学生", true);

            }
        });
        product_menu.add(delete_Student);    //添加"删除学生"菜单项.

        score_Management = new JMenu("成绩管理");    //创建"成绩管理"菜单。
        menuBar.add(score_Management);    //添加"成绩管理"菜单。

        add_Score = new JMenuItem("添加学生成绩");    //创建"添加学生成绩"菜单项。
        //注册"添加学生成绩"菜单项事件监听
        add_Score.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                AddStudentScoreFrame frame = new AddStudentScoreFrame(jf, "添加学生成绩", true);

            }
        });
        score_Management.add(add_Score);    //添加"添加学生成绩"菜单项。

        modify_Score = new JMenuItem("修改学生成绩");    //创建"修改学生成绩"菜单项。
        //注册"修改学生成绩"菜单项事件监听
        modify_Score.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateStudentScoreFrame frame = new UpdateStudentScoreFrame(jf, "修改学生成绩", true);

            }
        });

        score_Management.add(modify_Score);    //添加"修改学生成绩"菜单项。

        query_Score = new JMenuItem("成绩查询");    //创建"成绩查询"菜单项。
        //注册"成绩查询"菜单项事件监听
        query_Score.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                QueryStudentScoreFrame frame = new QueryStudentScoreFrame(jf, "查询学生成绩", true);
            }
        });
        score_Management.add(query_Score);    //添加"成绩查询"菜单项。

        score_Statistics = new JMenuItem("成绩统计");    //创建"成绩统计"菜单项。
        score_Statistics.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                ScoreAnalyzeOption analyzeOption = new ScoreAnalyzeOption(jf, "成绩分析选项", true);
            }
        });
        score_Management.add(score_Statistics);    //添加"成绩统计"菜单项。

        personal_Management = new JMenu("个人管理");    //创建"个人管理"菜单。
        menuBar.add(personal_Management);    //添加"个人管理"菜单。

        change_Password = new JMenuItem("Reset Password");

        change_Password.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        personal_Management.add(change_Password);

        logout = new JMenuItem("Log out");

        logout.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jf.dispose();

                LoginFrame frame = new LoginFrame();

            }
        });
        personal_Management.add(logout);

        this.setSize(578, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        WindowUtil.setFrameCenter(this);
        ImagePanel imagePanel = new ImagePanel();
        setContentPane(imagePanel);

        try {
            Image img = ImageIO.read(this.getClass().getResource("/2.png"));
            this.setIconImage(img);

        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }


        this.setVisible(true);

    }


}
