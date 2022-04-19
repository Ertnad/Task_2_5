package ru.vsu.sc.tretyakov_d_s;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
       EventQueue.invokeLater(() -> {
            JFrame frameMain = new TreeDemoFrame();
            frameMain.setVisible(true);
        });

        /*
        try {
            SimpleBSTree<Integer> tree = new SimpleBSTree<>(Integer::parseInt);
            tree.fromBracketNotation("80 (62 (55 (26 (5, 39), 57)), 94)");
            int floor = tree.getFloor(30);
            int ceiling = tree.getCeiling(30);
            System.out.println(floor + " " + ceiling);
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    }
}
