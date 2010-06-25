package main;

import com.jme.app.SimpleGame;
import com.jme.bounding.BoundingBox;
import com.jme.bounding.BoundingSphere;
import com.jme.math.Vector3f;
import com.jme.renderer.ColorRGBA;
import com.jme.scene.Spatial;
import com.jme.scene.shape.Box;
import com.jme.scene.shape.Sphere;
import com.jme.scene.Node;

public class Test2 extends SimpleGame {
	public static void main(String[] args) {
		Test2 app = new Test2();
		app.setConfigShowMode(ConfigShowMode.AlwaysShow);
		app.start();
	}

	@Override
	protected void simpleInitGame() {
		Box b = new Box("New box", new Vector3f(0, 0, 0), new Vector3f(1, 1, 1));
		b.setModelBound(new BoundingSphere());
		b.updateModelBound();
		b.setLocalTranslation(new Vector3f(0, 2, 0));
		b.setDefaultColor(ColorRGBA.blue.clone());

		Sphere s = new Sphere("new sphere", 10, 10, 1f);
		s.setModelBound(new BoundingBox());
		s.updateModelBound();
		s.setRandomColors();

		Node node = new Node("myNode");
		node.attachChild(b);
		node.attachChild(s);
		node.setLocalScale(2);

		rootNode.setLightCombineMode(Spatial.LightCombineMode.Off);
		rootNode.attachChild(node);
	}
}
