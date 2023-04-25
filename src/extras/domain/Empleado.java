package extras.domain;

public class Empleado {
	private String nombre;
	private int edad;
	private int salario;

	public Empleado(){

	}

	public Empleado(String nombre,int edad, int salario){
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public void calcular_aumento(){
		if (this.edad >= 30){
			System.out.println("El aumento que corresponde es del 10%");
			System.out.println("Salario actual" + this.salario);
			System.out.println("Salario con aumento del 10% :" + this.salario*1.10);
		}else if (this.edad < 30){
			System.out.println("El aumento que corresponde es del 5%");
			System.out.println("Salario actual" + this.salario);
			System.out.println("Salario con aumento del 5% :" + this.salario*1.05);
		}
	}
}
