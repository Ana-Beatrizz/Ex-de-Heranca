package exercicio03;

public class CamaroteInferior extends VIP{
	
	public String local;
        
    public String getLocal(){
        return local;
    }
    
    public void setLocal(String local){
        this.local = local;
    }
    
    public void imprimeLocal(){
        System.out.println("O local é no camarote inferior no valor de: " + adicional);
    }

}