package com.sssyayayiooo.games;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.QuadCurve2D;

public class DrawQuadCurve extends JPanel {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
//      对应的坐标分别为起始的x,y位置,控制点的x,y位置,结束点x,y位置
//      QuadCurve2D.Double与QuadCurve2D.Float都是画二次曲线的类,QuadCurve2D.Float更节省空间
        QuadCurve2D.Double quadCurve1 = new QuadCurve2D.Double(60, 20, 120, 100, 40, 120);
        g2.draw(quadCurve1);
        QuadCurve2D.Double quadCurve2 = new QuadCurve2D.Double(180, 20, 120, 100, 180, 120);
        g2.draw(quadCurve2);

    }
}
