package com.class2507.reference;

public class Address {
	private String City;
	private String Dist;
	private String State;
	private int Pin;
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getDist() {
		return Dist;
	}
	public void setDist(String dist) {
		Dist = dist;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPin() {
		return Pin;
	}
	public void setPin(int pin) {
		Pin = pin;
	}
	@Override
	public String toString() {
		return "Address [City=" + City + ", Dist=" + Dist + ", State=" + State + ", Pin=" + Pin + "]";
	}
	
	
	
}
