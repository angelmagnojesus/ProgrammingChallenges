/*
Design an algorithm that gives a vector of integers, with numbers less than 10,
transform the vector into a binary vector, where values ​​greater than 5 become 1 and
less than or equal to 0.

 Example:
 [7, 1, 4, 3, 5, 6, 9, 2, 8] -> [1, 0, 0, 0, 0, 1, 1, 0, 1]
 [3, 8, 1, 6, 7] -> [0, 1, 0, 1, 1]
 [9, 3, 8] -> [1, 0, 1]

Projete um algoritmo que dado um vetor de inteiros, com números menores que 10,
transforme o vetor em um vetor binários, onde valores maiores que 5 virem 1 e 
menores ou iguais virem 0. 

 Exemplo:
 [7, 1, 4, 3, 5, 6, 9, 2, 8] -> [1, 0, 0, 0, 0, 1, 1, 0, 1] 
 [3, 8, 1, 6, 7] -> [0, 1, 0, 1, 1] 
 [9, 3, 8] -> [1, 0, 1]
 */
package easy.vectors;

import util.ArrayUtil;

/**
 *
 * @author Angelo
 */
public class IntToBin {

    public static void intToBinSolution(){
        int[] myvector = {7, 1, 4, 3, 5, 6, 9, 2, 8};
        ArrayUtil.printArray(myvector);
        for (int cont = 0; cont < myvector.length; cont++) {
            if (myvector[cont] > 5) {
                myvector[cont] = 1;
            } else {
                myvector[cont] = 0;
            }
        }
        ArrayUtil.printArray(myvector);
    }
    public static void main(String[] args){
        intToBinSolution();
    }
}