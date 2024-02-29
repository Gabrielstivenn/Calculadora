
package com.mycompany.calculadora;

import java.util.Locale;
import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
      Scanner teclado = new Scanner(System.in);
    int nm1,nm2, re;
    
        System.out.println("digite um número para adição \n "  );
        nm1 = teclado.nextInt();
        System.out.println("digite outro número para adição \n ");
        nm2 = teclado.nextInt();
        System.out.println("resultado" );
        re = nm1 + nm2;
        System.out.println(re);
        
        
       
    
        System.out.println("digite um número para subtrair \n ");
        nm1 = teclado.nextInt();
        System.out.println("digite outro número subtrair \n ");
        nm2 = teclado.nextInt();
        re = nm1 - nm2;
        System.out.println(re);
        System.out.println("resultado ");
    
        System.out.println("digite um número para dividir \n ");
        nm1 = teclado.nextInt();
        System.out.println("digite outro número para dividir \n");
        nm2 = teclado.nextInt();
        re = nm1 * nm2;
        System.out.println(re);
        System.out.println("resultado ");
        
       
    
        System.out.println("digite um número \n");
        nm1 = teclado.nextInt();
        System.out.println("digite outro número \n");
        nm2 = teclado.nextInt();
        re = nm1 / nm2;
        System.out.println(re);
        System.out.println("resultado ");
        
        
        
                
        
        
    }
}
