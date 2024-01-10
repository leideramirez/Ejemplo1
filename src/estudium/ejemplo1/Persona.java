package estudium.ejemplo1;

public class Persona {
	
	//Cuerpo clase
	// Atributos
	
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean haPagado;
	private int aula; 
	
	// Constructores 
	// Constructor vacio o opr defecto
	public Persona () {
		nombre = "";
		apellidos = "";
		edad = 0;
		haPagado = false;
		aula = 0;			
	}
	
	//Constructores por parametros
	
	public Persona(String n, String a, int e, boolean h, int au) {
		nombre = n;
		apellidos = a;
		edad = e;
		haPagado = h;
		aula = au;
			
	//Metodos get y set 	
			
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean getHaPagado() {
		return haPagado;
	}

	public void setHaPagado(boolean haPagado) {
		this.haPagado = haPagado;
	}

	public int getAula() {
		return aula;
	}

	public void setAula(int aula) {
		this.aula = aula;
	}
	
}
