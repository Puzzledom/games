package com.sssyayayiooo.games;

import javax.swing.*;
import java.awt.*;

public class Hyperbola extends JFrame {
    public static void main(String args[]) {
        new Hyperbola();
    }

    public Hyperbola() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screen = kit.getScreenSize();

        int wight = screen.width;
        int hight = screen.height;
        this.add(new DrawQuadCurve());
        this.setBounds(wight / 4, hight / 4, 400, 300);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);

    }


}