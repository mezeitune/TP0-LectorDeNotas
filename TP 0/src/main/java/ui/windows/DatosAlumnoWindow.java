package ui.windows;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import usuario.Alumno;

import ui.vm.DatosViewModel;


@SuppressWarnings("serial")
public class DatosAlumnoWindow extends Dialog<DatosViewModel> {


	public DatosAlumnoWindow(WindowOwner parent) {
		super(parent, new DatosViewModel());
	}
	
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Datos Alumno");
		
		Table <Alumno> tableUsuario = new Table<Alumno>(formPanel, Alumno.class);
		tableUsuario.setHeight(800);
		tableUsuario.setWidth(400);
		tableUsuario.bindItemsToProperty("alumnos");
		//tableUsuario.bindValueToProperty("unAlumno"); ROMPE TODO, pero sin esto no podemos agregar los datos a la tabla
		
		///////////////Deberia bindear los campos con los datos alumno, pero por lo anterior no lo toma/////////////////
		Column<Alumno> columnaLegajo = new Column<Alumno>(tableUsuario);
		columnaLegajo.setTitle("Numero Legajo").setFixedSize(150).bindContentsToProperty("code");
		
		
		
		Column<Alumno> columnaNombre= new Column<Alumno>(tableUsuario);
		columnaNombre.setTitle("Nombre").setFixedSize(150).bindContentsToProperty("first_name");
		
		
		Column<Alumno> columnaApellido = new Column<Alumno>(tableUsuario);
		columnaApellido.setTitle("Apellido").setFixedSize(150).bindContentsToProperty("last_name");
		
		
		Column<Alumno> columnaGitHub = new Column<Alumno>(tableUsuario);
		columnaGitHub.setTitle("Usuario GitHub").setFixedSize(150).bindContentsToProperty("git_user");
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	}
	
	// Aca la navegacion hacia la otra ventana de notas esta bien seteada. Solo falta el view model de la Planilla, por eso tira error si se descomenta.
	/*
	@Override
	protected void addActions(Panel actions){
		new Button(actions).setCaption("Ver Notas").onClick(this::PlanillaNotasWindow);
		
	}

	public void PlanillaNotasWindow() {
		Dialog<?> dialog = new PlanillaNotasWindow(this);
		dialog.open();
		dialog.onAccept(() -> {});
	}
	*/
	
}
