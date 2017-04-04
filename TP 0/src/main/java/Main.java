import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

import ui.windows.IngresarToken;

public class Main extends Application{

	public static void main(String[] args) {
		//Fixture.initialize();
		new Main().start();
	}
	
	@Override
	public Window<?> createMainWindow() {
		return new IngresarToken(this);
	}
}