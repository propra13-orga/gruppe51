package gruppe51;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Spielfigur {
	int x, y, dx, dy; //dx steht dafür, wie weit man die figur nach rechts oder links beweget
	Image figur;

	public Spielfigur(){
		ImageIcon i = new ImageIcon("Figur.jpg");
		figur = i.getImage();
		x=400;
		y=400;
		
		
	}
	
	public void move(){
		x = x + dx;
		y = y + dy;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public Image getImage(){
		return figur;
	}
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT){
		dx = -1;
		}
		
		if (key == KeyEvent.VK_RIGHT){
		dx = 1;
		}
		
		if (key == KeyEvent.VK_UP){
		dy = -1;
		}
		
		if (key == KeyEvent.VK_DOWN){
		dy = 1;
		}
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT);
		dx = 0;
		
		if (key == KeyEvent.VK_RIGHT);
		dx = 0;
		
		if (key == KeyEvent.VK_UP);
		dy = 0;
		
		if (key == KeyEvent.VK_DOWN);
		dy = 0;
	}
}