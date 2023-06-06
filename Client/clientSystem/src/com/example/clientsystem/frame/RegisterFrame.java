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


public class RegisterFrame extends JFrame {

    private JLabel username_Label;
    private JLabel password_Label;
    private JLabel repassword_Label;
    private JTextField username_Text;
    private JPasswordField password_Text;
    private JPasswordField repassword_Text;
    private JButton register_Button;
    private JButton cancel_Button;
    private JFrame jf;

    public RegisterFrame() {
        super("Register");
        this.jf = this;
        this.setLayout(null);
        this.setSize(400, 300);
        Container c = this.getContentPane();
        c.setBackground(Color.WHITE);
        username_Label = new JLabel("User name:");
        username_Label.setBounds(75, 60, 100, 20);
        c.add(username_Label);

        username_Text = new JTextField();
        username_Text.setBounds(195, 60, 120, 20);
        username_Text.grabFocus();
        c.add(username_Text);

        password_Label = new JLabel("Password:");
        password_Label.setBounds(75, 110, 100, 20);
        c.add(password_Label);

        password_Text = new JPasswordField();
        password_Text.setBounds(195, 110, 120, 20);
        c.add(password_Text);

        repassword_Label = new JLabel("Confirm Password:");
        repassword_Label.setBounds(75, 162, 140, 20);
        c.add(repassword_Label);

        repassword_Text = new JPasswordField();
        repassword_Text.setBounds(195, 162, 120, 20);
        c.add(repassword_Text);

        register_Button = new JButton("Register");
        register_Button.setBounds(90, 210, 60, 20);

        register_Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String username = username_Text.getText().trim();
                String password = new String(password_Text.getPassword());
                String repassword = new String(repassword_Text.getPassword());
                if (username.equals("")) {
                    JOptionPane.showMessageDialog(jf, "please input the user name", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (password.equals("")) {
                    JOptionPane.showMessageDialog(jf, "please input the password£¡", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (repassword.equals("")) {
                    JOptionPane.showMessageDialog(jf, "please confirm the password£¡", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (!password.equals(repassword)) {
                    JOptionPane.showMessageDialog(jf, "inconsistent password£¡", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }

            }
        });
        c.add(register_Button);


        cancel_Button = new JButton("Cancel");
        cancel_Button.setBounds(250, 210, 60, 20);

        cancel_Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                jf.dispose();
                LoginFrame loginFrame = new LoginFrame();
            }
        });
        c.add(cancel_Button);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        WindowUtil.setFrameCenter(this);
        try {
            Image img = ImageIO.read(this.getClass().getResource("/com/example/clientsystem/image/2.png"));
            this.setIconImage(img);

        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        this.setVisible(true);
    }


    public void Reset() {
        username_Text.setText("");
        password_Text.setText("");
        repassword_Text.setText("");
    }
}
