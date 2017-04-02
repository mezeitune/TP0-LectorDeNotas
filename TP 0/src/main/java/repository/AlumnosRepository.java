package repository;

import java.util.ArrayList;
import java.util.List;

import usuario.Alumno;

public class AlumnosRepository {

	private List<Alumno> alumnos = new ArrayList<>();

	public List<Alumno> all() {
		return this.alumnos;
	}

}
