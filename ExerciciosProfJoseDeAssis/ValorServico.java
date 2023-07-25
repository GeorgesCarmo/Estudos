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
public class ValorServico {
    //Desenvolva uma aplicação no console(terminal) para calcular o valor da hora de um serviço.
    public static void main(String[] args) {
        //Objetos
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        
        //Variaveis
        double hora,remuneracao,custo,cargaHoraria;
        
        //Entrada
        System.out.println("[Calculo do valor da hora de um servico]\n");
        System.out.print("Informe a remuneracao mensal pretendida:");
        remuneracao = scan.nextDouble();
        
        System.out.print("Informe o custo operacional mensal:");
        custo = scan.nextDouble();
        
        System.out.print("Informe a carga horaria mensal do trabalhador:");
        cargaHoraria = scan.nextDouble();
        
        //Processamento
        hora = (remuneracao+(remuneracao*0.3)+custo+(remuneracao*0.2))/cargaHoraria;
        
        //Saida
        System.out.println("Este trabalhador devera receber R$ "+formatador.format(hora)+" pela hora trabalhada.");
        scan.close();
    }
}
