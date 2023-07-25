/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosProfJoseDeAssis;

/**
 *
 * @author luana
 */
public class Array2 {
    public static void main(String[] args) {
        String[][] agenda = {{"jose","99874-0258","profjoseassis@gmail.com"},
                             {"Bill","2222-5874","borabil@gmail.com"},
                             {"Linus","98745-1236","linux@gmail.com"}};
        
        //Recuperando dados
        //System.out.println(agenda[0][1]);
        //Percorrendo os indices do array
        for (int i = 0; i < agenda.length; i++) {
            System.out.println("___________________________");
            for (int j = 0; j < agenda.length; j++) {
                System.out.println(agenda[i][j]);
            }
        }
    }
    
}
