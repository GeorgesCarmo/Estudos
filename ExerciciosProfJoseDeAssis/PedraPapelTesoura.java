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
public class PedraPapelTesoura {

    public static void main(String[] args) {
        int jogador, computador;
        Scanner scan = new Scanner(System.in);
        System.out.println("Pedra | Papel | Tesoura\n");
        System.out.println("1. Pedra");
        System.out.println("2. Papel");
        System.out.println("3. Tesoura");
        System.out.print("Informe a opcao desejada: ");
        jogador = scan.nextInt();

        //Logica do jogador
        switch (jogador) {
            case 1:
                System.out.println("\nJogador escolheu PEDRA");
                break;
            case 2:
                System.out.println("\nJogador escolheu PAPEL");
                break;
            case 3:
                System.out.println("\nJogador escolheu TESOURA");
                break;
            default:
                System.out.println("\nOpcao invalida!");
        }

        // Logica do computador
        computador = (int) (Math.random() * 3 + 1);

        switch (computador) {
            case 1:
                System.out.println("\nComputador escolheu PEDRA");
                break;
            case 2:
                System.out.println("\nComputador escolheu PAPEL");
                break;
            case 3:
                System.out.println("\nComputador escolheu TESOURA");
                break;
        }
        //Logica para determinar o vencedor
        if (jogador == computador) {
            System.out.println("\nEMPATE");
        } else {
            if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1 || (jogador == 3 && computador == 2))) {
                System.out.println("\nJOGADOR VENCEU");
            } else {
                System.out.println("\nCOMPUTADOR VENCEU");
            }
        }
        scan.close();
    }

}
