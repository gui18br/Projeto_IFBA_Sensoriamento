package carro;

public class Modulo{
	
	
	public Object tratarTemperaturaAlta(Motor motor, Painel painel) {
		
		if (motor.getTemperatura() >= 110) {
			motor.ventoinhaLigada();
			painel.acenderluz();
			return "Temperatura do motor: " + motor.getTemperatura() + "\n" + 
			"Ventoinha:  " + motor.ventoinhaLigada() + "\n" +
			"Luz do Painel: " + painel.isLuzAlertaTemp() + "\n"; 
		} else  if (motor.getTemperatura() > 90) {
			return "Temperatura do motor: " + motor.getTemperatura() + "\n" + 
					"Ventoinha:  " + motor.ventoinhaLigada() + "\n" +
					"Luz do Painel: " + painel.isLuzAlertaTemp() + "\n"; 
		}
		return "" ;
	}
	
	public Object tratarTemperaturaBaixa(Motor motor, Painel painel) {
		
		return "Temperatura do motor: " + motor.getTemperatura()+ "\n"
		+ "Giro RPM: " + motor.aumentoDoRPM() + " " +"\n";

	}

	public Object tratarTemperaturaNormal(Motor motor, Painel painel) {
		return  "Temperatura do motor: " + motor.getTemperatura() + "\n";
	}

}