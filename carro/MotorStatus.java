package carro;

import java.util.ArrayList;

public class MotorStatus {

	private int temperatura;
	private String status;
	
	public MotorStatus() {
		
	}
	
	public MotorStatus(int temperatura, String status) {
		super();
		this.temperatura = temperatura;
		this.status = status;
	}
	
	
	/*O método "ordenarMotoresPorTemperatura irá percorrer todo o ArrayList de "statusMotores" verificando através
		da temperatura se todos os dados do array estão ordenandos de forma crescente pela mesma temperatura. Se
		isso não estiver ocorrendo, o if do for interno será requisitados para dar início as mudanças necessárias, após 
		isso o if do for externo irá realizar a alteração de ordem no array com base no requisito atendido no if anterior, 
		sendo assim o for percorrerá todo o array até tudo estiver ordenado da maneira correta, conforme foi solicitado*/
	public static void ordenarMotoresPorTemperatura(ArrayList<MotorStatus> statusMotores) {
	    int n = statusMotores.size();
	    for (int i = 0; i < n - 1; i++) {
	        int minIndex = i;
	        for (int j = i + 1; j < n; j++) {
	            if (statusMotores.get(j).getTemperatura() < statusMotores.get(minIndex).getTemperatura()) {
	                minIndex = j;
	            }
	        }
	        if (minIndex != i) {
	            MotorStatus temp = statusMotores.get(i);
	            statusMotores.set(i, statusMotores.get(minIndex));
	            statusMotores.set(minIndex, temp);
	        }
	    }
	}

	
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}