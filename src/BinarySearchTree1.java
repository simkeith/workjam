//Write a function that, efficiently with respect to time used,
// checks if a given binary search tree contains a given value.
//
//        For example, for the following tree:
//
//        n1 (Value: 1, Left: null, Right: null)
//        n2 (Value: 2, Left: n1, Right: n3)
//        n3 (Value: 3, Left: null, Right: null)
//        Call to contains(n2, 3) should return true since a tree with root at n2 contains number 3.

public class BinarySearchTree1 {
    public static boolean contains(Node1 root, int value) {
        while (root != null) {
            if (root.value == value) {
                return true;
            } else if (value < root.value) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node1 n1 = new Node1(1, null, null);
        Node1 n3 = new Node1(3, null, null);
        Node1 n2 = new Node1(2, n1, n3);

        System.out.println(contains(n2, 3));
    }
}

class Node1 {
    public int value;
    public Node1 left, right;

    public Node1(int value, Node1 left, Node1 right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}