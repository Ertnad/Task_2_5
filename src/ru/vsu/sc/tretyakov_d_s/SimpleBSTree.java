package ru.vsu.sc.tretyakov_d_s;

import java.util.function.Function;

public class SimpleBSTree <T extends Comparable<? super T>> extends SimpleBinaryTree<T> implements BSTree<T>  {

    public SimpleBSTree(Function<String, T> fromStrFunc) {
        super(fromStrFunc);
    }

    public SimpleBSTree() {
        super();
    }

}
