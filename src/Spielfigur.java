
/*public class Spielfigur extends MyFrame {
	
	Spielfigur figur;
	
	private BufferedImage img_figur = null;
	
	try{
		img_figur= ImageIO.read(new File("Figur.jpg"));
	}
	catch(IOException e) {}
	
	public void repaint(Graphics g){
		//Hier Zeichnen:
		
		//g.drawImage(img_figur, 0, 0, 100, 100, Color.BLACK, null);
		int aktKarte = 0;
			
		for(int x = 0; x< 18 ; x++){
			for(int y = 0; y<12; y++){
				if(spielfeld[aktKarte][x][y] != 'w'){
					g.drawImage(img_figur, x*50, y*50, 50, 50, Color.BLACK,null);
				}
				else {}
			}
		}
	}
}
}*/+
