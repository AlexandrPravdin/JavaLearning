package ru.mirea.zad12.picture;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Picture extends JFrame {
    JFrame frame;
    JLabel displayField1;
    ImageIcon image,image2,image3;

    public Picture() {
        frame = new JFrame("Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            image = new ImageIcon(getClass().getResource("picture.jpg"));
            image2 = new ImageIcon(getClass().getResource("picture2.jpg"));
            image3 = new ImageIcon(getClass().getResource("picture3.jpg"));
            displayField1 = new JLabel(image);
            frame.setSize(300, 300);

            frame.add(displayField1);
            frame.setVisible(true);
            while (true){
                displayField1.setIcon(image);
                TimeUnit.SECONDS.sleep(1);
                displayField1.setIcon(image2);
                TimeUnit.SECONDS.sleep(1);
                displayField1.setIcon(image3);
                TimeUnit.SECONDS.sleep(1);
                System.out.println(1);
            }

        } catch (Exception e) {
            System.out.println("Image not found");
        }


    }
}
