package exercicio04;
public class Imovel {
    
    public String endereco;
    public double preco = 100000;
    public int escolha;
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public int getEscoha(){
        return escolha;
    }
    
    public void setEscolha(int escolha){
        this.escolha = escolha;
    }

    @Override
    public String toString() {
        return "Imovel " + "Endereco: " + endereco + ", Preco sem mudança: " + preco;
    }

    
    
    
    
}
