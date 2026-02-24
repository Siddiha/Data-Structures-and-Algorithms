public class BinaryTree {

    public class TreeNode {
        public int data;
        public TreeNode leftChild, rightChild, parent;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    private TreeNode root;

    public TreeNode find(int findMe) {
        TreeNode n = root;

        while (n != null) {
            if (n.data == findMe)
                return n;

            if (findMe > n.data)
                n = n.rightChild;
            else
                n = n.leftChild;
        }

        return null;
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = tree.new TreeNode(6);
        tree.root.leftChild = tree.new TreeNode(2);
        tree.root.rightChild = tree.new TreeNode(8);
        tree.root.rightChild.leftChild = tree.new TreeNode(7);
        tree.root.rightChild.rightChild = tree.new TreeNode(9);

        TreeNode result = tree.find(7);

        if (result != null)
            System.out.println("Found: " + result.data);
        else
            System.out.println("Not found");
    }
}