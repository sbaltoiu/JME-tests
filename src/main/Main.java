package main;

import com.jme.app.SimpleGame;
import com.jme.math.Vector3f;
import com.jme.scene.shape.Box;

public class Main extends SimpleGame {
	public static void main(String[] args) {
		Main app = new Main();
		app.setConfigShowMode(ConfigShowMode.AlwaysShow);
		app.start();
	}

	@Override
	protected void simpleInitGame() {
		int i = 0;

		while (i < 10) {
			float dX = ((float) Math.random()) * 100;
			float dY = ((float) Math.random()) * 100;
			float dZ = ((float) Math.random()) * 100;
			Box b = new Box("Mybox", new Vector3f(dX, dY, dZ), new Vector3f(dX, dY, dZ));
			rootNode.attachChild(b); // Put it in the scene graph
			i++;
		}
	}
}
