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
  
  public int getHeigth(){
     return getHeigth(root, 0) - 1;
  }
  
  public int getHeigth(TNode n, int cont){

    if(n == null)
        return cont;
    
    cont++;
    
    return (Math.max(getHeigth(n.getLeftChild(), cont), 
                     getHeigth(n.getRightChild(), cont)));
  }
}