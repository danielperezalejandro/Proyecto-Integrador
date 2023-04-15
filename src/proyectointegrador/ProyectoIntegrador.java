/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectointegrador;

import java.util.Scanner;

/**
 *
 * @author Gamer
 */
public class ProyectoIntegrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Usuario usuario1=new Usuario("Daniel Perez", "4517649D", "gold", "calle Ana Luisa", 638767176,0);
        
        usuario1.generarQr();
        
        System.out.println("Su codigo de entrada es "+usuario1.getQr());
        
        System.out.println("Introduzca su codigo para entrar:");
        System.out.println(usuario1.acceso(s.nextInt()));
        
       
        
        

    }
    
}
