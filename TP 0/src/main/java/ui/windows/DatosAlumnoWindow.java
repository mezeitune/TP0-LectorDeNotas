package ui.windows;

import java.awt.Color;

import org.uqbar.arena.bindings.PropertyAdapter;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Control;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.commons.utils.Observable;

//import usuario.Alumno;

import ui.vm.DatosViewModel;

//@SuppressWarnings("serial")
public class DatosAlumnoWindow extends Dialog<DatosViewModel> {

	private static final long serialVersionUID = 7070181265970638049L;

	public DatosAlumnoWindow(WindowOwner parent) {
		super(parent ,new DatosViewModel());
	}
	
	public void createFormPanel(Panel mainPanel) {
		this.setTitle("Datos Alumno");
		
		
		mainPanel.setLayout(new VerticalLayout());
		mainPanel.setWidth(500);

		new Label(mainPanel).setText("Codigo: ");
		new Label(mainPanel) //
		.setBackground(Color.ORANGE)
		.bindValueToProperty("code");
		
		new Label(mainPanel).setText("Nombre: ");
		new Label(mainPanel) //
		.setBackground(Color.ORANGE)
		.bindValueToProperty("firstName");
		
		new Label(mainPanel).setText("Apellido: ");
		new Label(mainPanel) //
		.setBackground(Color.ORANGE)
		.bindValueToProperty("lastName");
		
		new Label(mainPanel).setText("Usuario de Git: ");
		new Label(mainPanel) //
		.setBackground(Color.ORANGE)
		.bindValueToProperty("gitUser");
		


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
