package main;

import java.util.ArrayList;
import java.util.Random;

import carro.Motor;
import carro.MotorStatus;
import carro.Painel;
import carro.Sensor;

public class main {
	public static void main(String[] args) {
		Sensor sensor = new Sensor();
		Painel painel = new Painel(false);
		Random random = new Random();
		
		int[] list = new int[10];
		Motor[] motores = new Motor[10];
		ArrayList<MotorStatus> statusMotores = new ArrayList<MotorStatus>();
		for(int i =0; i < 10; i++) {
			list[i] = random.nextInt(41) + 80;
			motores[i] = new Motor(list[i], 2000);
			String status = (String) sensor.tratarTemperatura(motores[i], painel);
			statusMotores.add(new MotorStatus(list[i], status));
		}

		MotorStatus.ordenarMotoresPorTemperatura(statusMotores);
				
		int id = 1;
		for (int i = 0; i < statusMotores.size(); i++) {
		   System.out.println((id + i) + ": " + statusMotores.get(i).getStatus());
		}
		
		

	}
}
