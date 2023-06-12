package com.example.clientsystem.frame;

import com.example.clientsystem.frame.ImagePanel;
import com.example.clientsystem.frame.LoginFrame;
import com.example.clientsystem.util.WindowUtil;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.*;


public class MainFrame extends JFrame {
    private JMenuBar menuBar;
    private JMenu product_menu;
    private JMenu cart;
    private JMenu chat;

    private JMenuItem change_Password;
    private JMenuItem logout;
    private JFrame jf;
    private JPanel cardPanel;

    public MainFrame() {
        super("Welcome to B-V mart, " + "xxx ! !");
        this.jf = this;
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        product_menu = new JMenu("Marts");
        cart = new JMenu("Shopping Cart");

        menuBar.add(cart);
        menuBar.add(product_menu);

        chat = new JMenu("Customer Service");
        menuBar.add(chat);

        change_Password = new JMenuItem("Reset Password");


        change_Password.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                testFrame frame = new testFrame(jf, "添加学生成绩", true);
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
        //----

        // 创建CardView的面板
        cardPanel = new JPanel(new CardLayout());

        // 创建一个CardView面板并添加到cardPanel中
        JPanel martCardView = new JPanel();
        martCardView.setLayout(new GridBagLayout());
        martCardView.setBackground(Color.WHITE);

        JLabel descriptionLabel = new JLabel("Welcome to B-V mart!");
        descriptionLabel.setFont(new Font("Arial", Font.BOLD, 16)); // 设置字体样式和大小

// 设置组件在网格中的位置和大小
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0; // 列索引
        gbc.gridy = 0; // 行索引
        gbc.gridwidth = 1; // 组件所占列数
        gbc.gridheight = 1; // 组件所占行数
        gbc.anchor = GridBagConstraints.CENTER; // 组件在单元格中的对齐方式
        gbc.fill = GridBagConstraints.NONE; // 组件在单元格中的填充方式
        martCardView.add(descriptionLabel, gbc);


        // 创建GridBagConstraints对象，并设置边距
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20); // 设置上、左、下、右边距

        // 在这里添加CardView中的其他组件
        // 在这里添加CardView中的其他组件，用于展示商品信息
// ...

// 商品名称
        JLabel nameLabel = new JLabel("Product Name: Sample Product");
        gbc.gridy++; // 增加行索引
        martCardView.add(nameLabel, gbc);

// 商品价格
        JLabel priceLabel = new JLabel("Price: $9.99");
        gbc.gridy++; // 增加行索引
        martCardView.add(priceLabel, gbc);

// 商品库存
        JLabel stockLabel = new JLabel("Stock: 10");
        gbc.gridy++; // 增加行索引
        martCardView.add(stockLabel, gbc);


        // 添加martCardView到cardPanel中
        cardPanel.add(martCardView, "martCardView");

        //setContentPane(imagePanel);
        setContentPane(cardPanel);

        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("com/example/clientsystem/image/2.png");
            Image img = ImageIO.read(inputStream);
            this.setIconImage(img);
        } catch (IOException e1) {
            e1.printStackTrace();
        }


        this.setVisible(true);
    }
}
