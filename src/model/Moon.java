package model;

public class Moon {
	
	private double x;
	private Long sleep;
	private int speed;
	private double max;
	private double radius;
	private boolean moving;
	
	public Moon(double x, Long sleep, int speed, double max, double radius, boolean moving) {
		this.x = x;
		this.sleep = sleep;
		this.speed = speed;
		this.max = max;
		this.radius = radius;
		this.moving = moving;
	}
	
	public void move() {
		x =x + speed;
		
		if(x-radius>max) {
			x=-radius;
		}
		
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Long getSleep() {
		return sleep;
	}

	public void setSleep(Long sleep) {
		this.sleep = sleep;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}
	
	
	
	
	
	

}
