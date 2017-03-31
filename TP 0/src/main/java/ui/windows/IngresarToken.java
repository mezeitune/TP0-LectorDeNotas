package ui.windows;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;


import ui.vm.TokenViewModel;

@SuppressWarnings("serial")
public class IngresarToken extends Dialog<TokenViewModel>{

	public IngresarToken(WindowOwner owner) {
		super(owner, new TokenViewModel());
	}
	@Override
	protected void createFormPanel(Panel mainPanel) {
		Panel form = new Panel(mainPanel);
		form.setLayout(new ColumnLayout(2));
		
		new Label(form).setText("Ingrese su Token");
		
		new TextBox(form).setWidth(400).bindValueToProperty("Token");
		
		
	}
	@Override
	protected void addActions(Panel actions) {
		new Button(actions).setCaption("Ver datos").onClick(this::accept).setAsDefault();
		
	}
	
}
