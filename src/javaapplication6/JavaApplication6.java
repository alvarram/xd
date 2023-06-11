/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alvar
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     	ArrayList<Integer> num = new ArrayList<Integer> ();
		
	
			Scanner entrada=new Scanner (System.in);
			int numero;
			do {
			
				System.out.println("Necesito que me digas almenos cinco numeros");
				
				numero=entrada.nextInt();
				num.add(numero);
				if(numero == -99) {
					
				num.get(numero);
				}
		
			}while(numero >-99);
			
			System.out.println(num);
    }
    
}
