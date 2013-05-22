package gruppe51;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyFrame extends JPanel implements ActionListener{
	
	Image img;
	Image img_feld;
	Spielfigur figur;
	Timer time;
	

	public MyFrame(){
		figur = new Spielfigur();
		addKeyListener(new AL());
		setFocusable(true);
		ImageIcon w = new ImageIcon("wand2.jpg");
		img = w.getImage();
		ImageIcon f = new ImageIcon("feld.jpg");
		img_feld = f.getImage();
		addKeyListener(new AL());
		
		time = new Timer(5,this);
		time.start();
		
	}
	
	public void actionPerformed(ActionEvent e){
		figur.move();
		repaint();
	}
	
	public void paint(Graphics g){
		
		super.paint(g);
		Graphics2D f2 = (Graphics2D)g;
		
		char[][][] spielfeld = new char [3][18][12];
			
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
			spielfeld[0][9][0] = 'w';
			spielfeld[0][10][0] = 'w';
			spielfeld[0][11][0] = 'w';
			spielfeld[0][12][0] = 'w';
			spielfeld[0][13][0] = 'w';
			spielfeld[0][14][0] = 'w';
			spielfeld[0][15][0] = 'w';
			spielfeld[0][16][0] = 'w';
			spielfeld[0][17][0] = 'w';
			spielfeld[0][0][1] = 'w';
			spielfeld[0][1][1] = ' ';
			spielfeld[0][2][1] = ' ';
			spielfeld[0][3][1] = ' ';
			spielfeld[0][4][1] = ' ';
			spielfeld[0][5][1] = ' ';
			spielfeld[0][6][1] = ' ';
			spielfeld[0][7][1] = 'w';
			spielfeld[0][8][1] = ' ';
			spielfeld[0][9][1] = ' ';
			spielfeld[0][10][1] = ' ';
			spielfeld[0][11][1] = ' ';
			spielfeld[0][12][1] = ' ';
			spielfeld[0][13][1] = ' ';
			spielfeld[0][14][1] = ' ';
			spielfeld[0][15][1] = ' ';
			spielfeld[0][16][1] = ' ';
			spielfeld[0][17][1] = 'w';
			spielfeld[0][0][2] = 'w';
			spielfeld[0][1][2] = ' ';
			spielfeld[0][2][2] = 'w';
			spielfeld[0][3][2] = 'w';
			spielfeld[0][4][2] = ' ';
			spielfeld[0][5][2] = ' ';
			spielfeld[0][6][2] = ' ';
			spielfeld[0][7][2] = 'w';
			spielfeld[0][8][2] = ' ';
			spielfeld[0][9][2] = ' ';
			spielfeld[0][10][2] = ' ';
			spielfeld[0][11][2] = ' ';
			spielfeld[0][12][2] = ' ';
			spielfeld[0][13][2] = ' ';
			spielfeld[0][14][2] = ' ';
			spielfeld[0][15][2] = ' ';
			spielfeld[0][16][2] = ' ';
			spielfeld[0][17][2] = 'w';
			spielfeld[0][0][3] = 'w';
			spielfeld[0][1][3] = ' ';
			spielfeld[0][2][3] = 'w';
			spielfeld[0][3][3] = 'w';
			spielfeld[0][4][3] = ' ';
			spielfeld[0][5][3] = ' ';
			spielfeld[0][6][3] = ' ';
			spielfeld[0][7][3] = 'w';
			spielfeld[0][8][3] = ' ';
			spielfeld[0][9][3] = ' ';
			spielfeld[0][10][3] = ' ';
			spielfeld[0][11][3] = 'w';
			spielfeld[0][12][3] = ' ';
			spielfeld[0][13][3] = ' ';
			spielfeld[0][14][3] = 'w';
			spielfeld[0][15][3] = 'w';
			spielfeld[0][16][3] = ' ';
			spielfeld[0][17][3] = ' ';
			spielfeld[0][0][4] = 'w';
			spielfeld[0][1][4] = ' ';
			spielfeld[0][2][4] = ' ';
			spielfeld[0][3][4] = ' ';
			spielfeld[0][4][4] = ' ';
			spielfeld[0][5][4] = ' ';
			spielfeld[0][6][4] = ' ';
			spielfeld[0][7][4] = ' ';
			spielfeld[0][8][4] = ' ';
			spielfeld[0][9][4] = ' ';
			spielfeld[0][10][4] = ' ';
			spielfeld[0][11][4] = 'w';
			spielfeld[0][12][4] = ' ';
			spielfeld[0][13][4] = ' ';
			spielfeld[0][14][4] = ' ';
			spielfeld[0][15][4] = 'w';
			spielfeld[0][16][4] = 'w';
			spielfeld[0][17][4] = ' ';
			spielfeld[0][0][5] = 'w';
			spielfeld[0][1][5] = ' ';
			spielfeld[0][2][5] = ' ';
			spielfeld[0][3][5] = ' ';
			spielfeld[0][4][5] = ' ';
			spielfeld[0][5][5] = ' ';
			spielfeld[0][6][5] = ' ';
			spielfeld[0][7][5] = ' ';
			spielfeld[0][8][5] = ' ';
			spielfeld[0][9][5] = ' ';
			spielfeld[0][10][5] = ' ';
			spielfeld[0][11][5] = 'w';
			spielfeld[0][12][5] = ' ';
			spielfeld[0][13][5] = ' ';
			spielfeld[0][14][5] = ' ';
			spielfeld[0][15][5] = ' ';
			spielfeld[0][16][5] = ' ';
			spielfeld[0][17][5] = 'w';
			spielfeld[0][0][6] = 'w';
			spielfeld[0][1][6] = ' ';
			spielfeld[0][2][6] = ' ';
			spielfeld[0][3][6] = ' ';
			spielfeld[0][4][6] = ' ';
			spielfeld[0][5][6] = ' ';
			spielfeld[0][6][6] = ' ';
			spielfeld[0][7][6] = ' ';
			spielfeld[0][8][6] = ' ';
			spielfeld[0][9][6] = ' ';
			spielfeld[0][10][6] = ' ';
			spielfeld[0][11][6] = 'w';
			spielfeld[0][12][6] = ' ';
			spielfeld[0][13][6] = ' ';
			spielfeld[0][14][6] = ' ';
			spielfeld[0][15][6] = ' ';
			spielfeld[0][16][6] = ' ';
			spielfeld[0][17][6] = 'w';
			spielfeld[0][0][7] = 'w';
			spielfeld[0][1][7] = ' ';
			spielfeld[0][2][7] = ' ';
			spielfeld[0][3][7] = ' ';
			spielfeld[0][4][7] = ' ';
			spielfeld[0][5][7] = ' ';
			spielfeld[0][6][7] = ' ';
			spielfeld[0][7][7] = ' ';
			spielfeld[0][8][7] = ' ';
			spielfeld[0][9][7] = ' ';
			spielfeld[0][10][7] = ' ';
			spielfeld[0][11][7] = 'w';
			spielfeld[0][12][7] = ' ';
			spielfeld[0][13][7] = ' ';
			spielfeld[0][14][7] = ' ';
			spielfeld[0][15][7] = ' ';
			spielfeld[0][16][7] = ' ';
			spielfeld[0][17][7] = 'w';
			spielfeld[0][0][8] = ' ';
			spielfeld[0][1][8] = 'w';
			spielfeld[0][2][8] = 'w';
			spielfeld[0][3][8] = ' ';
			spielfeld[0][4][8] = ' ';
			spielfeld[0][5][8] = ' ';
			spielfeld[0][6][8] = ' ';
			spielfeld[0][7][8] = 'w';
			spielfeld[0][8][8] = ' ';
			spielfeld[0][9][8] = ' ';
			spielfeld[0][10][8] = ' ';
			spielfeld[0][11][8] = 'w';
			spielfeld[0][12][8] = ' ';
			spielfeld[0][13][8] = ' ';
			spielfeld[0][14][8] = ' ';
			spielfeld[0][15][8] = ' ';
			spielfeld[0][16][8] = ' ';
			spielfeld[0][17][8] = 'w';
			spielfeld[0][0][9] = ' ';
			spielfeld[0][1][9] = ' ';
			spielfeld[0][2][9] = 'w';
			spielfeld[0][3][9] = 'w';
			spielfeld[0][4][9] = ' ';
			spielfeld[0][5][9] = ' ';
			spielfeld[0][6][9] = ' ';
			spielfeld[0][7][9] = 'w';
			spielfeld[0][8][9] = ' ';
			spielfeld[0][9][9] = ' ';
			spielfeld[0][10][9] = ' ';
			spielfeld[0][11][9] = ' ';
			spielfeld[0][12][9] = ' ';
			spielfeld[0][13][9] = ' ';
			spielfeld[0][14][9] = ' ';
			spielfeld[0][15][9] = ' ';
			spielfeld[0][16][9] = ' ';
			spielfeld[0][17][9] = 'w';
			spielfeld[0][0][10] = 'w';
			spielfeld[0][1][10] = ' ';
			spielfeld[0][2][10] = ' ';
			spielfeld[0][3][10] = ' ';
			spielfeld[0][4][10] = ' ';
			spielfeld[0][5][10] = ' ';
			spielfeld[0][6][10] = ' ';
			spielfeld[0][7][10] = 'w';
			spielfeld[0][8][10] = ' ';
			spielfeld[0][9][10] = ' ';
			spielfeld[0][10][10] = ' ';
			spielfeld[0][11][10] = ' ';
			spielfeld[0][12][10] = ' ';
			spielfeld[0][13][10] = ' ';
			spielfeld[0][14][10] = ' ';
			spielfeld[0][15][10] = ' ';
			spielfeld[0][16][10] = ' ';
			spielfeld[0][17][10] = 'w';
			spielfeld[0][0][11] = 'w';
			spielfeld[0][1][11] = 'w';
			spielfeld[0][2][11] = 'w';
			spielfeld[0][3][11] = 'w';
			spielfeld[0][4][11] = 'w';
			spielfeld[0][5][11] = 'w';
			spielfeld[0][6][11] = 'w';
			spielfeld[0][7][11] = 'w';
			spielfeld[0][8][11] = 'w';
			spielfeld[0][9][11] = 'w';
			spielfeld[0][10][11] = 'w';
			spielfeld[0][11][11] = 'w';
			spielfeld[0][12][11] = 'w';
			spielfeld[0][13][11] = 'w';
			spielfeld[0][14][11] = 'w';
			spielfeld[0][15][11] = 'w';
			spielfeld[0][16][11] = 'w';
			spielfeld[0][17][11] = 'w';
			
			int aktKarte = 0;
			
			for(int x = 0; x< 18 ; x++){
				for(int y = 0; y<12; y++){
					if(spielfeld[aktKarte][x][y] == 'w'){
						g.drawImage(img, x*50, y*50, 50, 50, Color.BLACK,null);
					}
					else {
						g.drawImage(img_feld, x*50, y*50, 50,50, Color.BLACK,null);
					}
				}
			}
			
			Graphics2D g2d = (Graphics2D) g;
			g2d.drawImage(figur.getImage(), figur.getX(), figur.getY(), 50, 50, null);
		
	}
	
	private class AL extends KeyAdapter{
		
		public AL(){
			
		}
		
		public void keyReleased(KeyEvent e){
			figur.keyReleased(e);			
			
		}
		public void keyPressed(KeyEvent e){
			figur.keyPressed(e);
		}
		
	}
}
