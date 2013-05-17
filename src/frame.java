import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class frame extends JFrame {
	 //1.Schritt: Den Rahmen erzeugen.
	
	public static void main(String[] args) {
		
		
		
		//2. Schritt: Was wird passieren, wenn der Rahmen geschlossen wird?
		JFrame frame=new JFrame("MENU");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,600);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		
		JButton startButton;
		startButton = new JButton("start");  
		startButton.setBounds(500, 300, 120, 70);
		ActionListener l = null;
		startButton.addActionListener(l);
		startButton.setFocusPainted(true);
		
		
		
		JButton endButton = new JButton("ende"); 
		endButton.setBounds(500, 450, 120, 70);
		endButton.addActionListener(l);
		endButton.setFocusPainted(true);
		
		
		
		frame.add(startButton);
		frame.add(endButton);
		
		
		}
	private void action(ActionEvent a){
		if (a.getSource()==startButton){
			JFrame Spiel= new JFrame("spielen");
			Spiel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Spiel.setSize(900,600);
			Spiel.setVisible(true);
			Spiel.setBackground(Color.BLACK);
			Spiel.setLocationRelativeTo(null);
			Spiel.add(new MyFrame());
		}
		if (a.getSource()==endButton){
			System.exit(0);
			
		}
	}
	

		//3. Schritt:Komponenten erzeugen und den Rahmen hinzufügen.
		//...erzeuge emptyLabel...
		//frame.getContentPane().add(grafik);
		//4. Schritt: Die Größe des Rahmens bestimmen.
		//frame.pack();

		//5. Schritt: Ausführen.
		
		// TODO Auto-generated method stub
		//Renderer myrenderer = new Renderer(frame);
		//frame.getGraphics().dispose();
		//frame.renderScreen();
		//frame.getGraphics().dispose();


	}


