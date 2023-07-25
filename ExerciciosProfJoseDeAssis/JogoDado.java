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
public class JogoDado {

    public static void main(String[] args) {
        char opcao = 's';
        Scanner scan = new Scanner(System.in);
        while (opcao == 's') {
            System.out.println("Lancamento do dado...");
            int dado = (int)(Math.random()*6+1);
            System.out.println("Face: "+dado);
            System.out.print("Deseja lancar o dado novamente(s/n):");
            opcao = scan.next().charAt(0);
        } 
        scan.close();
    }
}
