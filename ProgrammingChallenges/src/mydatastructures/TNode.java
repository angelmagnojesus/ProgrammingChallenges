/*
 A Node of Binary Tree/
 Um nó da árvore binária
 */
package mydatastructures;

/**
 * @author Angelo
 */
public class TNode extends Node{
  
  protected TNode rightChild;
  protected TNode leftChild;
    
    public TNode(int data){
        super(data);
    }
    /**
     * @return the rightChild
     */
    public TNode getRightChild() {
        return rightChild;
    }

    /**
     * @param rightChild the rightChild to set
     */
    public void setRightChild(TNode rightChild) {
        this.rightChild = rightChild;
    }

    /**
     * @return the leftChild
     */
    public TNode getLeftChild() {
        return leftChild;
    }

    /**
     * @param leftChild the leftChild to set
     */
    public void setLeftChild(TNode leftChild) {
        this.leftChild = leftChild;
    }
  
}