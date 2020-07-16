package exercicio03;

public class CamaroteSuperior extends VIP{

	public double adicionalSup;
	
	public double imprimeAd(){
            
            adicionalSup = valor + (valor * 0.3);
            return adicionalSup;
	}
}
