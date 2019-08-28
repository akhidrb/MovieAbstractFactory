package com.movie;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JFrame implements KeyListener {

    private JLabel label;
    private boolean appType;

    public MyPanel(String s) {
            super(s);
            JPanel p = new JPanel();
            label = new JLabel("Key Listener!");
            p.add(label);
            add(p);
            addKeyListener(this);
            setSize(200, 100);
            setVisible(true);
            appType = false;
    }

    private void changeApplicationType() {
        appType = !appType;
        FactoryProducer.produce(appType);
    }

    public void keyPressed(KeyEvent e) {
        // Invoked when a key has been pressed.
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            changeApplicationType();
        }
    }

    public void keyTyped(KeyEvent e) {
        // Invoked when a key has been typed.
    }

    public void keyReleased(KeyEvent e) {
        // Invoked when a key has been released.
    }

}