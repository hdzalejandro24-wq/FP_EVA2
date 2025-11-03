/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_factorial;
import java.util.Scanner;

public class EVA2_26_FACTORIAL {
    public static void main(String[] args) {
        Scanner captu= new Scanner(System.in);
        System.out.print("Introduce un número y calcula su factorial: ");
        int numero = captu.nextInt();

       
        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
            return;
        }

        long factorial = 1; 
        for (int i = numero; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}

