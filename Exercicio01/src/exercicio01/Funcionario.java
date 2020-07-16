package exercicio01;

public class Funcionario {
    
    public String nome;
    public int matricula;
    
    
     public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
         
    public float calculaSalario(float salario){
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario: {" + "nome: " + nome + ", matricula: " + matricula + '}';
    }
    
    
    
}
