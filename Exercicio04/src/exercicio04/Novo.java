package exercicio04;
public class Novo extends Imovel{
    
    public double adicional;
    
    public double valor(){

        adicional = preco +(preco * 0.2);
        
        return adicional;
       
    }
 
}
