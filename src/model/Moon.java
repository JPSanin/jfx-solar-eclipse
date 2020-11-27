package model;

public class Moon {

	private double x;
	private Long sleep;
	private int speed;
	private double max;
	private double radius;
	private boolean moving;
	private double teleportDifference;

	public Moon(double x, Long sleep, double max, double radius, double teleportDifference) {
		this.x = x;
		this.sleep = sleep;
		speed = 5;
		this.max = max;
		this.radius = radius;
		this.teleportDifference = teleportDifference;
		moving = false;
	}

	public void move() {
		x = x + speed;
		if (x - radius - 1 - teleportDifference > max)
			x = -radius;
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