package ru.mirea.pract4_0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballDesk extends JFrame{

    private JButton milanBttn = new JButton("Milan!!");

    private JButton realBttn = new JButton("Real Madrid");
    private int milanNum = 0;
    private int realNum = 0;
    private JButton endGame = new JButton("End Game!");
    JLabel label = new JLabel(milanNum + "x" + realNum, SwingConstants.CENTER);

    public FootballDesk(){
        super("Match");
        setSize(300, 100);
        add(milanBttn,BorderLayout.EAST);
        add(realBttn,BorderLayout.WEST);
        add(label,BorderLayout.CENTER);
        add(endGame,BorderLayout.SOUTH);
        milanBttn.setPreferredSize(new Dimension(100, 100));
        realBttn.setPreferredSize(new Dimension(100, 100));
        realBttn.addActionListener(new realActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                realNum++;
                label.setText(realNum + "x" + milanNum);
            }
        });
        milanBttn.addActionListener(new milanActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                milanNum++;
                label.setText(realNum + "x" + milanNum);
            }
        });
        endGame.addActionListener(new endActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                milanBttn.setVisible(false);
                realBttn.setVisible(false);
                if (realNum < milanNum){
                label.setText("Milan win!!! with " + realNum + "x" + milanNum);}
                else
                {label.setText("Real Madrid win!! with " + realNum + "x" + milanNum );}
            }
        });
        setVisible(true);
    }
}

class realActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}

class milanActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

class endActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
