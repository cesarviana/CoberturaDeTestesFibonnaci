package model;

public class Matematica {

	public int fibonacci(int pos) {
		if (pos <= 0)
			throw new IllegalArgumentException(
					"A posição deve ser um número inteiro positivo maior que zero.");
		int n = 1, ant1 = 1, ant2 = 1;
		for (int i = 3; i <= pos; i++) {
			n = ant1 + ant2;
			ant1 = ant2;
			ant2 = n;
		}
		return n;
	}

}
