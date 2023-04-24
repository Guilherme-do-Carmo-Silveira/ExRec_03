package view;

import controller.FatorialController;

public class Main {

	public static void main(String[] args) {
		
		FatorialController control = new FatorialController();
		
		int valor = (int) (Math.random() * 13) + 0;
		
		int resultado = control.Fatorial(valor);
		System.out.println("O fatorial de " + valor + " deu: " + resultado);
	}
}
