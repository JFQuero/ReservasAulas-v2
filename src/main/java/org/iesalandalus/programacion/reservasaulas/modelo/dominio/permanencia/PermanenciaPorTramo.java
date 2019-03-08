package org.iesalandalus.programacion.reservasaulas.modelo.dominio.permanencia;

import java.time.LocalDate;
import java.util.Objects;

public class PermanenciaPorTramo extends Permanencia {

	private static final int PUNTOS = 10;
	private Tramo tramo;

	/* Constructores */
	public PermanenciaPorTramo(LocalDate dia, Tramo tramo) {
		super(dia);
		setTramo(tramo);
	}

	public PermanenciaPorTramo(String dia, Tramo tramo) {
		super(dia);
		setTramo(tramo);
	}

	public PermanenciaPorTramo(PermanenciaPorTramo permanencia) {
		super();
		if (permanencia == null) {
			throw new IllegalArgumentException("No se puede copiar una permanencia nula.");
		}
		setDia(permanencia.getDia());
		setTramo(permanencia.getTramo());
	}

	/* Metodos */
	public Tramo getTramo() {
		return tramo;
	}

	private void setTramo(Tramo tramo) {
		if (tramo == null) {
			throw new IllegalArgumentException("El tramo de una permanencia no puede ser nulo.");
		}
		this.tramo = tramo;
	}

	@Override
	public int getPuntos() {
		return PUNTOS;
	}

	/** Otros Metodos **/
	@Override
	public int hashCode() {
		return Objects.hash(tramo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof PermanenciaPorTramo)) {
			return false;
		}
		PermanenciaPorTramo other = (PermanenciaPorTramo) obj;
		return tramo == other.tramo;
	}

	@Override
	public String toString() {
		return String.format("[dia=%s, tramo=%s]", dia.format(FORMATO_DIA), tramo);
	}
}
