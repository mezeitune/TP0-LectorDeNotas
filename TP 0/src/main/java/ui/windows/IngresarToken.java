package ui.windows;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
//import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

//import repository.Repositorios;
import ui.vm.TokenViewModel;

@SuppressWarnings("serial")
public class IngresarToken extends Dialog<TokenViewModel>{

	public IngresarToken(WindowOwner parent) {
		super(parent, new TokenViewModel());
	}
	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Sistema de calificaciones");
		Panel form = new Panel(mainPanel);
		form.setLayout(new ColumnLayout(2));
		
		new Label(form).setText("Ingrese su Token");
		
		new TextBox(form).setWidth(400).bindValueToProperty("token");
		
		
	}
	@Override
	protected void addActions(Panel actions) {
		new Button(actions)
		.setCaption("Ver datos")
		.onClick(this::DatosAlumnoWindow);
		
	}
	
	public void DatosAlumnoWindow() {
		Dialog<?> dialog = new DatosAlumnoWindow(this);
		dialog.open();
		dialog.onAccept(() -> {});
	}
	

}
