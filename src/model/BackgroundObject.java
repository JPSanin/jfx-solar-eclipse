package model;

public class BackgroundObject {
	private boolean type;
	private boolean draw;
	
	
	public BackgroundObject(boolean type, boolean draw) {
		this.type = type;
		this.draw = draw;
	}


	public boolean isType() {
		return type;
	}


	public void setType(boolean type) {
		this.type = type;
	}


	public boolean isDraw() {
		return draw;
	}


	public void setDraw(boolean draw) {
		this.draw = draw;
	}
	
}
