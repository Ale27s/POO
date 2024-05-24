package Examenparcial;

public class Biblioteca {
	String nombre, horario;
	int numero_prestamos = 0;
	Material[] material = new Material[10] ;
	Persona[] persona = new Persona[10];
	Prestamo [] prestamo = new Prestamo[10];
	
	public Biblioteca() {
		nombre ="Super Biblioteca";
		horario = "LUNES A VIERNES DE 8 a 15";
		material[0] = new Libro(123,"julio verne", "Viaje al Interior de la Tierra",1970,"disponible","96325");
		persona[0] = new Alumno(462,"Alejandro","alejandro@snpp.edu.py","0961",1000);
		
		prestarMaterial (material[0], persona[0]);
		verMaterialesPrestados();
	}
	private void verMaterialesPrestados() {
		System.out.println(prestamo[0].toString());
	}
	private void prestarMaterial(Material m, Persona p) {
		prestamo[numero_prestamos] = new Prestamo (m,p,"24/05/24","");
		numero_prestamos++;
	}
	public static void main(String[] args) {
		new Biblioteca();

	}

}