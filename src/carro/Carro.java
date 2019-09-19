package carro;

import veiculo.VeiculoModel;

public class Carro extends VeiculoModel{
	VeiculoModel carro = new VeiculoModel();
	
	public Carro() {
		
		carro.setPlaca("xxx-777");
		carro.setPorta(4);
		carro.setCor("preto");
		carro.setAnoFabricacao(2019);
		 
	}
	public void Placa() {
		
		System.out.println(carro.getPlaca());
	}
	public void AnoFabricacao() {
		
		System.out.println(carro.getAnoFabricacao() + 2);
	}
}
