package usuario;

import org.uqbar.commons.utils.Observable;

import com.sun.jersey.api.client.ClientResponse;



@Observable
public class Alumno {
	int code;
	public String first_name;
	public String last_name;
	public String token;
	public String git_user;
	RequestService cliente = new RequestService();
	
	public ClientResponse datosAlumno(){
		return cliente.datos(token);
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = "Bearer " + token;
	}
	public static void main(String[] args){
		
		Alumno alumno = new Alumno();
		alumno.setToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho");
		
		
		
		System.out.print(alumno.datosAlumno().getEntity(String.class));
		
	}
	
	
}


