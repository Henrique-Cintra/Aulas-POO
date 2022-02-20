
package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;


public class TestaAluno {
    
    public static void main (String[] args) {
        
        Aluno obj1 = new Aluno();
        obj1.numeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do aluno"));
        obj1.nome = JOptionPane.showInputDialog("Informe o nome do aluno");
        obj1.idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do aluno"));
        obj1.p1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 1 do aluno"));
        obj1.p2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 2 do aluno"));
        
        obj1.passou();
        
    }
    
    
}
