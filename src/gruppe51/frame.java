package gruppe51;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame extends JFrame implements ActionListener{
	
	private JButton starten;
	private JButton ende;

	public static void main(String[] args) {
		
		frame frame = new frame("Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,600);
		
		frame.setLayout(null);
		frame.setVisible(true);
		
 
		
	}
	
	public frame(String titel){
		super(titel);
		
		starten = new JButton("Spiel starten");
		starten.setBounds(380,200,200,80);
		starten.addActionListener(this);
		add(starten);
		
		ende = new JButton("Ende");
		ende.setBounds(380,300,200,80);
		ende.addActionListener(this);
		add(ende);
		
	}
	
	public static void fenster(){
		JFrame fenster = new JFrame();
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setSize(900,600);
		fenster.setVisible(true);
		fenster.add(new MyFrame());
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == starten){
		fenster();
		}
		
		if(e.getSource() == ende){
			System.exit(0);
		}
		
	}
}

