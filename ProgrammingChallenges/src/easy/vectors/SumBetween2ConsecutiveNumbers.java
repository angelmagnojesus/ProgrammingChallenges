/*
Develop an algorithm to find the largest sum between two numbers in
sequence in a vector.
Example: [2, 3, 5, 4, 3] -> 5, 4
         [1, 4, 3, 2, 0] -> 4, 3

Desenvolva um algoritmo para a descobrir a maior soma entre dois números em 
sequencia em um vetor.
Exemplo: [2, 3, 5, 4, 3] -> 5, 4
         [1, 4, 3, 2, 0] -> 4, 3
 */
package easy.vectors;

import util.ArrayUtil;

/**
 *
 * @author Angelo
 */
public class SumBetween2ConsecutiveNumbers {

    public static void getHighestSumBetween2ConsecutiveNumbers(){
        int[] myvector = {2, 3, 5, 4, 3};
        ArrayUtil.printArray(myvector);
        int limit = myvector.length - 1;
        int a = myvector[0];
        int b = myvector[1];
        int highestSum = a + b;
        for (int i = 0; i < limit; i++) {
            int sum = myvector[i] + myvector[i + 1];
            if (sum > highestSum) {
                highestSum = sum;
                a = myvector[i];
                b = myvector[i + 1];
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
    
    public static void main(String[] args){
        getHighestSumBetween2ConsecutiveNumbers();
    }

}