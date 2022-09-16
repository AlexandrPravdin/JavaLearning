package ru.mirea.pract4_0;

import javax.swing.*;
import java.awt.*;

public class FootballDesk extends JFrame{

    JButton milanBttn = new JButton("Real Madrid");
    JButton realMadridBttn = new JButton();
    String txt = "F";
    public FootballDesk(){
        super("Example");
        setLayout(new FlowLayout());
        add(milanBttn, BorderLayout.EAST);
        add(realMadridBttn, BorderLayout.WEST);

        setSize(400, 200);
        setVisible(true);
    }
}
