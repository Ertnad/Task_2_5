package ru.vsu.sc.tretyakov_d_s;

public interface BSTree <T extends Comparable<? super T>> extends BinaryTree<T> {


    default BinaryTree.TreeNode<T> getFloorNode(T value) {
        return BSTreeAlgorithms.getFloorNode(getRoot(), value);
    }


    default T getFloor(T value) {
        BinaryTree.TreeNode<T> floorNode = getFloorNode(value);
        return (floorNode == null) ? null : floorNode.getValue();
    }


    default BinaryTree.TreeNode<T> getCeilingNode(T value) {
        return BSTreeAlgorithms.getCeilingNode(getRoot(), value);
    }


    default T getCeiling(T value) {
        BinaryTree.TreeNode<T> ceilingNode = getCeilingNode(value);
        return (ceilingNode == null) ? null : ceilingNode.getValue();
    }

}
