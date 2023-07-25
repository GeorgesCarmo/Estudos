/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosProfJoseDeAssis;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author luana
 */
public class IMC {
    //Desenvolva um aplicativo no console(terminal) para calcular o valor do IMC.

    public static void main(String[] args) {
        //Objetos
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        
        //Variaveis
        double peso, altura, imc;

        //Entrada
        System.out.println("[Calculo de IMC]");
        System.out.print("Informe o peso:");
        peso = scan.nextDouble();

        System.out.print("Informe a altura:");
        altura = scan.nextDouble();

        //Processamento
        imc = peso / (altura * altura);

        //Saida
        System.out.println("IMC: " + formatador.format(imc));

        //Condicoes
        if (imc < 18.5) {
            System.out.println("Abaixo do peso!");
        } else if (imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc < 30) {
            System.out.println("Levemente acima do peso");
        } else if (imc < 35) {
            System.out.println("Obesidade grau I");
        } else if (imc < 40) {
            System.out.println("Obesidade grau II(severa)");
        } else {
            System.out.println("Obesidade grau III(morbida)");
        }
    }
}
