package has.book.test;

import java.awt.Graphics;

public class DrawShape extends Frame {
	public static void main(String[] args) {
		DrawShape win = new DrawShape ("도형 그리기");
	}
	public void paint(Graphics g) {
		Point[] p = {new Point (100, 100),
				new Point(140, 50),
				new Point(200, 100);
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150, 150), 50);
		
		// 원을 그린다.
		g.drawOval(c.center.x, c.center.y, c.r, c.r);
		
		// 직선 3개로 삼각형을 그린다.
		g.drawline(t.p[0].x, t.p[0].y, t.p[1].x, t.p[1].y);
		g.drawline(t.p[1].x, t.p[1].y, t.p[2].x, t.p[2].y);
		g.drawline(t.p[2].x, t.p[2].y, t.p[0].x, t.p[0].y);
		
		}
		
		DrawShape(String title) {
			super(title);
			setSize(300, 300);
			setVisible(true);
			
		}
	}
	class Point {
		
	}
}
