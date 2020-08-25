/*
 */
package mydatastructures;

/**
 *
 * @author Angelo
 */
public class LinkedList {

    protected LNode head;
    protected LNode tail;

    public void insert(LNode lNode){
        if (head == null) {
            head = lNode;
            tail = lNode;
        }
        else{
            LNode current = head;
            while(current.hasNext()){
                current = current.getNext();
            }
            current.setNext(lNode);
            tail = lNode;
        }
    }
    public void insertData(int data){
        LNode lNode = new LNode(data);
        if (head == null) {
            head = lNode;
            tail = lNode;
        }
        else{
            LNode current = head;
            while(current.hasNext()){
                current = current.getNext();
            }
            current.setNext(lNode);
            tail = lNode;
        }
    }
    
    public LNode getHead(){
        return head;
    }
    
    public LNode getTail(){
        return tail;
    }
    
    public Integer getNode(int index){
        LNode current = head;
        
        int cont = 0;
        
        while(current != null && cont < index){
            current = current.getNext();
            cont++;
        }
        
        if(current == null)
            return null;
        else
            return current.getData();
    }
    public void printList(){
        LNode current = head;
        while(current != null){
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}