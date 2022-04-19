package ru.vsu.sc.tretyakov_d_s;

import java.awt.*;

public interface BinaryTree<T> {
    interface TreeNode<T> {

        T getValue();

        default TreeNode<T> getLeft() {
            return null;
        }

        default TreeNode<T> getRight() {
            return null;
        }

        default Color getColor() {
            return Color.BLACK;
        }
    }

    TreeNode<T> getRoot();
}
