
package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class Cliente {
    // declaração das variáveis
    int numeroConta;
    int numeroAgencia;
    String nome;
    float saldo;
    
    
    // métodos construtores
    Cliente() {

    }

    Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
        
    }
    
    
     // métodos
    
    void realizarDeposito(){
        float deposito = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade do depósito: "));
        
        saldo += deposito;
                
    }
    
    void realizarSaque(){
        float saque = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade do saque: "));
        
        saldo -= saque;
    }
    
    void mostrarConta() {
        JOptionPane.showMessageDialog(null, " Número da conta: " + this.numeroConta
                + ". Nome da pessoa: " + this.nome + ". Saldo da conta R$:  " + this.saldo );
    }
    
    
    
}
