package ch11;

public class ShapeUse {
	public static void main(String[] args) {
		Rectnagle r= new Rectnagle();
		r.x=100;
		r.y =200;
		r.draw();
		Circle c= new Circle();
		c.x=300;
		c.y=300;
		c.draw();
		Triangle t= new Triangle();
		t.x=100;
		t.y=200;
		t.draw();
	}
}

