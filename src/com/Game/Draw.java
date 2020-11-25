package com.Game;

import javax.swing.*;
import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel
{
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(200,100,400,2);
        g.fillRect(200,200,400,2);

        g.fillRect(320,30,2,270);
        g.fillRect(480,30,2,270);
    }
}
