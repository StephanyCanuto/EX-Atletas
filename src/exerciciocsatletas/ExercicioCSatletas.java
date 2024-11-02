/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciocsatletas;
import javax.swing.JOptionPane;
/**
 *
 * @author steph
 */
public class ExercicioCSatletas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Jogador: "));
        
        switch(idade){
            case 5,6,7,8,9,10 -> JOptionPane.showMessageDialog(null, """
                                                                     CATEGORIA INFANTIL
                                                                      IDADE: """+ idade);
            case 11,12,13,14,15 -> JOptionPane.showMessageDialog(null, """
                                                                       CATEGORIA JUVENIL
                                                                        IDADE: """+ idade);
            case 16,17,18,19,20 -> JOptionPane.showMessageDialog(null, """
                                                                       CATEGORIA JUNIOR
                                                                        IDADE: """+ idade);
            case 21,22,23,24,25 -> JOptionPane.showMessageDialog(null, """
                                                                       CATEGORIA PROFISSIONAL
                                                                        IDADE: """+ idade);
            default -> JOptionPane.showMessageDialog(null, "Idade inválida");
        }
    }
    
}
