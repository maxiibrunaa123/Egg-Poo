package extras.domain;

import java.util.Scanner;

public class Puntos {
	private int x1;
	private int y1;
	private int x2;
	private int y2;

	public Puntos() {
	}

	public Puntos(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public void calcularDistancia() {
		System.out.println("La distancia es: " + Math.sqrt(Math.pow(this.x2 - this.x1, 2) +
				Math.pow(this.y2 - this.y1, 2)));
	}

	public void coordenadas(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el valor de x1");
		this.x1 = scanner.nextInt();
		System.out.println("Ingrese el valor de x2");
		this.x2 = scanner.nextInt();
		System.out.println("Ingrese el valor de y1");
		this.y1 = scanner.nextInt();
		System.out.println("Ingrese el valor de y2");
		this.y2 = scanner.nextInt();
	}
}
