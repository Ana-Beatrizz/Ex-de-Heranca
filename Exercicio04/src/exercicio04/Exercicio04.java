package exercicio04;

import javax.swing.JOptionPane;

public class Exercicio04 {

    public static void main(String[] args) {

        Imovel imovel = new Imovel();

        imovel.setEndereco(" R. Santo Antonio, 50 - Centro, São Caetano do Sul");
    
        imovel.setEscolha(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 para imóvel novo e 2 para imóvel usado: ")));
        
        if (imovel.escolha == 1){
            
            Novo inovo = new Novo();
            System.out.println(imovel.toString());
            System.out.println("Valor do imóvel novo: " + inovo.adicional);
            
        }
        if (imovel.escolha == 2){
            
            Usado iusado = new Usado();
            System.out.println(imovel.toString());
            System.out.println("Valor do imóvel usado: " + iusado.desconto);
        }
       
    }
    
}
