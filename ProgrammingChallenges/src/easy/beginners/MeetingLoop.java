/*
Develop an algorithm in which given two numbers a and b (a <= b), you should print
numbers in ascending order from a and descendants from b, until
find, as in the example:

for a = 3 and b = 8 -> 3 8 4 7 5 6
for a = 2 and b = 6 -> 2 6 3 5 4 4

Desenvolva um algoritmo em que dado dois numeros a e b (a <= b), deverá imprimir
números em ordem ascendente a partir de a e descendentes a partir de b, até se 
encontrarem, como no exemplo:

para a=3 e b=8 -> 3 8  4 7  5 6
para a=2 e b=6 -> 2 6  3 5  4 4
 */
package easy.beginners;

/**
 *
 * @author Angelo
 */
public class MeetingLoop {
    public static void meetingLoopSolution() {

        int a = 3;
        int b = 30;

        while(a <= b){
            
            System.out.print(a);
            System.out.print(" ");
            System.out.print(b);
            System.out.println();
            
            a++; //a = a + 1;
            b--; //b = b - 1;
        }
    }
    
    public static void main(String args[]){
        meetingLoopSolution();
    }
}
