package domain;

import java.util.Scanner;

public class Rectangulo {
	private int largo;
	private int alto;

	public Rectangulo() {
	}

	public Rectangulo(int largo, int alto) {
		this.largo = largo;
		this.alto = alto;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public void crarRectangulo(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese largo:");
		this.largo = scanner.nextInt();
		System.out.println("Ingrese alto");
		this.alto = scanner.nextInt();
	}

	public void calcularSuperficie(){
		System.out.println("La superficie es : " + this.largo * this.alto);
	}

	public void calcularPerimetro(){
		System.out.println("El perimetro es : " + (this.largo * this.alto)*2);
	}

	public static void dibujarRectangulo(int base, int altura) {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
