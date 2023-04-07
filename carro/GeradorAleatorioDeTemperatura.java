package carro;

import java.util.Random;

public class GeradorAleatorioDeTemperatura {
	
	
	/* Algoritmo feito para gerar números aleatórios entre
	 * 80 e 120, mas com uma probabilidade maior de 30%
	 * de ser gerado o número 90 através do if no qual gera
	 * um número Double que se for menor que 0,3 é retor-
	 * nado o número 90 no lugar do aleatório da variável
	 * número.
	 */
	public static Integer gerarTemperatura() {
		Random rand = new Random();
	    int numero = rand.nextInt(41) + 80;

	    if (rand.nextDouble() < 0.3) {
	      return numero = 90;
	    }
	    return numero;
	}
}
