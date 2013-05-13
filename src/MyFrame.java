import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;



public class MyFrame extends JFrame {
	//Hier Spielfeld Array für drei Karten
	char[][][] spielfeld = new char [3][9][6];
	
	//Hier die Bilder bzw. Objekte
	private BufferedImage img_tier = null;
	private BufferedImage img_wand = null;
	
	MyFrame(String name) {
		super(name);
		
		//hier Spielfeldinitialisieren
		spielfeld[0][0][0] = 'w';
		spielfeld[0][1][0] = 'w';
		spielfeld[0][2][0] = 'w';
		spielfeld[0][3][0] = 'w';
		spielfeld[0][4][0] = 'w';
		spielfeld[0][5][0] = 'w';
		spielfeld[0][6][0] = 'w';
		spielfeld[0][7][0] = 'w';
		spielfeld[0][8][0] = 'w';
		spielfeld[0][0][1] = ' ';
		spielfeld[0][1][1] = ' ';
		spielfeld[0][2][1] = ' ';
		spielfeld[0][3][1] = ' ';
		spielfeld[0][4][1] = ' ';
		spielfeld[0][5][1] = ' ';
		spielfeld[0][6][1] = ' ';
		spielfeld[0][7][1] = ' ';
		spielfeld[0][8][1] = 'w';
		spielfeld[0][0][2] = 'w';
		spielfeld[0][1][2] = ' ';
		spielfeld[0][2][2] = 'w';
		spielfeld[0][3][2] = ' ';
		spielfeld[0][4][2] = ' ';
		spielfeld[0][5][2] = ' ';
		spielfeld[0][6][2] = 'w';
		spielfeld[0][7][2] = ' ';
		spielfeld[0][8][2] = ' ';
		spielfeld[0][0][3] = 'w';
		spielfeld[0][1][3] = ' ';
		spielfeld[0][2][3] = 'w';
		spielfeld[0][3][3] = ' ';
		spielfeld[0][4][3] = ' ';
		spielfeld[0][5][3] = ' ';
		spielfeld[0][6][3] = ' ';
		spielfeld[0][7][3] = ' ';
		spielfeld[0][8][3] = 'w';
		spielfeld[0][0][4] = 'w';
		spielfeld[0][1][4] = ' ';
		spielfeld[0][2][4] = ' ';
		spielfeld[0][3][4] = ' ';
		spielfeld[0][4][4] = ' ';
		spielfeld[0][5][4] = ' ';
		spielfeld[0][6][4] = ' ';
		spielfeld[0][7][4] = ' ';
		spielfeld[0][8][4] = 'w';
		spielfeld[0][0][5] = 'w';
		spielfeld[0][1][5] = 'w';
		spielfeld[0][2][5] = 'w';
		spielfeld[0][3][5] = 'w';
		spielfeld[0][4][5] = 'w';
		spielfeld[0][5][5] = 'w';
		spielfeld[0][6][5] = 'w';
		spielfeld[0][7][5] = 'w';
		spielfeld[0][8][5] = 'w';
		
		spielfeld[1][0][0] = ' ';
		spielfeld[1][1][0] = ' ';
		spielfeld[1][2][0] = ' ';
		spielfeld[1][3][0] = ' ';
		spielfeld[1][4][0] = ' ';
		spielfeld[1][5][0] = ' ';
		spielfeld[1][6][0] = ' ';
		spielfeld[1][7][0] = ' ';
		spielfeld[1][8][0] = ' ';
		spielfeld[1][0][1] = ' ';
		spielfeld[1][1][1] = ' ';
		spielfeld[1][2][1] = ' ';
		spielfeld[1][3][1] = ' ';
		spielfeld[1][4][1] = ' ';
		spielfeld[1][5][1] = ' ';
		spielfeld[1][6][1] = ' ';
		spielfeld[1][7][1] = ' ';
		spielfeld[1][8][1] = ' ';
		spielfeld[1][0][2] = ' ';
		spielfeld[1][1][2] = ' ';
		spielfeld[1][2][2] = ' ';
		spielfeld[1][3][2] = ' ';
		spielfeld[1][4][2] = ' ';
		spielfeld[1][5][2] = ' ';
		spielfeld[1][6][2] = ' ';
		spielfeld[1][7][2] = ' ';
		spielfeld[1][8][2] = ' ';
		spielfeld[1][0][3] = ' ';
		spielfeld[1][1][3] = ' ';
		spielfeld[1][2][3] = ' ';
		spielfeld[1][3][3] = ' ';
		spielfeld[1][4][3] = ' ';
		spielfeld[1][5][3] = ' ';
		spielfeld[1][6][3] = ' ';
		spielfeld[1][7][3] = ' ';
		spielfeld[1][8][3] = ' ';
		spielfeld[1][0][4] = ' ';
		spielfeld[1][1][4] = ' ';
		spielfeld[1][2][4] = ' ';
		spielfeld[1][3][4] = ' ';
		spielfeld[1][4][4] = ' ';
		spielfeld[1][5][4] = ' ';
		spielfeld[1][6][4] = ' ';
		spielfeld[1][7][4] = ' ';
		spielfeld[1][8][4] = ' ';
		spielfeld[1][0][5] = ' ';
		spielfeld[1][1][5] = ' ';
		spielfeld[1][2][5] = ' ';
		spielfeld[1][3][5] = ' ';
		spielfeld[1][4][5] = ' ';
		spielfeld[1][5][5] = ' ';
		spielfeld[1][6][5] = ' ';
		spielfeld[1][7][5] = ' ';
		spielfeld[1][8][5] = ' ';
			try {
			//hier Bilder initialisieren
			img_tier = ImageIO.read(new File("abc.jpg"));	
			img_wand = ImageIO.read(new File("wand.jpg"));

			
			
		} catch(IOException e) {};
		//myImage = Toolkit.getDefaultToolkit().getImage("abc.jpg");
	}
	public void renderScreen(){
		//hier kommt der Code für die Darstellung
		Graphics g = this.getGraphics();
		g.drawLine(0, 0, 400, 400);
		paint(g);
		
		
	}
	public void paint(Graphics g){
		//Hier Zeichnen:
		
		//g.drawImage(img_wand, 0, 0, 100, 100, Color.BLACK, null);
		int aktKarte = 0;
			
		for(int x = 0; x< 9; x++){
			for(int y = 0; y<6; y++){
				if(spielfeld[aktKarte][x][y] == 'w'){
					g.drawImage(img_wand, x*100, y*100, 100, 100, Color.BLACK,null);
				}
				else {}
			}
		}
		
		
	}

}
