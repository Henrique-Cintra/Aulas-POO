
package br.edu.fatecfranca.ex3;

import javax.swing.JOptionPane;

public class TestaProduto {
    
    
    public static void main(String[] args) {
        
        // cria um objeto da classe Produto
        Produto obj1 = new Produto();
        
        obj1.id = Integer.parseInt(JOptionPane.showInputDialog("Informe o id do produto: "));
        obj1.descricao = JOptionPane.showInputDialog("Informe a descrição: ");
        obj1.qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade em estoque: "));
        obj1.preco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço: "));
   
        obj1.mostra();
        obj1.comprar();
        obj1.vender();
        obj1.subir();
        obj1.descer();
        obj1.mostra();
        
        
        Produto obj2 = new Produto(2, "Fruta qualquer", 10, 25 );
        
        obj2.mostra();
 
    }
    
}
