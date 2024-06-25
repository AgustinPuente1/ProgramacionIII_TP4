package Ejercicio_5;

import java.util.LinkedList;
import java.util.Queue;

class BinarySearchTreeFalla {
    NodeFalla root;

    BinarySearchTreeFalla() {
        root = null;
    }

    // Insertar un valor en el árbol
    void insert(int value) {
        root = insertRec(root, value);
    }

    NodeFalla insertRec(NodeFalla root, int value) {
        if (root == null) {
            root = new NodeFalla(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    // guardar en cola

    

    // Encontrar la distancia entre dos nodos
    int distanceBetweenNodes(int value1, int value2) {
        NodeFalla lca = findLCA(root, value1, value2);
        if (lca == null) {
            return -1; // uno o ambos nodos no están en el árbol
        }
        return distanceFromLCA(lca, value1) + distanceFromLCA(lca, value2);
    }

    // Encontrar el ancestro común más bajo (LCA)
    NodeFalla findLCA(NodeFalla root, int value1, int value2) {
        if (root == null) return null;
        if (root.value == value1 || root.value == value2) return root;

        NodeFalla leftLCA = findLCA(root.left, value1, value2);
        NodeFalla rightLCA = findLCA(root.right, value1, value2);

        if (leftLCA != null && rightLCA != null) return root;

        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    // Distancia desde el LCA a un valor
    int distanceFromLCA(NodeFalla root, int value) {
        if (root == null) return -1;
        if (root.value == value) return 0;
        int dist = (value < root.value) ? distanceFromLCA(root.left, value) : distanceFromLCA(root.right, value);
        return (dist == -1) ? -1 : 1 + dist;
    }

    // Encontrar la profundidad de un nodo
    int depthOfNode(int value) {
        return depthRec(root, value, 0);
    }

    int depthRec(NodeFalla root, int value, int depth) {
        if (root == null) return -1;
        if (root.value == value) return depth;

        int dist = (value < root.value) ? depthRec(root.left, value, depth + 1) : depthRec(root.right, value, depth + 1);
        return dist;
    }

    // Imprimir todos los elementos por nivel
    void printLevelOrder() {
        if (root == null) return;
        Queue<NodeFalla> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            NodeFalla tempNode = queue.poll();
            System.out.print(tempNode.value + " ");
            if (tempNode.left != null) queue.add(tempNode.left);
            if (tempNode.right != null) queue.add(tempNode.right);
        }
    }

    // Encontrar la profundidad del árbol
    int maxDepth() {
        return maxDepthRec(root);
    }

    int maxDepthRec(NodeFalla root) {
        if (root == null) return 0;
        int leftDepth = maxDepthRec(root.left);
        int rightDepth = maxDepthRec(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
