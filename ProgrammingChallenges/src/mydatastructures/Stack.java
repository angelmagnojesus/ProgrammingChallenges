/*
 */
package mydatastructures;

/**
 *
 * @author Angelo
 */
public class Stack{
 LNode top;
 private int size = 0;
 public Integer pop() {
    if (top != null) {
        int item = top.data;
        top = top.next;
        size--;
        return item;
    }
    return null;
 }
 public void push(Integer item) {
    LNode t = new LNode(item);
    t.next = top;
    top = t;
    size++;
 }
 public int getSize(){
   return size;
 }
}