/*
Simple Binary Tree data Structure
Estrutura de dado: Árvore Binária Simples
 */
package mydatastructures;

/**
 *
 * @author Angelo
 */
public class BinaryTree{
  public TNode root;
  
  public void insert(int data){
    if(root == null){
      root = new TNode(data);
      return;
    }
    insert(root, data);
    
  }
  public void insert(TNode n, int data){
    if(data < n.getData()){
      if(n.getLeftChild() == null){
        n.setLeftChild(new TNode(data));
      }else 
        insert(n.getLeftChild(), data);
    }
    else{
      if(n.getRightChild() == null){
        n.setRightChild(new TNode(data));
      }else 
        insert(n.getRightChild(), data);
    }
  }
}