package plantsVsZombies;

import javax.swing.*;


public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Plants vs Zombies");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        JButton button = new JButton("Press");
        button.setBounds(590, 323, 100,75);
        frame.getContentPane().add(button);
        frame.setLayout(null);
        frame.setVisible(true);


    }
}
