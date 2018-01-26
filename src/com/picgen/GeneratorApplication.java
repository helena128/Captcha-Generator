package com.picgen;

import com.picgen.util.Generator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

public class GeneratorApplication extends JFrame {
    final static int FRAME_H = 400;
    final static int FRAME_W = 500;

    public static void main(String[] args) {
        Generator generator = new Generator();
        System.out.println("Key: " + generator.getKey());
        displayImage(generator.getImg());
    }

    protected static void displayImage(BufferedImage img) {
        Frame frame = new JFrame("Captcha");
        JLabel label = new JLabel(new ImageIcon(img));
        frame.add(label, BorderLayout.CENTER);
        frame.setSize(FRAME_W, FRAME_H);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
}
