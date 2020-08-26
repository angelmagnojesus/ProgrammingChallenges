/*
Stack with stacks
Adapted from a Google interview question:
 Develop a Stack with limited stacks structure. "Each stack that makes up the largest stack must contain a limit
 of capacity. The "stack with stacks" must operate like an ordinary stack.

Pilha com pilhas
Adaptado de uma questão de entrevista do Google:
 Desenvolva uma estrutura de pilha com pilhas limitadas. Cada pilha que compoe a pilha maior deve conter um limite 
 de capacidade. A "pilha com pilhas deve operar como uma pilha comum.
 */
package hard;

import java.util.ArrayList;
import mydatastructures.Stack;

/**
 *
 * @author Angelo
 */
class StackOfStacks{
    ArrayList<Stack> stacks;
    int threshold;
    public StackOfStacks(int threshold){
      stacks = new ArrayList();
      Stack s = new Stack();
      stacks.add(s);
      this.threshold = threshold;
    }
    
    public void push(int d){
       Stack s = stacks.get(stacks.size()-1);//checar com apenas 1
       if(s.getSize() < threshold){
         s.push(d);
       }
       else{//pilha cheia criar uma nova pilha
         Stack sn = new Stack();
         sn.push(d);
         stacks.add(sn);
       }
    }
    
    public Integer pop(){
       int index = stacks.size()-1;
       Stack s = stacks.get(index);
       Integer res = s.pop();
       if(s.getSize() == 0 && index > 0){//pilha vazia apagar se não for a primeira
         stacks.remove(index);       
       }
       return res;  
    }
    
    public Integer popAt(int indStack){
       if(indStack > stacks.size())
           return null;
    
       Stack s = stacks.get(indStack);
       return s.pop();
    }
    
    //para testar 
    public void printStacks(){
       
       for(Stack s : stacks){
         Integer i = s.pop();
         Stack aux = new Stack();
         while(i != null){
           aux.push(i);
           System.out.print("  " + i + "  ");
           i = s.pop();
         }
         //reconstroi pilha
         i = aux.pop();
         while(i != null){
           s.push(i);
           i = aux.pop();
         }
         System.out.println();
       }
    }
}
