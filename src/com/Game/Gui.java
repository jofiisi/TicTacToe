package com.Game;
import javax.swing.*;


public class Gui
{
    JFrame jf;
    Draw d;

    public static int width = 800, height = 600;

    public void create()
    {
        jf = new JFrame("TicTacToe");
        jf.setSize(width, height);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setResizable(false);

        d = new Draw();
        d.setBounds(0, 0, width, height);
        d.setVisible(true);
        jf.add(d);

        jf.requestFocus();
        jf.setVisible(true);
    }
}
