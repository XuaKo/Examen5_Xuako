package entidades;

public class Palmares<T extends Metal, S extends Participante> {

	long id;
	T medalla;
	S participante;
	Prueba prueba;
	String observaciones;

	public Palmares() {

	}

	public Palmares(long id, T medalla, S participante, Prueba prueba, String observaciones) {
		super();
		this.id = id;
		this.medalla = medalla;
		this.participante = participante;
		this.prueba = prueba;
		this.observaciones = observaciones;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public T getMedalla() {
		return medalla;
	}

	public void setMedalla(T medalla) {
		this.medalla = medalla;
	}

	public S getParticipante() {
		return participante;
	}

	public void setParticipante(S participante) {
		this.participante = participante;
	}

	public Prueba getPrueba() {
		return prueba;
	}

	public void setPrueba(Prueba prueba) {
		this.prueba = prueba;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return id + "" + medalla + prueba.getNombre() + prueba.getFecha() + prueba.getLugar() ;
	}

}
