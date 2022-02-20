
package br.edu.fatecfranca.ex4;

import br.edu.fatecfranca.ex3.Produto;
import javax.swing.JOptionPane;


public class TestaRio {
    
   public static void main(String[] args) {
       // CRIA um objeto da classe Rio
       
       Rio obj1 = new Rio();
       
       obj1.nome = JOptionPane.showInputDialog("Informe o nome do Rio: ");
       obj1.nivel = Float.parseFloat(JOptionPane.showInputDialog("Digite o nível do Rio: "));

       
       obj1.chover();
       obj1.ensolarar();
       obj1.limpar();
       obj1.sujar();
       obj1.mostra();
       
        Rio obj2 = new Rio("Paraná", 100, true );
        
        obj2.mostra();
   }
    
}
