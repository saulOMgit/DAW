package exJUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEmpleado {
	//Voy a Crear un constructor fuera con el que pueda realizar las pruebas y no repetir codigo
	Empleado E1= new Empleado("Jose Luis", 45,"Madrid", 1500);
	
	@Test
	void testGetNombre() {
		assertEquals("Jose Luis",E1.getNombre());
		
	}

	@Test
	void testSetNombre() {
		E1.setNombre("Carlos");
		assertEquals("Carlos",E1.getNombre());
	}

	@Test
	void testGetEdad() {
		assertEquals(45,E1.getEdad());
	}

	@Test
	void testSetEdad() {
		E1.setEdad(25);
		assertEquals(25,E1.getEdad());
	}

	@Test
	void testGetProvincia() {
		assertEquals("Madrid",E1.getProvincia());
	}

	@Test
	void testSetProvincia() {
		E1.setProvincia("Asturias");
		assertEquals("Asturias",E1.getProvincia());
	}

	@Test
	void testGetSalario() {
		assertEquals(1500,E1.getSalario());
	}

	@Test
	void testSetSalario() {
		E1.setSalario(1000);
		assertEquals(1000,E1.getSalario());
	}

	@Test
	void testEmpleadoStringIntStringDouble() {
		Empleado E2= new Empleado("Cristina",35,"Barcelona",1200);
		assertEquals("Cristina",E2.getNombre());
		assertEquals(35,E2.getEdad());
		assertEquals("Barcelona",E2.getProvincia());
		assertEquals(1200,E2.getSalario());
	}
	
	@Test
	void testEmpleadoStringIntStringDouble_SalarioSuperior() {
		Empleado E3= new Empleado("Marta",51,"Valencia",2200);
		assertEquals("Marta",E3.getNombre());
		assertEquals(51,E3.getEdad());
		assertEquals("Valencia",E3.getProvincia());
		//Mirando el codigo sabemos  que el salario no puede rebasar el maximo
		//el cual esta establecido en 2000
		assertEquals(2000,E3.getSalario()); //A REVISAR
	}
	@Test
	void testEmpleadoStringInt() {
		Empleado E4= new Empleado("Pepe",30);
		assertEquals("Pepe",E4.getNombre());
		assertEquals(30,E4.getEdad());
		//Mirando el codigo sabemos que el salario por defecto
		//De este constructor es 600
		assertEquals(600,E4.getSalario());
	}

	@Test
	void testCalcularSalarioPlus() {
		E1.setSalario(2200);
		//E1 cumple las dos condiciones
		//con su sueldo base de 2200 y el bonus y medio
		//deberia dar 2000 ya que rebasa el max
		assertEquals(2000,E1.calcularSalarioPlus(100));
	}
	
	@Test
	void testCalcularSalarioPlus2() {
		Empleado E2= new Empleado("Cristina",35,"Barcelona",1200);
		//E2 cumple 1 condiciones
		//con su sueldo base de 1200 y el bonus
		//deberia dar 1350
		assertEquals(1300,E2.calcularSalarioPlus(100));
	}
	
	@Test
	void testCalcularSalarioPlus3() {
		Empleado E2= new Empleado("Igor",35,"Asturias",1000);
		//E2 cumple 0 condiciones
		//con su sueldo base de 1000
		//deberia dar 1000
		assertEquals(1000,E2.calcularSalarioPlus(100));
	}
	@Test
	void testTienePlus() {		
		assertEquals(true,E1.tienePlus());
	}
	
	@Test
	void testTienePlus2() {
		Empleado E2= new Empleado("Cristina",35,"Barcelona",1200);
		assertEquals(true,E2.tienePlus());
	}
	
	@Test
	void testTienePlus3() {
		Empleado E3= new Empleado("Marta",51,"Valencia",2200);
		assertEquals(true,E3.tienePlus());
	}
	
	@Test
	void testTienePlus4() {
		Empleado E4= new Empleado("Pepe",30,"Asturias",600);
		assertEquals(false,E4.tienePlus());
	}


}
