/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosProfJoseDeAssis;

/**
 *
 * @author luana
 */
public class JogoCartas {

    public static void main(String[] args) {
        String[] nipes = {"Ouros", "Copas", "Espadas", "Paus"};
        String[] faces = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};

        //As linhas abaixo recuperam de forma aleatoria o conteudo dos arrays.
        String nipe = nipes[(int) (Math.random() * 4)];
        String face = faces[(int) (Math.random() * faces.length)];
        
        //Exibindo a carta sorteada
        System.out.println(face + " de "+nipe);
    }

}
