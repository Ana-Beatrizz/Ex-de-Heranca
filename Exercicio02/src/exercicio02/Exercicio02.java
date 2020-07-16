package exercicio02;
public class Exercicio02 {

    public static void main(String[] args) {
        
        Cachorro c1 = new Cachorro();
        
        c1.setNome("Apolo");
        c1.setRaca("Pug");
        System.out.println(c1.toString());
        c1.late();
        c1.caminha();
        
         System.out.println("----------------------------------------------");
        
        Gato g1 = new Gato();
        
        g1.setNome("Luna");
        g1.setRaca("Ragdoll");
        System.out.println(g1.toString());
        g1.mia();
        g1.caminha();
        
    }
    
}
