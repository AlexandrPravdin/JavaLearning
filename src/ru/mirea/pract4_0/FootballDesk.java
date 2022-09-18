package ru.mirea.pract4_0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballDesk extends JFrame{

    private JButton milanBttn = new JButton("AC Milan");

    private JButton realBttn = new JButton("Real Madrid");
    private int milanNum = 0;
    private int realNum = 0;
    private JButton endGame = new JButton("End Game!");
    JLabel label = new JLabel("Result " + milanNum + "x" + realNum, SwingConstants.CENTER);
    JLabel scoreLabel = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);



    public FootballDesk(){
        super("Match");
        setSize(400, 200);
        add(milanBttn,BorderLayout.EAST);
        add(realBttn,BorderLayout.WEST);
        add(label,BorderLayout.CENTER);
        add(endGame,BorderLayout.SOUTH);
        add(scoreLabel,BorderLayout.NORTH);
        milanBttn.setPreferredSize(new Dimension(100, 100));
        realBttn.setPreferredSize(new Dimension(100, 100));


        realBttn.addActionListener(new realActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                realNum++;
                label.setText("Result " + realNum + "x" + milanNum);
            }
        });

        milanBttn.addActionListener(new milanActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                milanNum++;
                label.setText("Result " + realNum + "x" + milanNum);
            }
        });
        endGame.addActionListener(new endActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                if (realNum < milanNum){
                label.setText("Winner: AC Milan " + realNum + "x" + milanNum);
                scoreLabel.setText("Last Scorer: Milan");
                }
                else {
                    label.setText("Winner: Real Madrid " + realNum + "x" + milanNum );
                    scoreLabel.setText("Last Scorer: Madrid");
                }

                realNum = 0;
                milanNum = 0;
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
