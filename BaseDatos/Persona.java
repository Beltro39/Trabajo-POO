package BaseDatos;

public class Persona {
	private String nombre;
	private String cedula;
	private String telefono;
	Persona() {
		
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getCedula() {
		return this.cedula;
	}
	public String getTelefono() {
		return this.telefono;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCedula(String s) {
		this.cedula = s;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
