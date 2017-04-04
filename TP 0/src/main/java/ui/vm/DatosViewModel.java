package ui.vm;



//import org.codehaus.jettison.json.JSONObject;

//import java.util.List;

//import org.codehaus.jettison.json.JSONException;
//import org.codehaus.jettison.json.JSONObject;
import org.uqbar.commons.utils.Observable;

import repository.AlumnosRepository;
//import repository.AlumnosRepository;
//import repository.Repositorios;
import usuario.Alumno;
import ui.vm.TokenViewModel;


@Observable

public class DatosViewModel extends TokenViewModel{//Copiado de VentaViewModel practica-arena


	//public Alumno alumno = new Alumno();
	public String code, firstName, lastName, gitUser;
	TokenViewModel token = new TokenViewModel();
	Alumno alumno = new Alumno();
	/*public String firstName; 
	public String lastName; 
	public String gitUser;
	*/

	/*public DatosViewModel() {
		unAlumno=new Alumno();
		unAlumno.setToken(Repositorios.alumnos.getToken());
		JSONObject h = unAlumno.datosAlumno();
		
		
	}*/
	
	
	/*public Alumno generarAlumno(){
		//alumno = AlumnosRepository.getAlumno();
		
		
		return alumno;
	}*/
	public String getCode(){
		
		alumno.setToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho");
		//return this.code = this.generarAlumno().getCode();
		alumno.datosAlumno();
		return this.code = alumno.getCode();
		
		/*unAlumno.setToken(token);
		unAlumno.datosAlumno();*/
		
		//this.code=alumno.getCode();
	}
	
	public String getFirstName() {
		return this.firstName = alumno.first_name;
	}
	
	public String getLastName() {
		
		return this.lastName = alumno.last_name;
	}
	
	public String getGitUser() {
		
		return this.gitUser = alumno.git_user;
	}

	

	

}
