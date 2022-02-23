package com.sssyayayiooo.games;

import javax.swing.*;
import java.awt.*;

public class DrawCubicCurve extends JFrame {
    public static void main(String args[]) {
        new DrawCubicCurve();
    }

    public DrawCubicCurve() {
        // TODO Auto-generated constructor stub
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screen = kit.getScreenSize();
        int width = screen.width;
        int hight = screen.height;
        add(new DrawCubicCurvePanel());
        setTitle("画三次曲线");
        setVisible(true);
        setBounds(width / 4, hight / 4, 500, 400);
        setDefaultCloseOperation(3);
    }

}