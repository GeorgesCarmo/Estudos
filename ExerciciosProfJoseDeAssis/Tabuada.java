/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosProfJoseDeAssis;

import java.util.Scanner;

/**
 *
 * @author luana
 */
public class Tabuada {
    
    public static void main(String[] args) {
        int valor;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor da tabuada: ");
        valor = scan.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor +" x "+i+" = "+(valor*i));
        }
    }
    
}
