/*
Sum Combination Problem/Problema da Compbinação de Somas
Adapted from an Interview for Amazom Software Engineer role

Sum Summing Problem

Given a number X, print all possible combinations of numbers A, B and C where X = A + B + C.

Example:
Input 4
Output:
0 0 4
0 1 3
0 2 2
0 3 1
0 4 0
1 0 3
1 1 2
1 2 1
1 3 0
2 0 2
2 1 1
2 2 0
3 0 1
3 1 0
4 0 0

Adaptado de uma Entrevista para Engenheiro de Software de Amazom

Problema da Combinação das Somas

Dado um número X, imprimir todas as combinações possíveis de números A, B e C em que X = A + B + C.

Exemplo:
entrada 4
Saída:
0 0 4
0 1 3
0 2 2
0 3 1
0 4 0
1 0 3
1 1 2
1 2 1
1 3 0
2 0 2
2 1 1
2 2 0
3 0 1
3 1 0
4 0 0
 */
package medium;

/**
 *
 * @author Angelo
 */
public class SumCombination {
    public static void combine(int x){
        int end = x;
        for(int f = 0; f <= x; f++){          
            for(int s = 0; s <= end; s++){
                int t = end - s; 
                System.out.println(f+" "+s+" "+t);
            }
            end--;
        }
    }
    public static void main(String args[]){
       combine(8);
    }
}
