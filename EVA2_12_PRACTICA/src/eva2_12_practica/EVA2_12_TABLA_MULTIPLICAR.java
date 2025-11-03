/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_practica;

import java.util.Scanner;

/**
 *
 * @author carpi
 */
public class EVA2_12_TABLA_MULTIPLICAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
    int numero;
    
    System.out.println("Introduce la tabla de multiplicar");
  numero = captu.nextInt();
  for(int i = 1; i <=10; i++)
     System.out.println(i + "x" + numero + "-" + i*numero);
    
    }
    
}
