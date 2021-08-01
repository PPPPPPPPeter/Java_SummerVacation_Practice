package drawShapes_731;

import java.awt.FlowLayout;



import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * 
 * @author peterwong
 *
 */



public class WindowV1_drawdreamshapes_731 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//private Graphics g;
	private JButton drawBtn;
	
	private WindowV1_drawdreamshapes_731_ActionListener a;
	
	private Graphics g;
	
	private WindowV1_drawdreamshapes_731() {
		
		this.setTitle("WindowV2");
		this.setBounds(500, 500, 900, 900);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.drawBtn = new JButton("START!");
		
		this.add(drawBtn);
		
		this.setVisible(true);
		//return a value to g!
		this.g = this.getGraphics();
		this.a = new WindowV1_drawdreamshapes_731_ActionListener();
		a.g = this.g;
		this.drawBtn.addActionListener(a);
	}
	
	
	public static void main(String[] args) {
		
		new WindowV1_drawdreamshapes_731();
	}
	
}

