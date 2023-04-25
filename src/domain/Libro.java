package domain;

import java.util.Scanner;

public class Libro {
	String isnb;
	String titulo;
	String autor;
	int npaginas;

	public Libro(){}

	public Libro(String isnb, String titulo, String autor, int npaginas) {
		this.isnb = isnb;
		this.titulo = titulo;
		this.autor = autor;
		this.npaginas = npaginas;
	}

	@Override
	public String toString() {
		return "Libro{" +
				"isnb=" + isnb +
				", titulo='" + titulo + '\'' +
				", autor='" + autor + '\'' +
				", npaginas=" + npaginas +
				'}';
	}

	public void cargarLibro(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese insb:");
		this.isnb = scanner.nextLine();
		System.out.println("Ingrese titulo:");
		this.titulo = scanner.nextLine();
		System.out.println("Ingrese autor:");
		this.autor = scanner.nextLine();
		System.out.println("Ingrese numero de paginas: ");
		this.npaginas = scanner.nextInt();
	}
}
