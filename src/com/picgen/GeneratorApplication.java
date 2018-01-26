package com.picgen;

import com.picgen.util.Generator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

/**
 * Displays captcha picture and outputs its key to stdout
 */
public class GeneratorApplication extends JFrame {
    final static int FRAME_H = 400;
    final static int FRAME_W = 500;
    final static String TITLE = "Captcha";

    public static void main(String[] args) {
        Generator generator = new Generator();
        System.out.println("Key: " + generator.getKey());
        displayImage(generator.getImg(), TITLE);
    }

    /**
     * Displays image
     * @param img - shows image
     */
    public static void displayImage(BufferedImage img, String title) {
        Frame frame = new JFrame(title);
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
