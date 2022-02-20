package br.edu.fatecfranca.ex4;

import javax.swing.JOptionPane;

public class Rio {

    //Declaração de variáveis
    String nome;
    float nivel;
    boolean poluido;

    // métodos construtores
    Rio() {

    }

    Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;

    }

    Rio(int i, String fruta_qualquer, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // métodos sem parametros
    void chover() {
        float nivelA = Float.parseFloat(JOptionPane.showInputDialog("Quanto foi o acréscimo no Rio? "));
        nivel += nivelA;
    }

    void ensolarar() {
        float nivelB = Float.parseFloat(JOptionPane.showInputDialog("Quanto foi o decréscimo no Rio? "));
        nivel -= nivelB;
    }

    void limpar() {
        int resp = JOptionPane.showConfirmDialog(null, "Limpar o Rio?");
        if (resp != JOptionPane.OK_OPTION) {
            poluido = true;
        } else {
            poluido = false;
        }
    }

    void sujar() {
        int resp = JOptionPane.showConfirmDialog(null, "Sujar o Rio?");
        if (resp != JOptionPane.OK_OPTION) {
            poluido = false;
        } else {
            poluido = true;
        }
    }

    void mostra() {
        JOptionPane.showMessageDialog(null, "Nome do Rio: " + this.nome + ". Nível do Rio:  "
                + this.nivel + ". O rio esta poluído? " + this.poluido);
    }
}
