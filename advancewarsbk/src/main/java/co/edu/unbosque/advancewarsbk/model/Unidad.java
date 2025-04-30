package co.edu.unbosque.advancewarsbk.model;

import jakarta.persistence.Entity;

@Entity
public class Unidad {
	
	private String nombre;
	private String tipoUnidad;
	private String hp;
	private String tipoMov;
	private int rangoAtaque;
	private boolean transportar;
	private float dano;
	private int costo;
	private String imagen;
	
	public Unidad() {
		// TODO Auto-generated constructor stub
	}

	public Unidad(String nombre, String tipoUnidad, String hp, String tipoMov, int rangoAtaque, boolean transportar,
			float dano, int costo, String imagen) {
		super();
		this.nombre = nombre;
		this.tipoUnidad = tipoUnidad;
		this.hp = hp;
		this.tipoMov = tipoMov;
		this.rangoAtaque = rangoAtaque;
		this.transportar = transportar;
		this.dano = dano;
		this.costo = costo;
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoUnidad() {
		return tipoUnidad;
	}

	public void setTipoUnidad(String tipoUnidad) {
		this.tipoUnidad = tipoUnidad;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getTipoMov() {
		return tipoMov;
	}

	public void setTipoMov(String tipoMov) {
		this.tipoMov = tipoMov;
	}

	public int getRangoAtaque() {
		return rangoAtaque;
	}

	public void setRangoAtaque(int rangoAtaque) {
		this.rangoAtaque = rangoAtaque;
	}

	public boolean isTransportar() {
		return transportar;
	}

	public void setTransportar(boolean transportar) {
		this.transportar = transportar;
	}

	public float getDano() {
		return dano;
	}

	public void setDano(float dano) {
		this.dano = dano;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Unidad [nombre=" + nombre + ", tipoUnidad=" + tipoUnidad + ", hp=" + hp + ", tipoMov="
				+ tipoMov + ", rangoAtaque=" + rangoAtaque + ", transportar=" + transportar + ", dano=" + dano
				+ ", costo=" + costo + ", imagen=" + imagen + "]";
	}
}
