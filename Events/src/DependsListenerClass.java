import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DependsListenerClass implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("It Depends");
		System.out.println(e.getClass());
		System.out.println("When: " + e.getWhen());
		System.out.println(e.getSource());
		System.out.println("Modifier: " + e.getModifiers());
		
	}
	
}
//search if AWT is on java 16