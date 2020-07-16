package exercicio02_b;
public class Rica extends Pessoa{
    
    public double dinheiro;
    
    public double getDinheiro(){
        return dinheiro;
    }
    
    public void setDinheiro(double dinheiro){
        this.dinheiro = dinheiro;
    }
    
    public void fazCompras(){
        System.out.println("Esta pessoa está fazendo compras");
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "nome: " + nome + ", idade: " + idade + " Dinheiro:" + dinheiro +'}';
    }
    
}
