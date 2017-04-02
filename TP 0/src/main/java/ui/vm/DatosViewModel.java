package ui.vm;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import repository.Repositorios;
import usuario.Alumno;

@Observable
public class DatosViewModel{//Copiado de VentaViewModel practica-arena


	private List<Alumno> alumnos;
	private Alumno unAlumno;

	/*public ViewModelImport() {
		this.alumnos = Repositorios.alumnos.all();
	}
*/
	public Alumno getCode() {
		return unAlumno;
	}

	public void setAlumnoSeleccionado(Alumno unAlumno) {
		this.unAlumno = unAlumno;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

}
