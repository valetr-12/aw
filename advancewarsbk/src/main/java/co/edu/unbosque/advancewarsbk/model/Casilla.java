package co.edu.unbosque.advancewarsbk.model;

public class Casilla {
	
	private Unidad unidad;
	private Terreno terreno;
	private Propiedad propiedad;
	
	public Casilla() {
		// TODO Auto-generated constructor stub
	}

	public Casilla(Unidad unidad, Terreno terreno, Propiedad propiedad) {
		super();
		this.unidad = unidad;
		this.terreno = terreno;
		this.propiedad = propiedad;
	}

	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	public Terreno getTerreno() {
		return terreno;
	}

	public void setTerreno(Terreno terreno) {
		this.terreno = terreno;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}

	@Override
	public String toString() {
		return "Casilla [unidad=" + unidad + ", terreno=" + terreno + ", propiedad=" + propiedad + "]";
	}
}
