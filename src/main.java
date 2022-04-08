import java.util.LinkedList;
import java.util.Queue;

public class main {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(9);
        binaryTree.add(4);
        binaryTree.add(15);
        binaryTree.add(5);
        binaryTree.add(14);
        binaryTree.add(3);
        binaryTree.add(16);
        binaryTree.add(2);
        binaryTree.add(17);
        binaryTree.add(6);
        binaryTree.add(33);

        binaryTree.print("", binaryTree.getRoot(), false);
        System.out.println("BinaryTree Height: " + binaryTree.getHeight(binaryTree.getRoot()));
        System.out.println("BinaryTree Width: " + binaryTree.getMaxWidth(binaryTree.getRoot()));
    }
}
