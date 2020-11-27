package thread;

import model.Moon;
import ui.SolarEclipseGUI;

public class SolarEclipseThread extends Thread {
	private Moon[] moons;
	private SolarEclipseGUI seGUI;
	
	
	public SolarEclipseThread(Moon[] moons, SolarEclipseGUI seGUI) {
		this.moons = moons;
		this.seGUI = seGUI;
	}
	
	@Override
	public void run() {
		while(moons[0].isMoving()) {
			moons[0].move();
			moons[1].move();
			moons[2].move();
			moons[3].move();
			seGUI.updateGUI();
			System.out.println("Moon:"+moons[0].getX());
			System.out.println("Crater 1:"+moons[1].getX());
			System.out.println("Crater 2:"+moons[2].getX());
			System.out.println("Crater 3:"+moons[3].getX());
			try {
				Thread.sleep(moons[0].getSleep());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}
