public class BinaryTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    private Node addValue(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.getValue()) {
            current.setLeft(addValue(current.getLeft(), value));
        } else if (value > current.getValue()) {
            current.setRight(addValue(current.getRight(), value));
        } else {
            return current;
        }
        return current;
    }

    public void add(int value) {
        this.root = addValue(root, value);
    }

    public void print(String prefix, Node node, boolean isLeft) {

        if (node != null) {
            print(prefix + "   ", node.getRight(), false);
            System.out.println (prefix + node.getValue());
            print(prefix + "   ", node.getLeft(), true);
        }
    }

   public int getHeight(Node root) {
        if(root == null){
            return 0;
        }
        else{
        {
            int left = getHeight(root.getLeft());
            int right = getHeight(root.getRight());
            if (left > right){
                return left + 1;
            }
            else{
                return right + 1;
            }
         }
        }
    }

   public int getWidth(Node node, int heightLevel) {
        if (node == null){
            return 0;
        }
        if (heightLevel == 1){
            return 1;
        }
        else if (heightLevel > 1){
            return getWidth(node.getLeft(), heightLevel - 1) + getWidth(node.getRight(), heightLevel - 1);
        }
        return 0;
    }

    int getMaxWidth(Node node) {
        int maxWidth = 0;
        int width;
        int treeHeight = getHeight(node);

        for (int i = 1; i <= treeHeight; i++) {
            width = getWidth(node, i);
            if (width > maxWidth){
                maxWidth = width;
            }
        }

        return maxWidth;
    }
}
