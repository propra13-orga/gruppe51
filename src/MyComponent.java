import java.awt.*;
import javax.swing.JComponent;
public class MyComponent {

private Image backBuffer;
private Image myImage;
// more code to write here ...
private void createBackBuffer()
{
  //backBuffer = createImage(getWidth(),getHeight());
}
public void paintComponent(Graphics g)
{
//updateScreen();
}
public void renderScreen()
{
// if backBuffer doesn't exist, create one
if (backBuffer == null) createBackBuffer();
// get Graphics object from backBuffer
Graphics g = backBuffer.getGraphics();
}}
// render screen on backBuffer
//g.drawImage(myImage,0,0,this);
//g.drawLine(0,0,10,20);
// ...
//public void updateScreen()
//{
//Graphics g = getGraphics();
/*if (g != null) // component already visible?
{
// is there a backBuffer to draw?
if (backBuffer != null) g.drawImage(backBuffer, 0, 0, null);
else
{
// if not, create one and render on it
createBackBuffer();
renderScreen();
}
}*/
//}