package animal;

import org.jointheleague.graphical.robot.Robot;

public class robot {

	public static void main(String[] args) {
		Robot u2603 = new Robot("batman");
		u2603.show();
		RobotShapeMaker rsm = new RobotShapeMaker(u2603);
		rsm.drawCube(200);
		u2603.setSpeed(10);
	}

}

class RobotShapeMaker {
	private Robot tim;

	RobotShapeMaker(Robot tim) {
		this.tim = tim;
		tim.setSpeed(10);
		tim.setPenWidth(1);
		tim.hide();
	}

	void drawSquare(int dis) {
		tim.penDown();
		for (int i = 0; i < 4; i = i + 1) {
			tim.move(dis);
			tim.turn(90);
		}
	}

	void drawCircle(int dis) {
		tim.penDown();
		for (int i = 0; i < 360; i = i + 1) {
			tim.move(dis);
			tim.turn(1);
			
		}
	}

	void drawTriangle(int dis) {
		tim.penDown();
		for (int i = 0; i < 3; i = i + 1) {
			tim.move(dis);
			tim.turn(120);
		}
	}

	void drawRect(int l, int w) {
		tim.penDown();
		tim.move(l);
		tim.turn(90);
		tim.move(w);
		tim.turn(90);
		tim.move(l);
		tim.turn(90);
		tim.move(w);
		tim.turn(90);
	}

	void drawCube(int dis){
					tim.penDown();
					for(int i =0; i < 4; i=i+1){
					tim.move(dis);
					tim.turn(90);
					}
						
						tim.turn(45);
						tim.move(dis/2);
						tim.turn(-45);
						for(int i =0; i < 4; i=i+1){
							tim.move(dis);
							tim.turn(90);
							}
						tim.turn(90);
						tim.move(dis);
						tim.turn(135);
						tim.move(dis/2);
						tim.turn(45);
						tim.move(dis);
						tim.turn(90);
						tim.move(dis);
						tim.turn(45);
						tim.move(dis/2);
						tim.turn(-45);
						tim.turn(90);
						tim.move(dis);
						tim.turn(135);
						tim.move(dis/2);

						

					}
}
