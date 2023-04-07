package main;

import java.util.ArrayList;

import carro.GeradorAleatorioDeTemperatura;
import carro.Motor;
import carro.MotorStatus;
import carro.Painel;
import carro.Sensor;

public class main {
	public static void main(String[] args) {
		Sensor sensor = new Sensor();
		Painel painel = new Painel(false);
		GeradorAleatorioDeTemperatura aleatorio = new GeradorAleatorioDeTemperatura();
		
		int[] list = new int[10];
		Motor[] motores = new Motor[10];
		int temperatura;
		ArrayList<MotorStatus> statusMotores = new ArrayList<MotorStatus>();
		for(int i =0; i < 10; i++) {
			temperatura = (int) aleatorio.gerarTemperatura();
			motores[i] = new Motor(temperatura, 2000);
			String status = (String) sensor.tratarTemperatura(motores[i], painel);
			statusMotores.add(new MotorStatus(temperatura, status));
		}

		MotorStatus.ordenarMotoresPorTemperatura(statusMotores);
				
		int id = 1;
		for (int i = 0; i < statusMotores.size(); i++) {
		   System.out.println((id + i) + ": " + statusMotores.get(i).getStatus());
		}
		
		

	}
}
