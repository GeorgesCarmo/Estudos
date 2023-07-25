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
public class PDV {
    // Desenvolva uma aplicação no console(terminal) de ponto de vendas (PDV).
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total,desconto,totalDesconto,valorPago,troco;
        //Entrada
        System.out.println("SISTEMA DE VENDAS PDV");
        
        System.out.print("Informe o valor do produto: ");
        total = scan.nextDouble();
        
        System.out.print("Informe a porcentagem de desconto: ");
        desconto = scan.nextDouble();
        
        System.out.print("Informe o valor pago pelo cliente: ");
        valorPago = scan.nextDouble();
        
        //Processamento
        totalDesconto = total-(desconto * total)/100;
        
        troco = valorPago - totalDesconto;
        
        //Saida
        System.out.println("[Relatorio da venda]\nValor do produto: "+total+
                "\nValor do produto com desconto: "+totalDesconto+
                "\nValor pago pelo cliente: "+valorPago+
                "\nTroco: "+troco);
            scan.close();
        }

}

