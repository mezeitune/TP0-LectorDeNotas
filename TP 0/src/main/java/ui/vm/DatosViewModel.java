package ui.vm;

import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.uqbar.commons.utils.Observable;

import repository.Repositorios;
import usuario.Alumno;

@Observable
public class DatosViewModel{//Copiado de VentaViewModel practica-arena


	private Alumno unAlumno;
	private String code, firstName, lastName, gitUser;

	/*public DatosViewModel() {
		unAlumno=new Alumno();
		unAlumno.setToken(Repositorios.alumnos.getToken());
		JSONObject h = unAlumno.datosAlumno();
		
		
	}*/

	public String getCode(){
		
		Repositorios.alumnos.getAlumno().datosAlumno();
		
		return Repositorios.alumnos.getAlumno().getCode();
	}
	
	public String getFirstName() {
		
		return "first";
	}
	
	public String getLastName() {
		
		return "sdasd";
	}
	
	public String getGitUser() {
		
		return "git";
	}

	

	

}
