package carro;

public class Sensor{
	Modulo modulo = new Modulo();
	
	
	public Object tratarTemperatura(Motor motor, Painel painel) {
		
		if(motor.getTemperatura() > 90) {
			return modulo.tratarTemperaturaAlta(motor, painel);
		}else if(motor.getTemperatura() < 90) {
			return modulo.tratarTemperaturaBaixa(motor, painel);
		}else if(motor.getTemperatura() == 90) {
			return modulo.tratarTemperaturaNormal(motor, painel);
		}
		
		return "";
	}

}