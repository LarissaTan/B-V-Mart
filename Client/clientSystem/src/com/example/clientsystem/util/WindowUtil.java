package com.example.clientsystem.util;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

public class WindowUtil {

    public static void setFrameCenter(Container c) {

        Toolkit tk = Toolkit.getDefaultToolkit();


        Dimension d = tk.getScreenSize();
        double srceenWidth = d.getWidth();
        double srceenHeigth = d.getHeight();


        int frameWidth = c.getWidth();
        int frameHeight = c.getHeight();


        int width = (int) (srceenWidth - frameWidth) / 2;
        int height = (int) (srceenHeigth - frameHeight) / 2;

        c.setLocation(width, height);
    }
}
