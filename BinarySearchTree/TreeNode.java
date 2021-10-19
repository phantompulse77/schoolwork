 public class TreeNode implements Comparable<TreeNode> {

  private Letter value;
  private TreeNode left;
  private TreeNode right;

  public TreeNode (Letter initValue, TreeNode initLeft, TreeNode initRight){
    value = initValue;
    left = initLeft;
    right = initRight;
  }

  public Letter getValue(){
    return value;
  }

  public TreeNode getLeft(){
    return left;
  }
  public TreeNode getRight(){
    return right;
  }
  public void setValue(Letter theNewValue){
    value = theNewValue;
  }
  public void setLeft(TreeNode theNewLeft){
    left = theNewLeft;
  }
  public void setRight(TreeNode theNewRight){
    right = theNewRight;
  }

  public int compareTo(TreeNode obj){
    return this.getValue().compareTo(obj.getValue());
    
  }
}
