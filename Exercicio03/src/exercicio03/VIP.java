
package exercicio03;

public class VIP extends Ingresso{

	public double adicional;
        public int escolher;
	
	public double calcValor(){
            adicional = valor + (valor * 0.1);
            return adicional;
	}
        
        public int getEscoher(){
        return escolher;
    }
    
    public void setEscolher(int escolher){
        this.escolher = escolher;
    }
}