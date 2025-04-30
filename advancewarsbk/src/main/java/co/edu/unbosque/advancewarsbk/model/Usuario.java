package co.edu.unbosque.advancewarsbk.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Integer id;
	private String usuario;
	private String contraseña;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(String usuario, String contraseña) {
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", usuario=" + usuario + ", contraseña=" + contraseña + "]";
	}
	
}
