package exercicio02;
public class Animal {
    
    private String nome;
    private  String raca;
    
    
    public void caminha(){
       System.out.println("O animal está caminhando");
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getRaca(){
        return raca;
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Dados do animal{" + "nome: " + nome + ", raça: " + raca + '}';
    }
    
    
    
}
