package exJUNIT;

public class Empleado{
	 
    //Constantes
	//Salario por defecto
    public final static double SALARIO_DEF=600;
    //Salario maximo
    public final static double SALARIO_MAX=2000;

    private String nombre;    
    private int edad;
    private String provincia;   
    private double salario;
 
    
    public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
    public Empleado(String nombre, int edad,String provincia, double salario){
        this.nombre=nombre;
        this.edad=edad;
        this.provincia=provincia;
        this.salario=salario;
        if (salario > SALARIO_MAX) {
        	//He añadido "this."
        	this.salario=SALARIO_MAX;
        }
    }
    
    public Empleado(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
        this.salario=SALARIO_DEF;       
    }

    /**
     * Suma un plus si el empleado tiene mas de 40 años o vive en MAdrid o Barcelona, si se cumplen las dos cosas
     * se le aumento plus y medio
     * @param sueldoPlus
     * @return sueldo despues de añadir el plus
     */
    public double calcularSalarioPlus (double sueldoPlus){
    	boolean aumento1=false;
        boolean aumento2=false;
        if (this.provincia.equals("Madrid") || this.provincia.equals("Barcelona")) {
        	salario+=sueldoPlus;
        	aumento1=true;
        }
        if (edad>40){
        			salario+=sueldoPlus;
        			aumento2=true;
        }
                      
        if (aumento1 && aumento2) {
        	salario-=sueldoPlus/2;
        }
        
        if(salario>SALARIO_MAX)
        {
        	salario = SALARIO_MAX;
        }
        return salario;
    }
 
    
    public boolean tienePlus (){
    	boolean aumento=false;

        if (this.provincia.equals("Madrid") || this.provincia.equals("Barcelona")) {        	
        	aumento=true;
        }
        if (edad>40){
        	aumento=true;
        }       
        return aumento;
    }
   

}