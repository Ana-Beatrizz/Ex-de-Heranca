package exercicio03;

import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main(String[] args) {
       
     Ingresso ingresso = new Ingresso();
     
     
    ingresso.setEscolha(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 para normal e 2 para VIP: ")));  
    
    if(ingresso.escolha == 1){
        
        Normal norm = new Normal();
        norm.Imprime();
    }
    
    if (ingresso.escolha == 2){
        
        VIP vip = new VIP();
        
        vip.setEscolher(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 para Camarote Superior e 2 para Camarote Inferior: ")));
        
        if (vip.escolher == 1){
            
            CamaroteSuperior sup = new CamaroteSuperior();
            sup.imprimeAd();
            System.out.println("Valor do ingresso: "+ sup.adicionalSup);
        }
        
        if (vip.escolher == 2){
            
            CamaroteInferior inf = new CamaroteInferior();
            inf.imprimeLocal();
            
        }
        
    }
    
    
    }
    
}
