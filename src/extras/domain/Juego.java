package extras.domain;

import java.util.Scanner;

public class Juego {
	private int numero;



	public Juego() {
	}

	public void iniciar_juego() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero a adivinar");
		this.numero = scanner.nextInt();
		int contador = 0;
		System.out.println("Tienes 5 intentos: ADELANTE!");
		do{

			int num = scanner.nextInt();

			contador++;
			if(num == this.numero){
				break;
			} if(this.numero < num) {
				System.out.println("El numero a adivinar es menor");
			}else {
				System.out.println("El numero a adivinar es menor");
			}
		}while(contador<5);

	}
}
