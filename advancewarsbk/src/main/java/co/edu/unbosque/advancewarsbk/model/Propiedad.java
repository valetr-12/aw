package co.edu.unbosque.advancewarsbk.model;

public class Propiedad {
	
	private int valor;
	private String tipo;
	private String imagen;
	
	public Propiedad() {
		// TODO Auto-generated constructor stub
	}

	public Propiedad(int valor, String tipo, String imagen) {
		super();
		this.valor = valor;
		this.tipo = tipo;
		this.imagen = imagen;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Propiedad [valor=" + valor + ", tipo=" + tipo + ", imagen=" + imagen + "]";
	}
}
