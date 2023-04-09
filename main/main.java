package main;

import java.util.ArrayList;

import Operacoes.OperacoesMatematicas;
import carro.Motor;
import carro.MotorStatus;
import carro.Painel;
import carro.Sensor;
import ordenation.Ordenador;

public class main {
	public static void main(String[] args) {
		Sensor sensor = new Sensor();
		Painel painel = new Painel(false);
		
		Motor[] motores = new Motor[10];
		int temperatura;
		ArrayList<MotorStatus> statusMotores = new ArrayList<MotorStatus>();
		/*
		 * Dentro do for no main é chamado o método gerarTemperatura() 10x (conforme solicitado
		 * no projeto descritivo). As temperaturas geradas aleatóriamente serão aplicadas na instân-
		 * ciação das classes motores, além da instanciação do RPM padrão de 2000 para todos os
		 * motores. Após isso será realizado o cálculo de desgaste do motor, através da chamadado 
		 * método calculoDesgasteMotor().
		 * 
		 * Posteriormente será realizada a chamada do metodo tratarTemperatura(), que recebe o
		 * motor e o painel como parâmetros e realiza suas operações conforme solicitado, retornan-
		 * do para a variável 'status' suas informações especificas sobre a temperatura do motor.
		 *  
		 * Essas informações serão adicionadas como parâmetros da classe MotorStatus, além da
		 * temperatura, pois será uma classe de armazenamento de informações. Essa classe será 
		 * adicionada dentro do ArrayList statusMotores.
		 */
		for(int i =0; i < 10; i++) {
			temperatura = OperacoesMatematicas.gerarTemperatura();
			
			motores[i] = new Motor(temperatura, 2000);
			OperacoesMatematicas.calculoDesgasteMotor(motores[i]);
			
			String status = (String) sensor.tratarTemperatura(motores[i], painel);
			statusMotores.add(new MotorStatus(temperatura, status));
		}

		/*
		 * Chamada do método ordenarMotoresPorTemperatura() para ordenar os motores em ordem
		 *crescente.
		 */
		Ordenador.ordenarMotoresPorTemperatura(statusMotores);
		System.out.println("Lista de Motores organizada confome a temperatura dos mesmos: \n");
		for (int i = 0; i < statusMotores.size(); i++) {
			System.out.println((1 + i) + ": " + statusMotores.get(i).getStatus());
			
		}
		
		/*
		 * Chamada do método compararTemperaturaMotores() para realizar a comparação entre 3 mo-
		 * tores aleatórios.
		 */
		System.out.println("Comparação dos motores: \n");
		System.out.println(OperacoesMatematicas.compararTemperaturaMotores(statusMotores));
		
		
	}
}
