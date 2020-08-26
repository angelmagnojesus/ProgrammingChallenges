/*
Even Odd Linked List/Linked List Par Impar

[A] Develop an algorithm that removes odd values ​​from a Linked List
[B] Develop an algorithm that separates a Linked List into first
    even values ​​and after odd values
    e.g.: [2 3 6 7 8 11] -> [2 6 8 3 7 11]

[A] Desenvolva um algoritmo que remova valores ímpares de uma Linked List
[B] Desenvolva um algoritmo que separe uma Linked List em primeiramente
    valores pares e após valores ímpares 
    ex.: [2 3 6 7 8 11] -> [2 6 8 3 7 11]

 */
package hard;

import mydatastructures.LNode;
import mydatastructures.LinkedList;

/**
 *
 * @author Angelo
 */     
public class LinkedListEvenOdd extends LinkedList{
    public void remorveOddNodes(){
        
        while(head != null && head.getData() % 2 != 0){
            head = head.getNext();
            tail = head;
        }           
        
        if(head == null)
            return;
        
        LNode current = head;
        while(current.hasNext()){
            //next is a oddNode
            if(current.getNext().getData() % 2 != 0){
                LNode nextNode = current.getNext();
                current.setNext(nextNode.getNext());           
            }else{
                current = current.getNext();
                tail = current;
            }
        }   
    }
    
    public void evenOddNodesParser(){
        LinkedList evenList = new LinkedList();
        LinkedList oddList = new LinkedList();
        
        LNode current = head;
        while(current != null){         
            LNode nodeToInsert = current;
            current = current.getNext();
            
            nodeToInsert.setNext(null);
            
            if(nodeToInsert.getData() % 2 == 0){
                evenList.insert(nodeToInsert);
            }else{
                oddList.insert(nodeToInsert);
            }     
        }

        //join the lists
        evenList.getTail().setNext(oddList.getHead());
        //set this list
        this.head = evenList.getHead();
        this.tail = oddList.getTail();
    }
    
    public static void main(String[] args){
        LinkedListEvenOdd list = new LinkedListEvenOdd();
        list.insertData(3);
        list.insertData(9);
        list.insertData(1);
        list.insertData(2);
        list.insertData(4);
        list.insertData(5);
        list.insertData(7);
        list.insertData(0);
        list.insertData(9);
        list.insertData(11);
        list.insertData(8);
        list.printList();
        list.evenOddNodesParser();
        list.printList();
        System.out.println(list.getHead().getData());
        System.out.println(list.getTail().getData());
    }
}
