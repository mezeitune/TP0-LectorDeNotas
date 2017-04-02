package ui.windows;

import java.awt.Dialog;

import org.uqbar.arena.windows.WindowOwner;

import ui.vm.ViewModelImport;


// Aca tira error porque sigue faltan definir el ViewModel de las PlanillasNotas.

public class PlanillaNotasWindow extends Dialog<PlanillaNotasViewModel>{
	
	public DatosAlumnoWindow(WindowOwner parent) {
		super(parent, new PlanillaNotasViewModel());
	}
	
	protected void createFormPanel(Panel formPanel) {
		this.setTittle("Planilla de Notas del alumno");
		
		// Falta agregar la UI en si.
	}

}
