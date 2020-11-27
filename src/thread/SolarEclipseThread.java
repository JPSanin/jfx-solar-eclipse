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
		while (moons[0].isMoving()) {
			moons[0].move();
			moons[1].move();
			moons[2].move();
			moons[3].move();
			seGUI.updateGUI();
			seGUI.eclipse();
			try {
				Thread.sleep(moons[0].getSleep());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}