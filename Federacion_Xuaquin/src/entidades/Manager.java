package entidades;

import java.util.Scanner;

import utils.Datos;

public class Manager {
	private long id;
	private String telefono;
	private String direccion;

	private DatosPersona persona;

	public Manager () {
		
	}
	public Manager(long id, String telefono, String direccion) {
		super();
		this.id = id;
		this.telefono = telefono;
		this.direccion = direccion;
		this.persona = Datos.buscarPersonaPorId(id);
	}

	public Manager(long id, String telefono, String direccion, DatosPersona dp) {
		super();
		this.id = id;
		this.telefono = telefono;
		this.direccion = direccion;
		this.persona = dp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public DatosPersona getPersona() {
		return this.persona;
	}

	public static void nuevoManager() {
		Manager ret = null;
		long id = -1;
		String telefono = "";
		String direccion = "";
		String nombre = "";
		DatosPersona dp = null;
		boolean valido = false;
		do {
			System.out.println("Introduzca su identificador de manager:");
			Scanner sc = new Scanner(System.in);
			id = sc.nextLong();
			if (id > 0) {
				valido = true;
			} else {
				System.out.println("El valor del id no es valido");
				valido = false;
			}
		} while (!valido);
		valido = false;
		do {
			System.out.println("Introduzca sus datos personales:");
			Scanner sc = new Scanner(System.in);
			dp = DatosPersona.nuevaPersona();
			valido = true;
		
		} while (!valido);
		valido = false;
		do {
			System.out.println("Introduzca su direccion:");
			Scanner sc = new Scanner(System.in);
			direccion = sc.nextLine();
			valido = true;
	
		} while (!valido);
		valido = false;
		do {
			System.out.println("Introduzca su telefono de manager:");
			Scanner sc = new Scanner(System.in);
			telefono = sc.nextLine();
			if (telefono.length() > 10) {
				valido = false;
			} else {
				System.out.println("El valor del telefono no es valido");
				valido = true;
			}
		} while (!valido);
	}

	@Override
	public String toString() {
		return id + DatosPersona.nuevaPersona().getNombre() + " (" + DatosPersona.nuevaPersona().getNifnie() + ") del año" + DatosPersona.nuevaPersona().getFechaNac().getYear() + " telf 1: " + telefono + " telf 2: " + DatosPersona.nuevaPersona().getTelefono();
	}
	
}
