/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Angelo
 */
public class ArrayUtil {
    public static void printArray(int[] myarray){
        for(int c = 0; c < myarray.length; c++)
            System.out.print(myarray[c]+" ");
        System.out.println();
        
    }
}