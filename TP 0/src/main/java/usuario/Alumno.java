package usuario;

import org.codehaus.jettison.json.JSONObject;
import org.uqbar.commons.utils.Observable;

@Observable
public class Alumno {
	public String code;
	public String first_name;
	public String last_name;
	public String token;
	public String git_user;
	RequestService cliente = new RequestService();
	
	JSONObject jsonObject = new JSONObject();
	
	
	public JSONObject datosAlumno(){
		return cliente.datos(token);
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

	public String getCode() {
		return code;
	}


	public String setCode(String code) {
		return this.code = this.datosAlumno().optString("code");  
	}


	public String getFirst_name() {
		return first_name;
	}


	public String setFirst_name(String first_name) {
		 return this.first_name = this.datosAlumno().optString("first_name");
	}


	public String getLast_name() {
		return last_name;
	}


	public String setLast_name(String last_name) {
		 return this.last_name = this.datosAlumno().optString("last_name");
	}


	public String getGit_user() {
		return git_user;
	}


	public String setGit_user(String git_user) {
		 return this.git_user = this.datosAlumno().optString("git_user");
	}
	
	
	
	/*public static void main(String[] args) throws Exception{
		
		Alumno alumno = new Alumno();
		alumno.setToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho");
		
		
		
		System.out.println(alumno.datosAlumno());
		
	}*/

	
	
}


