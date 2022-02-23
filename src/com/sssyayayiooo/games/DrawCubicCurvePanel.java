package com.sssyayayiooo.games;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.CubicCurve2D;

public class DrawCubicCurvePanel extends JPanel {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
//      坐标分别代表起始坐标,第一个控制点坐标,第二个控制点坐标,终点坐标
//不太理解坐标负数以什么为基准的,只知道是负数才能产生向上的凸线
        CubicCurve2D.Double cubicCurve = new CubicCurve2D.Double(60, 80, 140, -140, 140, 300, 220, 80);
        g2.draw(cubicCurve);
    }
}