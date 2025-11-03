/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_semana;
import java.util.Scanner;
/**
 *
 * @author carpi
 */
public class EVA2_5_SEMANA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int dia;
        String diaSemanas[] = new String[7];
        diaSemanas[0]= "Domingo";
        diaSemanas[1]= "Lunes";
        diaSemanas[2]= "Martes";
        diaSemanas[3]= "Miercoles";
        diaSemanas[4]= "Jueves";
        diaSemanas[5]= "Viernes";
        diaSemanas[6]= "Sabado";
        System.out.println("Introduce el dia en numero (0 al 6):");
        dia = captu.nextInt();
        System.out.println("el dia es " + diaSemanas[dia]);
              
        
    }
    
}
