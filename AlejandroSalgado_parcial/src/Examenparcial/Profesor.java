package Examenparcial;

public class Profesor extends Persona{
private String especialidad;

public Profesor(int cedula, String nombreApellido, String correo, String telefono, String especialidad) {
	super(cedula, nombreApellido,correo, telefono);
	this.especialidad = especialidad;
}

public String getEspecialidad() { 
	return especialidad;
	}

public void setEspecialidad(String especialidad) {
	this. especialidad = especialidad;
	}

@Override
public String toString() {
	return "Profesor [especialidad=" + especialidad + ", cedula=" + cedula + ", nombreApellido=" + nombreApellido
			+ ", correo=" + correo + ", telefono=" + telefono + "]";
}

}
