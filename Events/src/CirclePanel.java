import java.awt.Graphics;

import javax.swing.JPanel;

public class CirclePanel extends JPanel{
	
	private int radius = 5;
	private boolean flag = false;
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(flag) {
			g.drawOval(getWidth()/2- radius, getHeight()/2 -radius, radius*2, 2*radius);
			flag = true;
		}else {
			g.drawOval(getWidth()/2- radius, getHeight()/2 -radius, radius*2, 2*radius);
			flag =false;
		}
		
	}

	public void makeBigger() {
		++radius;
		repaint();
		
	}
}
