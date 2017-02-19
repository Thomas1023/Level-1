package misc;

import java.util.Random;

import javax.swing.JOptionPane;

import sun.applet.Main;

public class Rand {

	public static void main(String[] args) {
//		String open = JOptionPane.showInputDialog(null, "Would you like to put in you own number(1) or would you like to have it generated for you(2)");
//		if(open.equals("1")){
//		Man();
//		}else if(open.equals("2")){
//		Rand();
//		}
		JOptionPane.showMessageDialog(null, "It took 2 tries");
	}

	private static void Rand() {
		int count = 0;
		for (int i = 0; i < 1000000; i++){
			Random rand = new Random();
			int rando=rand.nextInt(80);
			Random randq = new Random();
			int randd=randq.nextInt(80);
			if( randd == rando){
				
				count++;
			}
			
			
		}
		JOptionPane.showConfirmDialog(null, count);
	}

	private static void Man() {
		String guess = JOptionPane.showInputDialog("Put you 0-80 number here");
		int guesss = Integer.parseInt(guess);
		int count =0;{
		
		for (int i = 0; i < 1000000; i++){
			Random rand = new Random();
			int rando=rand.nextInt(80);
			if(guesss == rando){
				count++;
			}
		
		}
		JOptionPane.showConfirmDialog(null, count);
		
		}
		
	}
//	private boolean contains(int x,){
//		return false;
//		
//	}
}
		 
	

	
		
	


