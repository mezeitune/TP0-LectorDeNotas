package ui.windows;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import usuario.Alumno;

import ui.vm.ViewModelImport;


@SuppressWarnings("serial")
public abstract class DatosAlumnoWindow extends SimpleWindow<ViewModelImport> {


	public DatosAlumnoWindow(WindowOwner parent) {
		super(parent, new ViewModelImport());
	}
	//donde dice "Json" va la clase del objeto string
	/*
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("TP0 - Datos Alumno");
		
		Table <Json> tableUsuario = new Table<Json>(formPanel, Json.class);
		Column<Json> columnaLegajo = new Column<Json>(tableUsuario);
		columnaLegajo.setTitle("Numero Legajo");
		
		Column<Json> columnaNombre= new Column<Json>(tableUsuario);
		columnaNombre.setTitle("Nombre");
		
		Column<Json> columnaApellido = new Column<Json>(tableUsuario);
		columnaNombre.setTitle("Apellido");
		
		Column<Json> columnaGitHub = new Column<Json>(tableUsuario);
		columnaNombre.setTitle("Usuario GitHub");
		
		tableUsuario.setHeight(500);
		tableUsuario.setWidth(100);
	}*/
}
