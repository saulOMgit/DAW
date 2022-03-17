package examen;

public class Caja  {
	private int tama�o;
	private int peso;
	private String nombre;

	public Caja(int tama�o, int peso, String nombre) {
		super();
		this.tama�o = tama�o;
		this.peso = peso;
		this.nombre = nombre;
	}
	public int getTama�o() {
		return tama�o;
	}
	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
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
		return "tama�o=" + tama�o + ", peso=" + peso + ", nombre=" + nombre;
	}
	
	
}