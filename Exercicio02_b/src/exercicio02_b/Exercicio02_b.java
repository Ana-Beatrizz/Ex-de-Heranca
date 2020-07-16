package exercicio02_b;

public class Exercicio02_b {

    public static void main(String[] args) {
        
        Rica r = new Rica();
        
        r.setNome("Rita");
        r.setIdade(49);
        r.setDinheiro(10500.00);
        
        System.out.println(r.toString());
        r.fazCompras();
        System.out.println("----------------------------------");
        
        
        Pobre p = new Pobre();
        
        p.setNome("Marcio");
        p.setIdade(38);
        
        System.out.println(p.toString());
        p.trabalha();
        System.out.println("----------------------------------");
        
        
        Miseravel m = new Miseravel();
        
        m.setNome("José");
        m.setIdade(64);
        
        System.out.println(m.toString());
        m.mendiga();
        System.out.println("----------------------------------");
        
    }
    
}
