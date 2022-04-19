package ru.vsu.sc.tretyakov_d_s;


import ru.vsu.sc.tretyakov_d_s.utils.SwingUtils;

import javax.swing.*;
import java.awt.*;

public class TreeDemoFrame extends JFrame{
    private JTextField bracketNotationTextField;
    private JButton buildATreeButton;
    private JPanel panelMain;
    private JPanel paintAreaPanel;
    private JButton findFloorButton;
    private JButton findCeilingButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    private final JPanel paintPanel;

    SimpleBSTree<Integer> tree = new SimpleBSTree<>();

    public TreeDemoFrame() {
        this.setTitle("Двоичные деревья");
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();


        paintPanel = new JPanel() {

            @Override
            public void paintComponent(Graphics gr) {
                super.paintComponent(gr);
                Dimension paintSize = BinaryTreePainter.paint(tree, gr);
                if (!paintSize.equals(this.getPreferredSize())) {
                    SwingUtils.setFixedSize(this, paintSize.width, paintSize.height);
                }
            }
        };

        JScrollPane paintJScrollPane = new JScrollPane(paintPanel);
        paintAreaPanel.add(paintJScrollPane);

        buildATreeButton.addActionListener(actionEvent -> {
            try {
                SimpleBSTree<Integer> tree = new SimpleBSTree<>(Integer::parseInt);
                tree.fromBracketNotation(bracketNotationTextField.getText());
                this.tree = tree;
                repaintTree();
            } catch (Exception ex) {
                SwingUtils.showErrorMessageBox(ex);
            }
        });

        findFloorButton.addActionListener(e -> {
            try {
                SimpleBSTree<Integer> tree = this.tree;
                textField2.setText(String.valueOf(tree.getFloor(Integer.valueOf(textField3.getText()))));
            } catch (Exception ex) {
                SwingUtils.showErrorMessageBox(ex);
            }
        });

        findCeilingButton.addActionListener(e -> {
            try {
                SimpleBSTree<Integer> tree = this.tree;
                textField1.setText(String.valueOf(tree.getCeiling(Integer.valueOf(textField3.getText()))));
            } catch (Exception ex) {
                SwingUtils.showErrorMessageBox(ex);
            }
        });
    }


    public void repaintTree() {
        paintPanel.repaint();
    }
}
