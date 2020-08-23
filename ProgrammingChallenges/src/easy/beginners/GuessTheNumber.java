/*
Develop a game that must draw a number between 0 and 10, the user must
try to guess the number drawn, until you get it right. When the user hits the
number, the program should end showing the number of attempts made.

Desenvolva um jogo que deverá sortear um número entre 0 e 10, o usuário, deverá
tentar adivinhar o número sorteado, até acertar. Quando o usuário acertar o 
número, o programa deverá encerrar mostrando o número de tentativas feitas.
 */
package easy.beginners;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Angelo
 */
public class GuessTheNumber {
    //solução 1: comum
    public static void guessTheNumberSolution(){
        
        //faz o sorteio de 0 até 5
        Random sorteador = new Random();
        int sorteio = sorteador.nextInt(6);
        
        boolean acertou = false;
        while(!acertou){
            String sEscolha = JOptionPane
                .showInputDialog("Estou pensando em um número de 0 a 5 \n Adivinhe qual!");
            int escolha = Integer.parseInt(sEscolha);
            
            if(escolha == sorteio){
              JOptionPane.showMessageDialog(null, "Você acertou! Parabéns!");
              acertou = true;
            }else{
               JOptionPane.showMessageDialog(null, "Que pena! Você errou! Tente novamente!");
            }
        }
    }
    
    //Contando o número de tentativas
    public static void guessTheNumberSolutionCount(){
        
        //faz o sorteio de 0 até 5
        Random sorteador = new Random();
        int sorteio = sorteador.nextInt(6);
        
        int tentativas = 0;
        
        boolean acertou = false;
        while(!acertou){
            String sEscolha = JOptionPane
                .showInputDialog("Estou pensando em um número de 0 a 5 \n Adivinhe qual!");
            int escolha = Integer.parseInt(sEscolha);
            
            if(escolha == sorteio){
              JOptionPane.showMessageDialog(null, "Você acertou em "+ tentativas+" tentativas\n Parabéns!");
              acertou = true;
            }else{
               tentativas++;
               JOptionPane.showMessageDialog(null, "Que pena! Você errou! Tente novamente!");
            }
        }
    }
    
    public static void main(String[] args){
        guessTheNumberSolution();
    }
}
