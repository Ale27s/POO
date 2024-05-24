package Examenparcial;

public abstract class Material {
	protected int codigo;
	protected String autor;
	protected String titulo;
	protected int anio;
	protected String estado;
	
	public Material(int codigo, String autor, String titulo, int anio, String estado) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.anio = anio;
		this.estado = estado;
	}
	
	public Material() {
		super();
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	} 
	
}
	