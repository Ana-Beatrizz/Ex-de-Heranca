package exercicio04;
public class Usado extends Imovel{
    
    public double desconto;
    
    public double valor(){

        desconto = preco - (preco * 0.2);
        
        return desconto;
        
    }
    
}
