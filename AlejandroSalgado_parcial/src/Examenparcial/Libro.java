package Examenparcial;

public class Libro extends Material {
	
private String editorial;
public Libro(int codigo, String autor, String titulo, int anio, String estado, String editorial) {
super(codigo, autor, titulo, anio,estado);
this.editorial = editorial;
}

public String getEditorial() {
	return editorial;
	}

public void setEditorial (String editorial) {
	this.editorial = editorial;
	}

@Override
public String toString() {
	return "Libro [editorial=" + editorial + ", codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo
			+ ", anio=" + anio + ", estado=" + estado + "]";
}

}
