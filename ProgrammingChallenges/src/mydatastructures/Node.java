package mydatastructures;

/**
 *
 * @author Angelo
 */
public abstract class Node {
    
    protected int data;
    
    public Node(int data){
        this.data = data;
    }
    
    public void setData(int data){
       this.data = data; 
    }
    
    public int getData(){
       return data;
    }
}