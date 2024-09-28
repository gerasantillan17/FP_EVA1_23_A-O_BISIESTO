/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication26;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int year;
        Scanner captu = new Scanner (System.in);
        System.out.println("YEAR:");
        year = captu.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)){
            System.out.println("El año es bisiesto");
          }  else {
            System.out.println("El año no es bisiesto");
        }
        
      
    }
    }
