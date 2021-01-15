//// PRINT THE HEIGHT OF THE TREE
//
//class Node {
//    private Node leftChild, rightChild;
//
//
//    public Node(Node leftChild, Node rightChild) {
//        this.leftChild = leftChild;
//        this.rightChild = rightChild;
//    }
//
//    public Node getLeftChild() {
//        return this.leftChild;
//    }
//
//    public Node getRightChild() {
//        return this.rightChild;
//    }
//
//    public int height() {
//        int height =0;
//        Node node = this;
//        while (node.getLeftChild() != null){
//            height ++;
//            node = this;
//        }
//    while ( this.getRightChild()==null){
//        height++;
//        leaf=this;  // hit the leaf node
//    }
//return height;
//    }
//
//    public static void main(String[] args) {
//        Node leaf1 = new Node(null, null);
//        Node leaf2 = new Node(null, null);
//        Node node = new Node(leaf1, null);
//        Node root = new Node(node, leaf2);
//
//        System.out.println(root.height());
//    }
//}