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
public class DatosAlumnoWindow extends Dialog<ViewModelImport> {


	public DatosAlumnoWindow(WindowOwner parent) {
		super(parent, new ViewModelImport());
	}
	//donde dice "Json" va la clase del objeto string
	/*
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Datos Alumno");
		
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
		
	protected void addACtiones(Panel actions){
		new Button(tableUsuario) 
		.setCaption("Ver Notas");
		.onClick(this::PlanillaNotasWindow);
		}
		
	}*/

	public void PlanillaNotasWindow() {
		Dialog<?> dialog = new PlanillaNotasWindow(this); // Hay que definir el viewModel de PlanillaNotasWindow
		dialog.open();
		dialog.onAccept(() -> {});
	}
	
	@Override
	protected void createFormPanel(Panel mainPanel) {
		// TODO Auto-generated method stub
		
	}
	
	
}
