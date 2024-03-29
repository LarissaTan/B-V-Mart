package com.example.clientsystem.frame;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
    private ImageIcon icon;
    private Image img;

    public ImagePanel() {
        icon = new ImageIcon(MainFrame.class.getResource("/com/example/clientsystem/image/1.png"));
        img = icon.getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
    }
}
