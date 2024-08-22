package Youtube;
public class BinaryTreesYT {
static class Node {
int data;
Node left;
Node right;
Node(int data) {
this.data = data;
this.left = null;
this.right = null;
}
}
static class BinaryTree {
static int idx = -1;
public static Node buildTree(int nodes[]) {
idx++;
if(nodes[idx] == -1) {
return null;
}
Node newNode = new Node(nodes[idx]);
newNode.left = buildTree(nodes);
newNode.right = buildTree(nodes);
return newNode;
}
}

public static void preorder(Node root) {
if(root == null) {
System.out.print(-1+" ");
return;
}
System.out.print(root.data+" ");
preorder(root.left);
preorder(root.right);
}
}
