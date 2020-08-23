/*
Develop an algorithm that given a binary vector, the algorithm informs the points
(vector indexes) of transition.
Example:
110011110111111 -> 2 4 8 9
00011100 -> 3 6

Desenvolva um algoritmo que dado um vetor binário, o algoritmo informa os pontos
(índices do vetor) de transição. 
Exemplo:
110011110111111 -> 2 4 8 9
00011100 -> 3 6
 */
package easy.vectors;

/**
 *
 * @author Angelo
 */
public class BitTransition{

    public static void bitTransitionSolution(){
        int[] myvector = {1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1};
        int previous = myvector[0];
        for (int i = 1; i < myvector.length; i++) {
            if(myvector[i] != previous) {
                System.out.println("Transition at position: " + i);
            }
            previous = myvector[i];
        }
    }
    
    public static void main(String[] args){
        bitTransitionSolution();
    }
}