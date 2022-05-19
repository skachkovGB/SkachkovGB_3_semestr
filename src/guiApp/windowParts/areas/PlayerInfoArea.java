package guiApp.windowParts.areas;

import guiApp.windowParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 28.04.2022
 */

public class PlayerInfoArea extends JPanel {

    private JLabel playersInfo = new  JLabel("Player Info");
    private JLabel playersHP = new JLabel("Playes HP = " + "30");
    private JLabel playersExp  = new JLabel("Playes EXP = " + "0");

    private GridLayout playerInfoLayout= new GridLayout(3,1);




    public PlayerInfoArea() {
        setBorder(BorderFactory.createLineBorder(Color.black));
        setLayout(playerInfoLayout);

        add(playersInfo, CENTER_ALIGNMENT);
        add(playersHP);
        add(playersExp);

    }

}
