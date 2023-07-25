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
public class RegraDe3 {
    //Desenvolva uma aplicação no console(terminal) para calcular o valor da porcentagem usando Regra de 3.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Entradas
        double x, y, valor;
        System.out.println("REGRA DE 3");
        System.out.println("X% de Y = VALOR");
        System.out.print("Informe o valor de X: ");
        x = scan.nextDouble();

        System.out.print("Informe o valor de Y: ");
        y = scan.nextDouble();

        //Processamento
        valor = (x * y) / 100;

        //Saida
        System.out.println(x + "% de " + y + " = " + valor);
        scan.close();
    }

}
