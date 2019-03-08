package org.iesalandalus.programacion.reservasaulas.controlador;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reservasaulas.modelo.ModeloReservasAulas;
import org.iesalandalus.programacion.reservasaulas.modelo.dominio.Aula;
import org.iesalandalus.programacion.reservasaulas.modelo.dominio.Profesor;
import org.iesalandalus.programacion.reservasaulas.modelo.dominio.Reserva;
import org.iesalandalus.programacion.reservasaulas.modelo.dominio.permanencia.Permanencia;
import org.iesalandalus.programacion.reservasaulas.vista.VistaReservasAulas;

public class ControladorReservasAulas {

	private VistaReservasAulas vista;
	private ModeloReservasAulas modelo;

	public ControladorReservasAulas(VistaReservasAulas vista, ModeloReservasAulas modelo) {
		this.modelo = modelo;
		this.vista = vista;
		this.vista.setControlador(this);

	}

	public void comenzar() {
		vista.comenzar();
	}

	public void salir() {
		vista.salir();
	}

	public void insertarAula(Aula aula) throws OperationNotSupportedException {
		modelo.instertarAula(aula);
	}

	public void borrarAula(Aula aula) throws OperationNotSupportedException {
		modelo.borrarAula(aula);
	}

	public Aula buscarAula(Aula aula) {
		return modelo.buscarAula(aula);
	}

	public List<String> representarAulas() {
		return modelo.representarAulas();
	}

	public void insertarProfesor(Profesor profesor) throws OperationNotSupportedException {
		modelo.insertarProfesor(profesor);
	}

	public void borrarProfesor(Profesor profesor) throws OperationNotSupportedException {
		modelo.borrarProfesor(profesor);
	}

	public Profesor buscarProfesor(Profesor profesor) {
		return modelo.buscarProfesor(profesor);
	}

	public List<String> representarProfesores() {
		return modelo.representarProfesores();
	}

	public void realizarReserva(Reserva reserva) throws OperationNotSupportedException {
		modelo.realizarReserva(reserva);
	}

	public void anularReserva(Reserva reserva) throws OperationNotSupportedException {
		modelo.anularReserva(reserva);
	}

	public List<String> representarReservas() {
		return modelo.representarReservas();
	}

	public List<Reserva> getReservasAula(Aula aula) {
		return modelo.getReservasAula(aula);
	}

	public List<Reserva> getReservasProfesor(Profesor profesor) {
		return modelo.getReservasProfesor(profesor);
	}

	public List<Reserva> getReservasPermanencia(Permanencia permanencia) {
		return modelo.getReservasPermanencia(permanencia);
	}

	public boolean consultarDisponibilidad(Aula aula, Permanencia permanencia) {
		return modelo.consultarDisponibilidad(aula, permanencia);
	}
}
