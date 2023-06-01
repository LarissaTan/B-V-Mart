package com.example.clientsystem.frame;


import com.example.clientsystem.util.WindowUtil;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//login interface
public class LoginFrame extends JFrame {

    private JLabel username_Label;    //用户名标签。
    private JLabel password_Label;    //密码标签。
    private JTextField username_Text;    //用户名文本域。
    private JPasswordField password_Text;    //密码文本域。
    private JButton login_Button;    //登陆按钮。
    private JButton register_Button;    //注册按钮。
    private JFrame jf;    //当前窗口 。

    public LoginFrame() {
        super("Welcome to B-V mart~~");
        this.jf = this;
        this.setLayout(null);//设置为空布局。
        this.setSize(400, 300);//设置大小。
        Container c = this.getContentPane();
        c.setBackground(Color.WHITE);//设置背景颜色。
        username_Label = new JLabel("User name:");    //创建"用户名"标签。
        username_Label.setBounds(70, 60, 50, 20);    //设置"用户名"标签位置。
        c.add(username_Label);    //添加"用户名"标签。

        username_Text = new JTextField();    //创建"用户名"文本域。
        username_Text.setBounds(180, 60, 120, 20);    //设置"用户名"文本域位置。
        username_Text.grabFocus();//获得光标。
        c.add(username_Text);    //添加"用户名"文本域。

        password_Label = new JLabel("Password:");    //创建"密码"标签。
        password_Label.setBounds(100, 140, 50, 20);
        c.add(password_Label);    //添加"密码"标签。

        password_Text = new JPasswordField();    //创建"密码"文本域。
        password_Text.setBounds(160, 140, 120, 20);    //设置"密码"文本域位置。
        c.add(password_Text);    //添加"密码"文本域。

        login_Button = new JButton("Login");    //创建"登录"按钮。
        login_Button.setBounds(100, 210, 60, 20);    //设置"登录"按钮位置。
        //注册"登录"按钮事件监听。
        login_Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String username = username_Text.getText().trim();
                String password = new String(password_Text.getPassword());
                if (username.equals("")) {
                    JOptionPane.showMessageDialog(jf, "Please enter the user name please~", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }else if (password.equals("")) {
                    JOptionPane.showMessageDialog(jf, "input your password please~", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }else{
                    jf.dispose();    //当前窗口关闭
                    MainFrame mainFrame = new MainFrame();    //go to main page
                }



            }
        });
        c.add(login_Button);    //添加"登录"按钮 。


        register_Button = new JButton("注册");    //创建"注册"按钮。
        register_Button.setBounds(250, 210, 60, 20);    //设置"注册"按钮位置。
        //注册"注册"按钮事件监听。
        register_Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jf.dispose();    //当前窗口关闭。
                StudentSystemRegisterFrame studentSystemRegisterFrame = new StudentSystemRegisterFrame();    //打开注册界面

            }
        });
        c.add(register_Button);    //添加"注册"按钮。

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);    //设置大小不可改变。
        WindowUtil.setFrameCenter(this);//设置窗口居中。
        try {
            Image img = ImageIO.read(this.getClass().getResource("/2.png"));
            this.setIconImage(img);

        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        this.setVisible(true);    //设置窗体可见。
    }

    //重置
    public void Reset() {
        username_Text.setText("");
        password_Text.setText("");
    }
}
