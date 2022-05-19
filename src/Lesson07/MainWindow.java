package Lesson07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private int posX = 300;
    private int posY = 200;

    private  int widthW = 1024;
    private int heightW = 768;

    private JButton button1;
    private JPanel panel;
    private JLabel label;


    public MainWindow(){
        setupMainWindow();

        button1 = new JButton("Button1");
        panel = new JPanel();
        label = new JLabel("Hello Label");


        panel.setLayout(new GridLayout(3,3));


        for (int i = 0; i < 6; i++) {
            panel.add(new Button("Button Panel" + i));
        }
        add(panel, BorderLayout.NORTH);
        add(label, BorderLayout.SOUTH);
        add(button1, BorderLayout.WEST);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Hello!!! NEW APP");
            }
        });

//        setLayout(new GridLayout(4,4));
//        setLayout(new FlowLayout());
//        for (int i = 0; i < 16; i++) {
//            add (new Button("Button#"+i));
//
//        }
//        add(button1, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void setupMainWindow(){
        setSize(widthW, heightW);
        setLocation(posX, posY);
        //setResizable(false);
        setTitle("My GUI");


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
