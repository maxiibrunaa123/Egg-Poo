package extras.domain;

public class Rectangulo {

	private int lado1;
	private int lado2;

	public Rectangulo() {
	}

	public Rectangulo(int lado1, int lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public void calcular_area(){
		System.out.println("El area es : " + this.lado1 * this.lado2);
	}
}
