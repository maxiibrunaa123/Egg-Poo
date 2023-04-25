package domain;

import java.util.Scanner;

public class Operacion {
	int numero1;
	int numero2;

	public Operacion(){}

	public Operacion(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public void crearOperacion(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese valor de del primer numero");
		this.numero1 = scanner.nextInt();
		System.out.println("Ingrese el valor del segundo numero");
		this.numero2 = scanner.nextInt();
	}

	public int sumar(){
		return this.numero1 + this.numero2;
	}
	public int restar(){
		return this.numero1 - this.numero2;
	}
	public int multiplicar(){
		if(this.numero1 != 0 && this.numero2 != 0){
			return this.numero1 * this.numero2;
		}else {
			System.out.println("Error, multiplicacion por 0");
			return 0;
		}
	}

	public double dividir(){
		if(this.numero1 != 0 || this.numero2 !=0){
			return this.numero1 / this.numero2;
		}else {
			System.out.println("Error, division por 0");
			return 0;
		}
	}
}
