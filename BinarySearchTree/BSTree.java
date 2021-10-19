public class BSTree {
  private BSTNode root;

  public BSTree() {
    root = null;
  }

  public void add(Letter obj) {
    BSTNode newNode = new BSTNode(obj);

    if (root == null) {
      root = newNode;
    } else {
      addNode(root, newNode);
    }
  }

  private void addNode(BSTNode current, BSTNode newNode) {
    if ( ((newNode.getValue()).compareTo(current.getValue()) < 0 )) {
      if (current.getLeft() == null) {
        current.setLeft(newNode);

      } else {
        addNode((BSTNode) current.getLeft(), newNode);
      }
    } else {
      if (current.getRight() == null) {
        current.setRight(newNode);
      } else {
        addNode((BSTNode) current.getRight(), newNode);

      }
    }
  }

  public String toString() {
    return toString(root);
  }

  private String toString(TreeNode current) {
    String str = "";

    if (current.getLeft() != null) {
      str += toString(current.getLeft()) + "\n";
    }

    str += current.getValue();

    if (current.getRight() != null) {
      str += "\n" + toString(current.getRight());
    }
    return str;
  }

  public BSTNode getRoot() {
    return root;
  }
  public void printPostorder(TreeNode node, int level)
    {
        if (node == null)
            return;
 
        
        printPostorder(node.getLeft(), level + 1);
 
        printPostorder(node.getRight(), level + 1);

        System.out.print("[Parent: " + node.getValue().getLetter() + "]\t");
        System.out.print("Level: " + level);
        System.out.println("(" + node.getValue().getLetter() + ") ");
    }
 
}
