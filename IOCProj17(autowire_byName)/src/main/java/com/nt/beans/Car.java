package com.nt.beans;

public class Car {
private Engine engine;

public void setEngine(Engine engine) {
	this.engine = engine;
}


public Engine getEngine() {
	return engine;
}


@Override
public String toString() {
	return "Car [engine=" + engine + "]";
}


}
