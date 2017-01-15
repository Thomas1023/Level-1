package misc;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;

public class fancyWindow implements KeyListener{
	JFrame frame = new JFrame();
	Random w = new Random();
	Random l = new Random();
	Boolean b = true;
 public static void main(String[] args) {
	
	 fancyWindow f = new fancyWindow();
	 f.setup();
}
 void setup(){
	 frame.addKeyListener(this);
	vis();
	 frame.setSize( w.nextInt(501) , l.nextInt(501));
	 
 }
 void vis(){
	 frame.setVisible(b);    
 }

@Override
public void keyTyped(KeyEvent s) {
	
}
@Override
public void keyPressed(KeyEvent e) {
	if(e.getKeyCode()==KeyEvent.VK_ENTER){
		setup();
	}
	if(e.getKeyCode()==KeyEvent.VK_SPACE){
		System.out.println("hi");
	if(b){
		b = false;
		vis();
	}else{
		b= true;
		vis();
	}
	}
	
}
@Override
public void keyReleased(KeyEvent e) {
	
	
}

}
