package Composicao.UmParaUm;

public class Carro {
	
	Motor motor = new Motor();
	
	void acelerar() {
		
		motor.fatorInjecao += 0.4;
	}
	
	void frear() {
		
		motor.fatorInjecao -= 0.7;
	}
	
	void ligar() {
		
		motor.ligado = true;
	}
	
	void desligar() {
		
		motor.ligado = false;
	}
	
	boolean estarLigado() {
		
		return motor.ligado;
	}

}
