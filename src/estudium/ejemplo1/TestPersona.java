package estudium.ejemplo1;

public class TestPersona {

	public static void main(String[] args) 
	{	
		Persona persona1 = new Persona();
		persona1.setNombre("Maria Jose");
		persona1.setApellidos("Perez");
		persona1.setEdad(15);
		persona1.setAula(5);
		persona1.setHaPagado(false);
		
		System.out.println(persona1.getNombre() + " " + persona1.getApellidos());
		System.out.println(persona1.getEdad() + " " + persona1.getAula() + " " + persona1.getHaPagado());
		
		Persona persona2 = new Persona("Manuel", "Gonzalez", 22, true, 5);
		System.out.println(persona2.getNombre() + " " + persona2.getApellidos());
		System.out.println(persona2.getEdad() + " " + persona2.getAula() + " " + persona2.getHaPagado());
	}
	
}
