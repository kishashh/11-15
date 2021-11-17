import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Events extends JFrame{
	
	/*
	 * |button| --> |event| --> |listener|
	 */
	public Events() {
		JButton sayYesButton = new JButton("Say Yes");
		JButton dependsButton = new JButton("It Depends");
		JButton wrongButton = new JButton("So Wrong");
		
		JPanel panel = new JPanel();
		panel.add(sayYesButton);
		panel.add(dependsButton);
		panel.add(wrongButton);
		
		add(panel);
		// create listeners
		
		YesListenerClass yes = new YesListenerClass();
		sayYesButton.addActionListener(yes);
		
		DependsListenerClass depends = new DependsListenerClass();
		dependsButton.addActionListener(depends);
		
		wrongButton.addActionListener(depends);
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Events");
		f.setLocationRelativeTo(null);
		f.setSize(200,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	
}
