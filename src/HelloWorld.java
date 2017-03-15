import org.jointheleague.graphical.robot.Robot;

public class HelloWorld {
	public static void main(String[] args) {
	   
	Robot yodahe=new Robot();
	yodahe.setSpeed(10);
	yodahe.penDown();
	
	for (int i = 0; i < 10; i++) {
		yodahe.move(100);
	    yodahe.turn(360/10);
	    
	}
	
	}
}
	
	
	