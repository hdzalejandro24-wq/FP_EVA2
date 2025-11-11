/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_23_busqueda;
import java.util.Scanner;
/**
 *
 * @author carpi
 */
public class EVA3_23_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor, posi = -1;
      int datos[] = new int[10]; 
        for (int i = 0; i < datos.length; i++) {
        datos[i] = (int)(Math.random() * 100);
        }  
        for (int i = 0; i < datos.length; i++) {
        System.out.print("[" +datos [i] + "]");
        
        }
           System.out.print("");
           System.out.print("Valor a buscar: ");
           valor = captu.nextInt();
           // BUSQUEDA LINEAL
           
           
           for (int i = 0; i < datos.length; i++) {
       if(valor == datos[i]){ //LO ENCONTRAMOS
           posi = i; // regresamos donde lo encontramos
           break; //ya lo encontre, detengo la busqueda
       }
        }
    System.out.println("posicion: "+ posi);


    }
}
