import lejos.nxt.*;
import lejos.util.Delay;
import lejos.nxt.Motor;
import lejos.robotics.RegulatedMotor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.LCD;
public class touch {

	public static void main(String[] args) throws Exception {
		TouchSensor touch = new TouchSensor(SensorPort.S4);
	while(!touch.isPressed()){ 
		Motor.A.setSpeed(800);
		Motor.A.forward();
		Motor.C.setSpeed(1000);
		Motor.C.forward();
		}
	
		if(touch.isPressed()){
				Motor.A.stop(true);
				Motor.C.stop(true);
				Delay.msDelay(1000);
				Motor.A.backward();
				Motor.C.backward();
				Delay.msDelay(100);
				Motor.A.backward();
				Motor.C.forward();
				Delay.msDelay(1200);
			}
		while(!touch.isPressed()){ 

			Motor.A.forward();
			Motor.C.forward();
			}
		if(touch.isPressed()){
			Motor.A.stop(true);
			Motor.C.stop(true);
			Delay.msDelay(1000);
			Motor.A.backward();
			Motor.C.backward();
			Delay.msDelay(100);
			Motor.A.forward();
			Motor.C.backward();
			Delay.msDelay(1100);
			}
		while(!touch.isPressed()){ 

			Motor.A.forward();
			Motor.C.forward();
			}
		if(touch.isPressed()){
			Motor.A.stop(true);
			Motor.C.stop(true);
			Delay.msDelay(1000);
			Motor.A.backward();
			Motor.C.backward();
			Delay.msDelay(500);
			Motor.C.forward();
			Motor.A.backward();
			Delay.msDelay(785);
			Motor.A.backward();
			Motor.C.backward();
			Delay.msDelay(3000);
			Motor.A.stop(true);
			Motor.C.stop(true);
			Delay.msDelay(1000);
			Motor.A.forward();
			Motor.C.backward();
			Delay.msDelay(590);
			}
		while(!touch.isPressed()){ 

			Motor.A.forward();
			Motor.C.forward();
			}
		if(touch.isPressed()) {
			Motor.A.stop(true);
			Motor.C.stop(true);
		}
		
		
		 while (touch.isPressed())
		 {
			 
		 }
}
	}
	

	

	


