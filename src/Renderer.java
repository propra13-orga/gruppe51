import javax.swing.JFrame;
public class Renderer extends Thread{
	private MyFrame myFrame;
	Renderer (MyFrame pFrame ){
		this.myFrame= pFrame; 
	}
	public void run()
	{
		while(true)
		{
			myFrame.renderScreen();
			try
			{
				Thread.sleep(20L);
			}
			catch (InterruptedException ex){};
			
		}
	}
}

