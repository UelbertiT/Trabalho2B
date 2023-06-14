/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.menu;
import javax.swing.JOptionPane;

/**
 *
 * @author allan
 */

public class Menu {

    
    public static void main(String[] args) {
        
        int opcao = -1;
        
        while(opcao != 0 ){
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Cadastro Alunos \n" +
                    "2 - Cadastro Professores \n" +
                    "3 - Cadastro de Disciplinas \n" +
                    "4 - Cadastro de Turmas \n" +
                    "0 - Sair"));
            
            switch (opcao) {
                case 1:
                    //Executa o método de cadastro de alunos
                    cadastrarAluno();
                    break;
                case 2:
                    //Executa o método de cadastro de Professores
                    cadastrarProfessor();
                    break;    
                case 3:
                    //Executa o método de cadastro de Diciplinas    
                    cadastrarDisciplina();
                    break;    
                case 4:
                    //Executa o método de cadastro de Turmas
                    cadastrarTurma();
                    break;
                default:
                    break;
            }
            
        }

    }
    
    public static void cadastrarAluno(){
        JOptionPane.showMessageDialog(null, "Entrou no Cadastro de Alunos");
    }
    
    public static void cadastrarProfessor(){
        JOptionPane.showMessageDialog(null, "Entrou no Cadastro de Professores");
    }
    
    public static void cadastrarDisciplina(){
        JOptionPane.showMessageDialog(null, "Entrou no Cadastro de Disciplinas");
    }
    public static void cadastrarTurma(){
        JOptionPane.showMessageDialog(null, "Entrou no Cadastro de Turmas");
    }  
}	