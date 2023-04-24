package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}

	public int Fatorial(int valor) {
		//Ponto de Parada
		if(valor <= 1) {
			return valor;
		}else {
			return valor * Fatorial(valor - 1);
		}
	}
}
