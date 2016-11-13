package animal;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Housesss {
	public class Building{
		int wallHieght; 
		int roofWidth;
		int grassWidth;
		int x;
		int y;
		public Building(int wallHieght, int roofWidth, int grassWidth) {
			this.grassWidth = grassWidth;
			this.roofWidth = roofWidth;
			this.wallHieght = wallHieght;
			// TODO Auto-generated constructor stub
			
		}
		public void drawDoor(Robot wowbanger){
			int oldx = wowbanger.getX();
			 int oldy = wowbanger.getY();
			int doorY = y;
			
			int doorWidth = roofWidth/3;
					
			int doorX = x+ roofWidth;
			int doorHidth =      wallHieght/3;
			wowbanger.penUp();
			wowbanger.moveTo(doorX,doorY);
			wowbanger.penDown();
			wowbanger.move(doorHidth);
			wowbanger.turn(90);
			wowbanger.move(doorWidth);
			wowbanger.turn(90);
			wowbanger.move(doorHidth);
			wowbanger.turn(180);
			wowbanger.penUp();
			wowbanger.moveTo(oldx,oldy);
			wowbanger.penDown();
			
		}
		public void Draw(Robot wowbanger){
			 x = wowbanger.getX();
			 y = wowbanger.getY();
			wowbanger.move(wallHieght);
			wowbanger.turn(60);
			wowbanger.move(roofWidth);
			wowbanger.turn(60);
			wowbanger.move(roofWidth);
			wowbanger.turn(60);
			wowbanger.move(wallHieght);
			wowbanger.turn(-90);
			wowbanger.setPenColor(Color.GREEN);
			wowbanger.move(grassWidth);
			wowbanger.turn(-90);
			wowbanger.setPenColor(Color.BLACK);
			
			
			
		
		}
		
	}
	
public static void main(String[] args) {
	Building[] bs = new Building[20];
	Housesss gray = new Housesss();
	Robot wowbanger = new Robot("vic");
	wowbanger.moveTo(30, wowbanger.getWindow().getHeight()-50);
	wowbanger.penDown();
	
	for (int i = 0; i < 20; i++) {
		wowbanger.setSpeed(10);
		bs[i] = gray.new Building(new Random().nextInt(400),new Random().nextInt(100),new Random().nextInt(100));
		bs[i].Draw(wowbanger);
		
		
		
		
	}
	for (int i = 0; i < 20; i++) {
		bs[i].drawDoor(wowbanger);
	}
}
}
