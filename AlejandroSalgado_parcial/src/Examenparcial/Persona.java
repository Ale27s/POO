package Examenparcial;

public abstract class Persona {
protected int cedula;
protected String nombreApellido;
protected String correo;
protected String telefono;

public Persona(int cedula, String nombreApellido, String correo, String telefono) {
this.cedula = cedula;
this.nombreApellido = nombreApellido;
this.correo = correo;
this.telefono = telefono;
}

public int getCedula() {
	return cedula;
	}

public void setCedula(int cedula) {
	this.cedula = cedula;
	}

public String getNombreApellido() {
	return nombreApellido;
	}

public void setNombreApellido(String nombreApellido){
	this.nombreApellido = nombreApellido;
	}

public String getCorreo () {
	return correo;
	}

public void setCorreo(String correo) {
	this.correo = correo;
	}

public String getTelefono() { 
	return telefono;
	}

public void setTelefono(String telefono) { 
	this.telefono = telefono;
	}

@Override
public String toString() {
	return "Persona [cedula=" + cedula + ", nombreApellido=" + nombreApellido + ", correo=" + correo + ", telefono="
			+ telefono + "]";
}

}
