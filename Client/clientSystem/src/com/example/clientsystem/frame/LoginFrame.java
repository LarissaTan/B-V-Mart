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

    private JLabel username_Label;    //�û�����ǩ��
    private JLabel password_Label;    //�����ǩ��
    private JTextField username_Text;    //�û����ı���
    private JPasswordField password_Text;    //�����ı���
    private JButton login_Button;    //��½��ť��
    private JButton register_Button;    //ע�ᰴť��
    private JFrame jf;    //��ǰ���� ��

    public LoginFrame() {
        super("Welcome to B-V mart~~");
        this.jf = this;
        this.setLayout(null);//����Ϊ�ղ��֡�
        this.setSize(400, 300);//���ô�С��
        Container c = this.getContentPane();
        c.setBackground(Color.WHITE);
        username_Label = new JLabel("User name:");
        username_Label.setBounds(75, 60, 80, 20);
        c.add(username_Label);

        username_Text = new JTextField();
        username_Text.setBounds(170, 60, 120, 20);
        username_Text.grabFocus();
        c.add(username_Text);

        password_Label = new JLabel("Password:");
        password_Label.setBounds(75, 135, 80, 20);
        c.add(password_Label);

        password_Text = new JPasswordField();
        password_Text.setBounds(170, 135, 120, 20);
        c.add(password_Text);

        login_Button = new JButton("Login");
        login_Button.setBounds(100, 210, 60, 20);

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
                    jf.dispose();
                    MainFrame mainFrame = new MainFrame();    //go to main page
                }



            }
        });
        c.add(login_Button);


        register_Button = new JButton("Register");
        register_Button.setBounds(250, 210, 60, 20);

        register_Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jf.dispose();
                RegisterFrame registerFrame = new RegisterFrame();

            }
        });
        c.add(register_Button);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        WindowUtil.setFrameCenter(this);
        try {
            Image img = ImageIO.read(this.getClass().getResource("/2.png"));
            this.setIconImage(img);

        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        this.setVisible(true);    //���ô���ɼ���
    }


    public void Reset(){
        username_Text.setText("");
        password_Text.setText("");
    }

}
