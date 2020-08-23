/*
Erase Bits Sequence/Apagar Sequencia de Bits

Develop an algorithm that given a binary vector, keep only the first
bit 1 of a sequence and clear the rest of bits 1 of the sequence.

Examples:
given 0111011011 -> 0100010010
     11100110 -> 10000100

Desenvolva um algoritmo que dado um vetor binário, mantenha apenas o primeiro
bit 1 de uma sequência e apague o restante de bits 1 da sequência.

Exemplos:
dado 0111011011 -> 0100010010
     11100110 -> 10000100
 */
package medium;

import util.ArrayUtil;

/**
 *
 * @author Angelo
 */
public class EraseSequenceBits {

    public static void eraseSequenceBitsSolution(){
        int[] myvector = {0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1};
        ArrayUtil.printArray(myvector);
        boolean erase = false;
        for (int i = 0; i < myvector.length; i++){
            if (myvector[i] == 1 && !erase){
                erase = true;
            } else if (myvector[i] == 1) {
                myvector[i] = 0;
            } else {
                erase = false;
            }
        }
        ArrayUtil.printArray(myvector);
    }
    
    public static void main(String[] args){
        eraseSequenceBitsSolution();
    }
}