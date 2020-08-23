/*
Binary Tree to Print Matrix/Árvore Binária para Matriz para Imprimir
Design an algorithm to transform a Binary Tree into a representation
visual in a matrix. Disregard elements 0 (zero) as elements of the tree.
Example - considering '-' as 0 elements:
{-,-,-,10,-,-,-},
{-,5,-,-,-,15,-},
{1,-,7,-,12,-,18}

Projete um algoritmo para transformar uma Árvore Binária em uma represetação 
visual em uma matriz. Desconsidere elementos 0 (zero) como elementos da árvore.
Exemplo - considerando '-' como elementos 0:
{-,-,-,10,-,-,-},
{-,5,-,-,-,15,-},
{1,-,7,-,12,-,18}
 */
package hard;

import mydatastructures.BinaryTree;
import mydatastructures.TNode;

/**
 *
 * @author Angelo
 */
class TreeToMatrix extends BinaryTree{
   
  public int[][] getMatrix(){
      int h = getHeigth();
      int coluns = (int) Math.pow(2, h+1) - 1;
      int lines = h+1;
      int[][] treeMatrix = new int[lines][coluns];
      insertMat(root, treeMatrix, 0, coluns - 1, 0);
      return treeMatrix;
  }
  public void insertMat(TNode n, int[][] treeMatrix, int ix, int fx, int y){
      
      if(n == null)
          return;
      
      int p = (int) Math.ceil((ix + fx)/2);
      treeMatrix[y][p] = n.getData();
      y++; 
      insertMat(n.getLeftChild(), treeMatrix, ix, p - 1, y);
      insertMat(n.getRightChild(), treeMatrix, p + 1, fx, y);
  }
}
public class TreeToMatrixPrint {
     public static void main(String[] args){
      TreeToMatrix bt = new TreeToMatrix();
      bt.insert(10);
      bt.insert(5);
      bt.insert(15);
      bt.insert(1);
      bt.insert(7);
      bt.insert(12);
      bt.insert(18);
      bt.insert(22);
      bt.insert(16);

      int[][] m = bt.getMatrix();
      for(int i = 0; i< m.length; i++){
          for(int j = 0; j< m[0].length; j++){
              if(m[i][j] == 0)
                  System.out.print("-");
              else
                  System.out.print(m[i][j]);     
          }
          System.out.println();
      }
    }
}