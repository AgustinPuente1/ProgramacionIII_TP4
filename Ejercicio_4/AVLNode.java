package Ejercicio_4;

public class AVLNode {
    private String key;
    private int depth;
    private AVLNode left, right;

    public AVLNode(String d, int depth) {   
        this.key = d;
        this.depth = depth;
        this.left = null;
        this.right = null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public AVLNode getLeft() {
        return left;
    }

    public void setLeft(AVLNode left) {
        this.left = left;
    }

    public AVLNode getRight() {
        return right;
    }

    public void setRight(AVLNode right) {
        this.right = right;
    }
}
