package guiApp.windowParts.areas;

import guiApp.windowParts.InfoPanel;

import javax.swing.*;
import java.awt.*;



/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 28.04.2022
 */

public class PlayerControlArea extends JPanel  {
    private JButton stepUp = new JButton("Вверх");
    private JButton stepLeft = new JButton("Влево");
    private JButton stepBot = new JButton("Вниз");
    private JButton stepRight = new JButton("Вправо");



    private GridLayout buttonsLayout = new GridLayout(3, 3, 5, 5);
    //private GridBagConstraints textFieldConstraints =  new GridBagConstraints();



    public PlayerControlArea(InfoPanel infoPanel) {


          this.setLayout(buttonsLayout);
//        this.setBorder(BorderFactory.createLineBorder(Color.black));
//
//
//        textFieldConstraints.fill = GridBagConstraints.HORIZONTAL;
//        textFieldConstraints.weightx = 0.5;
//
//
//        textFieldConstraints.gridx = 0;
//        textFieldConstraints.gridy = 0;
//        this.add(stepUp,textFieldConstraints);
//
//        textFieldConstraints.gridx = 0;
//        textFieldConstraints.gridy = 1;
//        this.add(stepLeft,textFieldConstraints);
//
//        textFieldConstraints.gridx = 1;
//        textFieldConstraints.gridy = 1;
//        this.add(stepRight,textFieldConstraints);
//
//        textFieldConstraints.gridx = 1;
//        textFieldConstraints.gridy = 2;
//        this.add(stepBot,textFieldConstraints);

        add(new JPanel());
        add(stepUp);
        add(new JPanel());
        add(stepLeft);
        add(new JPanel());
        add(stepRight);
        add(new JPanel());
        add(stepBot);
        add(new JPanel());




    }
}

