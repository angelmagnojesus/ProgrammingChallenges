/*
Count Pair Leafs/Conte Folhas Par

Problem: Develop an algorithm to count how many even-numbered nodes
a binary tree has.

Problema: Desenvolver um algoritmo para contar quantos nós folhas pares
uma árvore binária possui.
 */
package hard;

import mydatastructures.BinaryTree;
import mydatastructures.TNode;

/**
 *
 * @author Angelo
 */

class CountPairLeafsBTree extends BinaryTree{
   
   public int countPairLeafs(){
     return countPairLeafs(root);
   }
   
   public int countPairLeafs(TNode tnode){
     
     if(tnode == null){
         return 0;
     }else 
         if(checkLeaf(tnode) && tnode.getData() % 2 == 0){
            return 1;
         }
         else{
            return countPairLeafs(tnode.getLeftChild()) + 
                countPairLeafs(tnode.getRightChild());
         }
     }
    
    public boolean checkLeaf(TNode tnode){
        return tnode.getLeftChild() == null && 
                tnode.getRightChild() == null;
    }
  
}
public class BinaryTreeCountPairNodes {
    public static void main(String[] args){
      CountPairLeafsBTree bt = new CountPairLeafsBTree();
      bt.insert(7);
      bt.insert(3);
      bt.insert(1);
      bt.insert(0);
      bt.insert(2);
      bt.insert(5);
      bt.insert(4);
      bt.insert(6);
      bt.insert(9);
      bt.insert(10);
      System.out.println("Pair leafs: " + bt.countPairLeafs());
    }
}