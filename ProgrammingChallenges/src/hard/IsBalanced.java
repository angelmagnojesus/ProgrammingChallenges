/*
Google Job Interviews Adapted Challenge - Check if a Binary tree is balanced.
Desafio Adaptado das Esntrevistas de emprego do Google - Checar se uma árvora Binária está balanceada.
 */
package hard;

import mydatastructures.BinaryTree;
import mydatastructures.TNode;

/**
 *
 * @author Angelo
 */
public class IsBalanced {
    //Only to test/ Apenas para testar
    public static void main(String[] args){
      CheckedBalancedTree bt = new CheckedBalancedTree();
      bt.insert(7);
      bt.insert(3);
      bt.insert(1);
      bt.insert(0);
      bt.insert(2);
      bt.insert(5);
      bt.insert(4);
      bt.insert(6);
      bt.insert(9);
      
      bt.isBalanced();
    }
}

class CheckedBalancedTree extends BinaryTree{
   
   public void isBalanced(){
     isBalanced(root);
   }
  
  public int isBalanced(TNode n){
    int dl = 0;
    int dr = 0;
    if(n.getLeftChild() == null && n.getRightChild() == null)
        return 1;
    if(n.getLeftChild() != null){
      dl = isBalanced(n.getLeftChild());
    }
    if(n.getRightChild() != null){
      dr = isBalanced(n.getRightChild());
    }
    System.out.println("Comparing "+dl+" com "+dr);
    if(Math.abs(dl - dr) > 1){
      System.out.println("Tree not balenced");
    }
    return (Math.max(dl, dr)+1);
  }
}