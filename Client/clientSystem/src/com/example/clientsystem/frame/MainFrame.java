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
                testFrame frame = new testFrame(jf, "���ѧ���ɼ�", true);
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

        // ����CardView�����
        cardPanel = new JPanel(new CardLayout());

        // ����һ��CardView��岢��ӵ�cardPanel��
        JPanel martCardView = new JPanel();
        martCardView.setLayout(new GridBagLayout());
        martCardView.setBackground(Color.WHITE);

        JLabel descriptionLabel = new JLabel("Welcome to B-V mart!");
        descriptionLabel.setFont(new Font("Arial", Font.BOLD, 16)); // ����������ʽ�ʹ�С

// ��������������е�λ�úʹ�С
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0; // ������
        gbc.gridy = 0; // ������
        gbc.gridwidth = 1; // �����ռ����
        gbc.gridheight = 1; // �����ռ����
        gbc.anchor = GridBagConstraints.CENTER; // ����ڵ�Ԫ���еĶ��뷽ʽ
        gbc.fill = GridBagConstraints.NONE; // ����ڵ�Ԫ���е���䷽ʽ
        martCardView.add(descriptionLabel, gbc);


        // ����GridBagConstraints���󣬲����ñ߾�
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20); // �����ϡ����¡��ұ߾�

        // ���������CardView�е��������
        // ���������CardView�е��������������չʾ��Ʒ��Ϣ
// ...

// ��Ʒ����
        JLabel nameLabel = new JLabel("Product Name: Sample Product");
        gbc.gridy++; // ����������
        martCardView.add(nameLabel, gbc);

// ��Ʒ�۸�
        JLabel priceLabel = new JLabel("Price: $9.99");
        gbc.gridy++; // ����������
        martCardView.add(priceLabel, gbc);

// ��Ʒ���
        JLabel stockLabel = new JLabel("Stock: 10");
        gbc.gridy++; // ����������
        martCardView.add(stockLabel, gbc);


        // ���martCardView��cardPanel��
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
