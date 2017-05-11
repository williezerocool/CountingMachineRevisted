/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingmachinerevisited;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class CountingMachineRevisited {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int countFrom, countTo, countBy, i;
        
        System.out.print("Count from: ");
        countFrom = k.nextInt();
        System.out.print("Count to: ");
        countTo = k.nextInt();
        System.out.print("Count by: ");
        countBy = k.nextInt();
        
        for(i = countFrom; i <= countTo; i += countBy ){
        
            System.out.println(i);
        }
    }
    
}
