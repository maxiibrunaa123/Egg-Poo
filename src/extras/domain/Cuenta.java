package extras.domain;

import java.util.Scanner;

public class Cuenta {
	private String titular;
	private long saldo;

	public Cuenta() {
	}

	public Cuenta(String titular, long saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public void retirar_dinero(){
		Scanner scanner = new Scanner(System.in);
		int retira = scanner.nextInt();
		if (this.saldo > retira) {
			System.out.println("Ralizando extraccion");
		}else{
			System.out.println("Saldo insuficiente");
			System.out.println("Saldo actual : " + this.saldo);
		}
	}


}
