/*
 */
package mydatastructures;

/**
 *
 * @author Angelo
 */
public class LNode extends Node{
    
    protected LNode next;
    
    public LNode(int data){
        super(data);
    }
    
    public boolean hasNext(){
        return !(next == null);
    }
    public void setNext(LNode lNode){
        next = lNode;
    }
    
    public LNode getNext(){
        return next;
    }
}