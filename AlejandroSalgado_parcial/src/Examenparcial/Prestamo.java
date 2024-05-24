package Examenparcial;

public class Prestamo {
private Material material;
private Persona prestamo;
private String fechaSalida;
private String fechaRegreso;

public Prestamo(Material material, Persona prestamo, String fechaSalida, String fechaRegreso) {
this.material = material;
this.prestamo = prestamo;
this.fechaSalida = fechaSalida;
this.fechaRegreso = fechaRegreso;
}

public Material getMaterial() {
	return material;
	}

public void setMaterial(Material material) {
	this.material = material;
	} 

public Persona getPrestamo() {
	return prestamo;
	}

public void setPrestatario (Persona prestamo) { 
	this.prestamo = prestamo; 
	}

public String getFechaSalida() {
	return fechaSalida;
	}

public void setFechaSalida (String fechaSalida) { 
	this.fechaSalida = fechaSalida;
	}

public String getFechaRegreso() {
	return fechaRegreso;
    }
public void setFechaRegreso(String fechaRegreso) {
	this.fechaRegreso = fechaRegreso;
	}

@Override
public String toString() {
	return "Prestamo [material=" + material + ", prestamo=" + prestamo + ", fechaSalida=" + fechaSalida
			+ ", fechaRegreso=" + fechaRegreso + "]";
	}

	
}
