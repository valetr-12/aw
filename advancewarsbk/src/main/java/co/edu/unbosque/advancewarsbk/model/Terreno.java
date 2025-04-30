package co.edu.unbosque.advancewarsbk.model;

public class Terreno {

	private String imagen;
	private String nombre;
	private float boniDefensa;
	
	public Terreno() {
		// TODO Auto-generated constructor stub
	}

	public Terreno(String imagen, String nombre, float boniDefensa) {
		super();
		this.imagen = imagen;
		this.nombre = nombre;
		this.boniDefensa = boniDefensa;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getBoniDefensa() {
		return boniDefensa;
	}

	public void setBoniDefensa(float boniDefensa) {
		this.boniDefensa = boniDefensa;
	}

	@Override
	public String toString() {
		return "Terreno [imagen=" + imagen + ", nombre=" + nombre + ", boniDefensa=" + boniDefensa + "]";
	}
	
}
