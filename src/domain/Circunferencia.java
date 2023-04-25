package domain;

public class Circunferencia {
	private double radio;

	public Circunferencia(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public void area(){
		System.out.println("El area es: " + Math.PI * Math.pow(this.radio, 2));
	}

	public void perimetro(){
		System.out.println("El perimetro es: " + 2 * Math.PI * this.radio);
	}
}
