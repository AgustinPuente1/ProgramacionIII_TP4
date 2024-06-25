package Ejercicio_4;

public class AVLTree {
    private AVLNode root;

    public int getDepth(AVLNode N) {
        if (N == null)
            return -1;
        return N.getDepth();
    }

    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public AVLNode rightRotate(AVLNode y) {
        if (y == null || y.getLeft() == null) {
            return y;
        }
        AVLNode x = y.getLeft();
        AVLNode T2 = x.getRight();

        x.setRight(y);
        y.setLeft(T2);

        y.setDepth(max(getDepth(y.getLeft()), getDepth(y.getRight())) + 1);
        x.setDepth(max(getDepth(x.getLeft()), getDepth(x.getRight())) + 1);

        return x;
    }

    public AVLNode leftRotate(AVLNode x) {
        if (x == null || x.getRight() == null) {
            return x;
        }
        AVLNode y = x.getRight();
        AVLNode T2 = y.getLeft();

        y.setLeft(x);
        x.setRight(T2);

        x.setDepth(max(getDepth(x.getLeft()), getDepth(x.getRight())) + 1);
        y.setDepth(max(getDepth(y.getLeft()), getDepth(y.getRight())) + 1);

        return y;
    }

    public int getBalance(AVLNode N) {
        if (N == null)
            return 0;
        return getDepth(N.getLeft()) - getDepth(N.getRight());
    }

    public AVLNode insert(AVLNode node, String key, int depth) {
        if (node == null)
            return new AVLNode(key, depth);

        if (key.compareTo(node.getKey()) < 0)
            node.setLeft(insert(node.getLeft(), key, depth + 1));
        else if (key.compareTo(node.getKey()) > 0)
            node.setRight(insert(node.getRight(), key, depth + 1));
        else
            return node;

        node.setDepth(max(getDepth(node.getLeft()), getDepth(node.getRight())) + 1);

        int balance = getBalance(node);

        if (balance > 1 && key.compareTo(node.getLeft().getKey()) < 0)
            return rightRotate(node);

        if (balance < -1 && key.compareTo(node.getRight().getKey()) > 0)
            return leftRotate(node);

        if (balance > 1 && key.compareTo(node.getLeft().getKey()) > 0) {
            node.setLeft(leftRotate(node.getLeft()));
            return rightRotate(node);
        }

        if (balance < -1 && key.compareTo(node.getRight().getKey()) < 0) {
            node.setRight(rightRotate(node.getRight()));
            return leftRotate(node);
        }

        return node;
    }

    public void inOrder(AVLNode node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(node.getKey() + " (Depth: " + node.getDepth() + ") ");
            inOrder(node.getRight());
        }
    }

    public void insert(String key) {
        root = insert(root, key, 0);
    }

    public void inOrder() {
        inOrder(root);
    }

    // Método para encontrar el LCA (Lowest Common Ancestor)
    private AVLNode findLCA(AVLNode node, String n1, String n2) {
        if (node == null) {
            return null;
        }

        if (node.getKey().equals(n1) || node.getKey().equals(n2)) {
            return node;
        }

        AVLNode leftLCA = findLCA(node.getLeft(), n1, n2);
        AVLNode rightLCA = findLCA(node.getRight(), n1, n2);

        if (leftLCA != null && rightLCA != null) {
            return node;
        }

        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    // Método para encontrar la distancia desde el LCA hasta un nodo dado
    private int findDistanceFromLCA(AVLNode node, String key, int distance) {
        if (node == null) {
            return -1;
        }

        if (node.getKey().equals(key)) {
            return distance;
        }

        int leftDistance = findDistanceFromLCA(node.getLeft(), key, distance + 1);
        if (leftDistance != -1) {
            return leftDistance;
        }

        return findDistanceFromLCA(node.getRight(), key, distance + 1);
    }

    // Método para encontrar la distancia entre dos nodos
    public int findDistance(String n1, String n2) {
        AVLNode lca = findLCA(root, n1, n2);
        if (lca == null) {
            return -1;
        }

        int d1 = findDistanceFromLCA(lca, n1, 0);
        int d2 = findDistanceFromLCA(lca, n2, 0);

        return d1 + d2;
    }
}
