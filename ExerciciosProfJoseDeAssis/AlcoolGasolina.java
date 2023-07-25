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
public class AlcoolGasolina {
    //Para carros flex é preciso ter cautela ao escolher o combustível na hora de abastecer.
    //A principal diferença de preços e vantegens entre os dois combustiveis esta na proporção preço X desempenho.
    //Para o alcool ser mais ventajoso do que a gasolina , o preço do litro tem que custar até 70% do litro da gasolina.
    //Baseado estas informações desenvolva um aplicativo no console(terminal) para determinar qual é o combustível mais vantajoso para abastecer.

    public static void main(String[] args) {
        //Objetos
        Scanner scan = new Scanner(System.in);

        //Variaveis
        double alcool, gasolina;

        //Entrada
        System.out.println("[ALCOOL X GASOLINA]");
        System.out.print("Informe o preco da gasolina:");
        gasolina = scan.nextDouble();

        System.out.print("Informe o preco do alcool:");
        alcool = scan.nextDouble();

        //Procesamento
        if (alcool < 0.7 * gasolina) {
            System.out.println("Abastecer com ALCOOL");
        } else {
            System.out.println("Abastecer com GASOLINA");
        }
        scan.close();
    }
}
