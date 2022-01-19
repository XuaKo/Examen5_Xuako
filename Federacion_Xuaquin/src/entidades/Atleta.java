package entidades;

import java.util.Scanner;

import utils.Datos;

public class Atleta extends Participante {
	private long idAtleta;
	private float altura;
	private float peso;

	private DatosPersona persona;

	public Atleta() {
		
	}
	public Atleta(long id, int dorsal, char calle, long idAtleta, float altura, float peso) {
		super(id, dorsal, calle);
		this.idAtleta = idAtleta;
		this.altura = altura;
		this.peso = peso;
		this.persona = Datos.buscarPersonaPorId(id);
	}

	public Atleta(long id, int dorsal, char calle, long idAtleta, float altura, float peso, DatosPersona dp) {
		super(idAtleta, dorsal, calle);
		this.idAtleta = idAtleta;
		this.altura = altura;
		this.peso = peso;
		this.persona = dp;
	}

	public Atleta(long idAtleta, float altura, float peso, DatosPersona dp) {
		super();
		this.idAtleta = idAtleta;
		this.altura = altura;
		this.peso = peso;
		this.persona = dp;
	}

	public Atleta(long idParticipante, Atleta a, int dorsal, char calle) {
		super(idParticipante, dorsal, calle);
		this.idAtleta = a.idAtleta;
		this.altura = a.altura;
		this.peso = a.peso;
		this.persona = Datos.buscarPersonaPorId(a.idAtleta);
	}

	@Override
	public long getId() {
		return idAtleta;
	}

	@Override
	public void setId(long id) {
		this.idAtleta = id;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public DatosPersona getPersona() {
		return this.persona;
	}

	public static Atleta nuevoAtleta () {
		Atleta ret = new Atleta();
		long idAtleta = -1;
		float peso = -1;
		float altura = -1;
		DatosPersona dp = null;
		boolean valido = false;
		do {
			System.out.println("Introduzca su identificador de atleta:");
			Scanner sc = new Scanner(System.in);
			idAtleta = sc.nextLong();
			
			if (idAtleta > 0) {
				valido = true;
			} else {
				System.out.println("El valor del id no es valido");
				valido = false;
			}
		} while (!valido);
		valido = false;
		do {
			System.out.println("Introduzca su peso:");
			Scanner sc = new Scanner(System.in);
			peso = sc.nextFloat();
			
			if (peso > 0) {
				valido = true;
			} else {
				System.out.println("El valor del peso no es valido");
				valido = false;
			}
		} while (!valido);
		valido = false;
		do {
			System.out.println("Introduzca su altura:");
			Scanner sc = new Scanner(System.in);
			altura = sc.nextFloat();
			
			if (altura > 0) {
				valido = true;
			} else {
				System.out.println("El valor de la altura no es valido");
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
		return ret;
		
	}
	@Override
	public String toString() {
		return  DatosPersona.nuevaPersona().getNombre() + " (" + DatosPersona.nuevaPersona().getNifnie() + ") del año " + DatosPersona.nuevaPersona().getFechaNac().getYear() + "\t" + peso + "Kgs. " + altura + "m." ;
	}
	
}
