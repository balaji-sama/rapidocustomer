package com.rapido.customer.dto;

public class RiderBookingRequest {

	private int bookingid;
	private double fare;
	private  double distance;
	public RiderBookingRequest(int bookingid, double fare, double distance) {
		super();
		this.bookingid = bookingid;
		this.fare = fare;
		this.distance = distance;
	}
	public RiderBookingRequest() {
		super();
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
}
