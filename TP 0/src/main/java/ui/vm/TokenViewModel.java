package ui.vm;

import org.uqbar.commons.utils.Observable;

import usuario.Alumno;


@Observable
public class TokenViewModel {
	
	private Alumno token;


	public Alumno getToken() {
		return token;
	}

	public void setPrendaSeleccionada(Alumno token) {
		this.token = token;
	}

	
}