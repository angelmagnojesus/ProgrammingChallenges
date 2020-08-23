/*
Develop an algorithm to print any letter x any number n
Example:
5 b -> bbbbb
7 f -> fffffff
Desenvolva um algoritmo para imprimir n vezes uma letra x qualquer
Exemplo:
5 b -> bbbbb
7 f -> fffffff
 */
package easy.beginners;

import java.util.Scanner;

/**
 *
 * @author Angelo
 */
public class WriteRepeatingChars {
    
    public static void printRepeatingCharsSolution(){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        char x = sc.next().charAt(0);
        
        for(int c = 0; c < n; c++){
           System.out.print(x);
        }
    }
    
    public static void main(String[] args){
        printRepeatingCharsSolution();
    }
}
