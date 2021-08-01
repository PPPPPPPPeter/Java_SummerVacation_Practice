package drawShapes_731;

import java.awt.Color;
import java.awt.Graphics;

public class WindowV1_drawdreamshapes_731_Shapes {
	
	private double x,y,a,b,c,d;
	private Graphics g;
	private String btn;
	
	public WindowV1_drawdreamshapes_731_Shapes(Graphics g, String btn, double  x, double y, 
			double a, double b, double c, double d) {
		
		this.g = g;
		this.btn = btn;
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		
	}
	
	public void drawShapes() throws InterruptedException {
		
		if ("START!".equals(this.btn)) {
			
			this.g.fillRect(0,0,900,900);
			for (int i= 0; i<250000; i++) {
				double tempX  = Math.sin(a*y)+c*Math.cos(a*x);
	            double tempY = Math.sin(b*x)+d*Math.cos(b*y);
	            x = tempX;
	            y = tempY;
	            
	            int px = (int)(tempX*100)+300;
	            int py =(int)(tempY*100)+300;
	            Color color =new Color(i%150,i%200,0,50);
	            this.g.setColor(color);
	            this.g.drawLine(px,py,px,py);
	            Thread.sleep(1);
			}
		}
	}	
	
}
