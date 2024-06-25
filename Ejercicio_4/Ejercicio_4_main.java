package Ejercicio_4;

public class Ejercicio_4_main {

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.insert("Olivia");
        tree.insert("Lola");    
        tree.insert("Agustin");
        tree.insert("Tomás");
        tree.insert("Julian");
        tree.insert("Rosana");
        tree.insert("Nestor");
        tree.insert("Raul");
        tree.insert("Angel");
        tree.insert("Marcelo");
        tree.insert("Pedro");
        tree.insert("Miranda");
        tree.insert("Julieta");
        tree.insert("Roman");
        tree.insert("Pepito");
        tree.insert("Marta");
        tree.insert("Martin");
        tree.insert("Geronimo");
        tree.insert("Nicolas");
        tree.insert("Miguel");
        tree.insert("Luis");
        tree.insert("Lucas");
        tree.insert("Juan");
        tree.insert("Andrea");
        tree.insert("Sofia");
        tree.insert("Maria");
        tree.insert("Luisa");
        tree.insert("Lucia");
        tree.insert("Jorge");
        
        tree.inOrder();
        System.out.println(tree.findDistance("Agustin", "Andrea"));
        System.out.println(tree.findDistance("Agustin", "Angel"));
        System.out.println(tree.findDistance("Agustin", "Sofia"));
        
        
        
    }
}
