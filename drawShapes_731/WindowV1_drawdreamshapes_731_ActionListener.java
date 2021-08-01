package drawShapes_731;

import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WindowV1_drawdreamshapes_731_ActionListener implements ActionListener {
	
	public Graphics g;
	
	private String btn;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.btn = e.getActionCommand();
		
		WindowV1_drawdreamshapes_731_Shapes startdrawing = 
				new WindowV1_drawdreamshapes_731_Shapes(this.g, this.btn, 0, 0, -1.8, 
						-2.0, -0.5, -0.9);
		
		try {
			startdrawing.drawShapes();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public Graphics getGraphics() {
		return this.g;
	}
	
	public String getBtn() {
		return this.btn;
	}
	

}
