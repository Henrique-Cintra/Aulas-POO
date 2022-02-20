
package br.edu.fatecfranca.ex3;

import javax.swing.JOptionPane;

public class Produto {
    
    // Declaração de variáveis
    int id;
    String descricao;
    int qtde;
    float preco;
    
 
    // métodos construtores
    Produto() {

    }

    Produto(int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    //métodos sem parametros
    
    void comprar(){
        float produtoA = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade comprada: "));
        qtde += produtoA;
    }
    
    
    void vender(){
        float produtoB = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade vendida: "));
        qtde -= produtoB;
}
    
    void subir(){
        float produtoC = Float.parseFloat(JOptionPane.showInputDialog("Informe o acréscimo do valor : "));
        preco += produtoC;
}
    
    void descer(){
        float produtoD = Float.parseFloat(JOptionPane.showInputDialog("Informe o decréscimo no valor : "));
        preco -= produtoD;
}
    
    void mostra(){
    JOptionPane.showMessageDialog(null, " Id do produto: " + this.id
    + ". Descrição: " + this.descricao + ". Quantidade do produto em estoque:  " + this.qtde + ". Preço R$: " + this.preco );
    }
    
     
    
}
