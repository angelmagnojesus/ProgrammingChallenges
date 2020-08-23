/* FIND CROSSESS PROBLEM - PROBLEMA DE ENCONTRAR AS CRUZES

Problem definition:
Crosses problem - given an array of binary values ​​(0 or 1) find the
number of figures representing 1's crosses - structures that have a central bit,
one upper, one lower, one on the right and one on the left.
The crosses must have the following format:


X values ​​can represent either 0 or 1`s.
For example, a figure below has a total of 3 crosses.

Definição do problema:
Problema das cruzes - dada uma matriz de valores binários (0 ou 1) encontre a 
quantidade de figuras que representam cruzes de 1`s -  estruturas que possuem um bit central, 
um superior, um inferior, um na direita e outro na esquerda. 
As cruzes devem possuir o seguinte formato:
{X, 1, X}
{1, 1, 1}
{X, 1, X}
Os valores X podem representar tanto valores 0`s quanto 1`s. 
Por exemplo, a figura abaixo possui um total de 3 cruzes.

No exemplo abaixo há 3 cruzes:

0	1	0	0	1	0	0	0
1	1	1	0	1	1	0	0
1	1	0	0	0	1	1	0
0	0	0	1	1	0	0	0
0	0	1	1	1	1	0	0
0	0	0	1	1	1	0	0
0	0	1	0	0	0	0	1

 */
package medium;

/**
 *
 * @author Angelo
 */
public class FindCrosses {
    public static int findCrosses(int[][] tab){
         int cont = 0;
         for(int i = 1; i < tab.length - 1; i++){
           for(int j = 1; j < tab[0].length - 1; j++){
             if(tab[i][j]==1){
               //check
               if(tab[i+1][j]==1 && tab[i-1][j]==1 && 
                  tab[i][j+1]==1 && tab[i][j-1]==1)
                      cont++;
             }
           }    
         }
         return cont;
    }
    
    public static void main(String[] args) {
        int tab[][] = 
        {
            {0,1,0,0,1,0,0,0},
            {1,1,1,0,1,1,0,0},
            {1,1,1,0,0,1,1,0},
            {1,1,0,1,1,0,0,0},
            {0,0,1,1,1,1,0,0},
            {0,0,0,1,1,1,0,0},
            {0,0,1,0,0,0,0,1}
        };
        System.out.print(findCrosses(tab));
    }

}
