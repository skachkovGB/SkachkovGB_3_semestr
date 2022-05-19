package guiApp.windowParts;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 28.04.2022
 */

public class GameMap extends JPanel {

    private int mapSizeWidth = 5;
    private int mapSizeHeight = 5;

    private GridLayout mapLayout = new GridLayout(mapSizeHeight, mapSizeWidth);


    public GameMap() {
        setBackground(new Color(31, 82, 6));
        displayMap();
        this.setLayout(mapLayout);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
    }

    private void displayMap () {
        for (int y = 0; y < mapSizeHeight; y++) {
            for (int x = 0; x < mapSizeWidth; x++) {
                //mapLayout.addLayoutComponent(new Label("Empty"), x, y);
                JLabel printLabel = new JLabel();

                printLabel.setBorder(BorderFactory.createLineBorder(Color.black));

                printLabel.setText("Empty"+x+" "+y);
                printLabel.setForeground(Color.white);

                add(printLabel);
            }

        }
    }
}
