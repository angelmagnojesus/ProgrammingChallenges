/*
Develop an algorithm to print all numbers from 1 to 100
divisors of a number x (entered by the user)
Desenvolva um algoritmo para imprimir todos os números de 1 até 100
divisores de um número x (informado pelo usuário)
 */
package easy.beginners;

import java.util.Scanner;

/**
 *
 * @author Angelo
 */
public class Dividers1To100 {

    public static void dividers1To100Solution1() {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int cont = 0;
        while(cont < 100){
            if (cont % x == 0){
                System.out.println(cont);
            }
            cont++;
        }
    }

    public static void dividers1To100Solution2(){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        for(int cont = 0; cont < 100; cont++){
            if (cont % x == 0){
                System.out.println(cont);
            }
        }
    }
    
    public static void main(String args[]){
        dividers1To100Solution1();
    }
}