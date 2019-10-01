package com.tutorail.main;

import java.awt.Graphics;

public abstract class GameObject {
	
	protected int x ,y;
	protected ID id;
	protected int valX, valY;
	
	public GameObject(int x, int y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public void setX() {
		this.x = x;
	}
	public void setY() {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setid(ID id) {
		this.id = id;
	}
	public ID getId() {
		return id;
	}
	public void setValX(int valX) {
		this.valX = valX;
	}
	public void setValY(int valY) {
		this.valY = valY;
	}
	public int getValX() {
		return valX;
	}
	public int getValY() {
		return valY;
	}

}
