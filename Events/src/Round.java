import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Round extends JFrame{

	private JButton makeBigger = new JButton("Bigger");
	private JButton makeSmaller = new JButton("Smaller");
	private CirclePanel canvas = new CirclePanel();
	
	
	public Round() {
		
		JPanel panel = new JPanel();
		panel.add(makeBigger);
		panel.add(makeSmaller);
		
		add(panel, BorderLayout.SOUTH);
		add(canvas, BorderLayout.CENTER);
		
		makeBigger.addActionListener(new MakeBiggerListener());
		/*
		 // create listeners
		
		YesListenerClass yes = new YesListenerClass();
		sayYesButton.addActionListener(yes);
		
		DependsListenerClass depends = new DependsListenerClass();
		dependsButton.addActionListener(depends);
		
		wrongButton.addActionListener(depends);
		*/
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Round");
		f.setLocationRelativeTo(null);
		f.setSize(200,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	class MakeBiggerListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			canvas.makeBigger();
			
		}
		
	}
	
	
}
