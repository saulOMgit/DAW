package examen;

public class Caja  {
	private int tamaño;
	private int peso;
	private String nombre;

	public Caja(int tamaño, int peso, String nombre) {
		super();
		this.tamaño = tamaño;
		this.peso = peso;
		this.nombre = nombre;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "tamaño=" + tamaño + ", peso=" + peso + ", nombre=" + nombre;
	}
	
	
}