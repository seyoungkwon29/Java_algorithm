package com.java_algorithm.recursive;

public class BinaryTreeSearch {
    // static으로 두면 전역변수로써 하나만 존재하게 되는데
    // 이진트리는 항상 해당 객체에서 부모가 바뀌기 때문에 root는 인스턴스변수여야 한다.
    Node root;

    public void binaryTree(Node root) {
        // 말단 노드는 null 이기 때문에 탐색 끝
        if (root == null) return;
        else {
            // 전위순회
            System.out.print(root.data + " ");
            binaryTree(root.lt);
            // 중위순회
            // System.out.print(root.data + " ");
            binaryTree(root.rt);
            // 후위순회
            // System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTreeSearch tree = new BinaryTreeSearch();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.binaryTree(tree.root);
    }
}

// Node 클래스
class Node {
    int data;
    Node lt;
    Node rt;

    public Node(int val) {
        data = val;
        lt = null;
        rt = null;
    }
}