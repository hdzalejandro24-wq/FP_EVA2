/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_captura;
import java.util.Scanner;
/**
 *
 * @author carpi
 */
public class EVA2_14_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);{
        int tama;
        System.out.println("Cantidad de calificaciones:");
        tama = captu.nextInt();
        int califa[] = new int[tama];
        
        for(int i = 0; i < califa.length; i++){
        System.out.println("Calificacion " + (i+1) + ":");
        califa[i] = captu.nextInt();
        }
        //LEER
        for(int i = 0; i < califa.length; i++){
        System.out.print("[" + califa[i] + "]");
       
    }
        int suma = 0;
        // sumar todas las calificaciones 
        for(int i = 0; i < califa.length; i++){
        suma = suma + califa[i];
        // SUMA += CALIFA[1]
            }
    double promedio = suma / (double)tama;//diviendo enteros
     System.out.println("Promedio = " + promedio);
     //????????????????????
}
    }
}