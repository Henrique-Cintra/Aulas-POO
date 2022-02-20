package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class TestaCliente {

    public static void main(String[] args) {

        // cria um objeto da classe Cliente
        Cliente obj1 = new Cliente();

        obj1.numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta"));
        obj1.numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Informe o nome número da agencia"));
        obj1.nome = "Fulano";

      
        obj1.realizarDeposito();
        obj1.realizarSaque();
        obj1.mostrarConta();

        Cliente obj2 = new Cliente();

        obj2.numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta"));
        obj2.numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Informe o nome número da agencia"));
        obj2.nome = "Beltrano";
        
       
        obj2.realizarDeposito();
        obj2.realizarSaque();
        obj2.mostrarConta();

    }

}
