package estudium.ejemplo3;

import estudium.ejemplo1.Persona;

public class TestEmpleado {

	public static void main(String[] args) {
		
		Empleado empleado1 =new Empleado();
		empleado1.setNombre("Jesus");
		empleado1.setApellidos("Lozano");
		empleado1.setDni("30320228H");
		empleado1.setDomicilio("Calle Pino n 5");
		empleado1.setPuesto("Director");
		empleado1.setTelefono(954611985);
		
		Empleado empleado2 = new Empleado("Omaira", "Pulido", "30320229P", "Calle Madre Teresa 10", "Programadora", 958741585);

		System.out.println(empleado1.getNombre() + " " + empleado1.getApellidos() + " " + empleado1.getDni() + " " );
		System.out.println(empleado1.getDomicilio() + " " + empleado1.getPuesto() + " " + empleado1.getTelefono());
		
		System.out.println(empleado2.getNombre() + " " + empleado2.getApellidos() + " " + empleado2.getDni());
		System.out.println(empleado2.getDomicilio() + " " + empleado2.getPuesto() + " " + empleado2.getTelefono());
	}
		
	
}
