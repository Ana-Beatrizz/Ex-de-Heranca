package exercicio01;
public class Exercicio01 {

    public static void main(String[] args) {
        
       Funcionario comum = new Funcionario();    
       comum.setNome("Pedro");
       comum.setMatricula(567789);
       
       System.out.println(comum.toString());
       System.out.println("---------------------------------------------");
       
       Assistente a = new Assistente();    
       a.setNome("Maria");
       a.setMatricula(134753);
       
       System.out.println(a.toString());
       System.out.println("---------------------------------------------");
  
       Administrativo d = new Administrativo();    
       d.setNome("Rosa");
       d.setMatricula(567674);
       d.setTurno("Noturno");
       
       System.out.println(d.toString());
       System.out.println("---------------------------------------------");
       
       Tecnico t = new Tecnico();    
       t.setNome("João");
       t.setMatricula(567354);
       
       System.out.println(t.toString());
       System.out.println("---------------------------------------------");
          
    }
    
}
