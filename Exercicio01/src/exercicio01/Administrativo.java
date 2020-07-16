package exercicio01;

public class Administrativo extends Funcionario{
    public String Turno;

    
    public String getTurno(){
        return Turno;
    }
    
    public void setTurno(String Turno){
        this.Turno = Turno;
    }
    
    public void Salario(double Salario){
       Salario = 800;
       
       if (Turno == "Noturno"){
           System.out.println("Aumento de 20% no salário");
           Salario = 800 + 0.2;
       } 
       else{
           System.out.println("Sem aumento no salário");
       }  
}

    @Override
    public String toString() {
        return "Assistente administrativo: {" + "nome: " + nome + ", matricula: " + matricula + " Turno: "+ Turno +'}';
    }
    
    
}
