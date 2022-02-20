package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class Aluno {

    // declaração das variáveis
    int numeroAluno;
    String nome;
    int idade;
    float p1;
    float p2;

    // métodos construtores
    Aluno() {

    }

    Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    // métodos
    float notaFinal() {
        return (p1 + p2) / 2;
    }

    void dadosAluno() {
        JOptionPane.showMessageDialog(null, "numero do Aluno: " + this.numeroAluno
                + " Nome: " + this.nome + " idade: " + this.idade);
    }

    void passou() {
        if (notaFinal() > 6) {
            JOptionPane.showMessageDialog(null, "O aluno passou!");
        } else {
            JOptionPane.showMessageDialog(null, "O aluno reprovou!");
        }
    }

}
