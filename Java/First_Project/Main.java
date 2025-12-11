import java.util.Scanner;

class Node {

int data;

Node left, right;

public Node(int item) {

data = item;

left = right = null;

}

}

public class Main {

public Node insertLevelOrder(int[] arr, Node root, int i) {

if (i < arr.length) {

Node temp = new Node(arr[i]);

root = temp;

root.left = insertLevelOrder(arr, root.left, 2 * i + 1);

root.right = insertLevelOrder(arr, root.right, 2 * i + 2);

}

return root;

}

public void printInOrderOdd(Node root) {

if (root == null) {

return;

}

printInOrderOdd(root.left);

if (root.data % 2 != 0) {

System.out.print(root.data + " ");

}

printInOrderOdd(root.right);

}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

int[] arr = new int[n];

for (int i = 0; i < n; i++) {

arr[i] = sc.nextInt();

}

Main tree = new Main();

Node root = null;

root = tree.insertLevelOrder(arr, root, 0);

tree.printInOrderOdd(root);

sc.close();

}

}