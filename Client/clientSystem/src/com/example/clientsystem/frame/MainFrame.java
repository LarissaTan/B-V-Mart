package com.example.clientsystem.frame;


import com.example.clientsystem.util.WindowUtil;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

//主界面
public class MainFrame extends JFrame {
    private JMenuBar menuBar;
    private JMenu product_menu;
    private JMenu cart;
    private JMenu chat;

    private JMenuItem change_Password;
    private JMenuItem logout;
    private JFrame jf;

    private JPanel mart_card;


    public MainFrame() {
        super("Welcome to B-V mart, " + "xxx ! !");
        this.jf = this;
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);




        product_menu = new JMenu("Marts");
        cart = new JMenu("Shopping Cart");
        menuBar.add(cart);
        menuBar.add(product_menu);

        // 创建CardView的面板
        mart_card = new JPanel(new CardLayout());
        product_menu.add(mart_card);

        // 创建一个CardView面板并添加到cardPanel中
        JPanel martCardView = new JPanel();
        martCardView.setBackground(Color.WHITE);
        // 在这里添加CardView中的其他组件
        mart_card.add(martCardView, "martCardView");



        chat = new JMenu("Customer Service");
        menuBar.add(chat);

        change_Password = new JMenuItem("Reset Password");

        change_Password.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        chat.add(change_Password);

        logout = new JMenuItem("Log out");

        logout.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jf.dispose();

                LoginFrame frame = new LoginFrame();

            }
        });
        chat.add(logout);

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
