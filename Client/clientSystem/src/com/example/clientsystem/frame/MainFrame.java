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

//������
public class MainFrame extends JFrame {
    private JMenuBar menuBar;    //Ӧ�ò˵�����
    private JMenu product_menu;    //"ѧ������"�˵���
    private JMenu score_Management;    //"�ɼ�����"�˵���
    private JMenu personal_Management;    //"���˹���"�˵���
    private JMenuItem add_Student;    //"���ѧ��"�˵��
    private JMenuItem query_Student;    //"��ѯѧ����Ϣ"�˵��
    private JMenuItem modify_Student;    //"�޸�ѧ����Ϣ"�˵��
    private JMenuItem delete_Student;    //"ɾ��ѧ��"�˵��
    private JMenuItem add_Score;    //"���ѧ���ɼ�"�˵��
    private JMenuItem modify_Score;    //"�޸�ѧ���ɼ�"�˵��
    private JMenuItem query_Score;    //"�ɼ���ѯ"�˵��
    private JMenuItem score_Statistics;    //"�ɼ�ͳ��"�˵��
    private JMenuItem change_Password;    //"�޸�����"�˵��
    private JMenuItem logout;    //"�˳���¼"�˵��
    private JFrame jf;    //��ǰ���ڡ�


    public MainFrame() {
        super("Welcome to B-V mart, " + "xxx ! !");
        this.jf = this;
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        product_menu = new JMenu("Marts");    //����"ѧ������"�˵���
        menuBar.add(product_menu);    //���"ѧ������"�˵���

        add_Student = new JMenuItem("���ѧ��");    //����"���ѧ��"�˵��
        //ע��"���ѧ��"�˵����¼�����
        add_Student.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                AddStudentFrame addStudentFrame = new AddStudentFrame(jf, "���ѧ��", true);
            }
        });
        product_menu.add(add_Student);    //���"���ѧ��"�˵��

        query_Student = new JMenuItem("��ѯѧ����Ϣ");    //����"��ѯѧ��"�˵��
        //ע��"��ѯѧ��"�˵����¼�������
        query_Student.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                QueryStudentFrame queryStudentFrame = new QueryStudentFrame(jf, "��ѯѧ����Ϣ", true);

            }
        });
        product_menu.add(query_Student);    //���"��ѯѧ����Ϣ"�˵��

        modify_Student = new JMenuItem("�޸�ѧ����Ϣ");    //����"�޸�ѧ����Ϣ"�˵��
        //ע��"�޸�ѧ����Ϣ"�˵����¼�����
        modify_Student.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ModifyStudentFrame modifyStudentFrame = new ModifyStudentFrame(jf, "�޸�ѧ����Ϣ", true);

            }
        });
        product_menu.add(modify_Student);    //���"�޸�ѧ��"�˵��

        delete_Student = new JMenuItem("ɾ��ѧ��");    //����"ɾ��ѧ��"�˵��
        //ע��"ɾ��ѧ��"��ť�¼�����
        delete_Student.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                DeleteStudentFrame deleteStudentFrame = new DeleteStudentFrame(jf, "ɾ��ѧ��", true);

            }
        });
        product_menu.add(delete_Student);    //���"ɾ��ѧ��"�˵���.

        score_Management = new JMenu("�ɼ�����");    //����"�ɼ�����"�˵���
        menuBar.add(score_Management);    //���"�ɼ�����"�˵���

        add_Score = new JMenuItem("���ѧ���ɼ�");    //����"���ѧ���ɼ�"�˵��
        //ע��"���ѧ���ɼ�"�˵����¼�����
        add_Score.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                AddStudentScoreFrame frame = new AddStudentScoreFrame(jf, "���ѧ���ɼ�", true);

            }
        });
        score_Management.add(add_Score);    //���"���ѧ���ɼ�"�˵��

        modify_Score = new JMenuItem("�޸�ѧ���ɼ�");    //����"�޸�ѧ���ɼ�"�˵��
        //ע��"�޸�ѧ���ɼ�"�˵����¼�����
        modify_Score.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateStudentScoreFrame frame = new UpdateStudentScoreFrame(jf, "�޸�ѧ���ɼ�", true);

            }
        });

        score_Management.add(modify_Score);    //���"�޸�ѧ���ɼ�"�˵��

        query_Score = new JMenuItem("�ɼ���ѯ");    //����"�ɼ���ѯ"�˵��
        //ע��"�ɼ���ѯ"�˵����¼�����
        query_Score.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                QueryStudentScoreFrame frame = new QueryStudentScoreFrame(jf, "��ѯѧ���ɼ�", true);
            }
        });
        score_Management.add(query_Score);    //���"�ɼ���ѯ"�˵��

        score_Statistics = new JMenuItem("�ɼ�ͳ��");    //����"�ɼ�ͳ��"�˵��
        score_Statistics.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                ScoreAnalyzeOption analyzeOption = new ScoreAnalyzeOption(jf, "�ɼ�����ѡ��", true);
            }
        });
        score_Management.add(score_Statistics);    //���"�ɼ�ͳ��"�˵��

        personal_Management = new JMenu("���˹���");    //����"���˹���"�˵���
        menuBar.add(personal_Management);    //���"���˹���"�˵���

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
