public class Main {
  public static void main(String[] args) {
    Letter a = new Letter('A');
    Letter b = new Letter('B');
    Letter c = new Letter('C');
    Letter d = new Letter('D');
    Letter e = new Letter('E');
    Letter f = new Letter('F');
    Letter g = new Letter('G');
    Letter h = new Letter('H');
    Letter i = new Letter('I');
    Letter j = new Letter('J');
    Letter k = new Letter('K');
    Letter l = new Letter('L');


    BSTree tree = new BSTree();
    System.out.println("First tree: ");
    tree.add(a);
    tree.add(b);
    tree.add(c);
    tree.add(d);
    tree.add(e);
    tree.add(f);
    tree.add(g);
    tree.add(h);
    tree.add(i);
    tree.add(j);
    tree.add(k);
    tree.add(l);

    tree.printPostorder(tree.getRoot(), 0);

    BSTree treeAlt = new BSTree();

    System.out.println("Second tree: ");
    treeAlt.add(f);
    treeAlt.add(b);
    treeAlt.add(a);
    treeAlt.add(d);
    treeAlt.add(k);
    treeAlt.add(l);
    treeAlt.add(g);
    treeAlt.add(h);

    treeAlt.printPostorder(treeAlt.getRoot(), 0);


  }
}