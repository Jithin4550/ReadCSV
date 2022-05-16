package com.jspring.myproject.demo;

import com.opencsv.bean.CsvBindByPosition;

public class FlightData {
	
	@CsvBindByPosition(position = 0)
	private String time;
	@CsvBindByPosition(position = 1)
	private String flightNo;
	@CsvBindByPosition(position = 2)
	private String flightDestination;
	@CsvBindByPosition(position = 3)
	private String flightDestinationAirport;
	@CsvBindByPosition(position = 4)
	private String sunday;
	@CsvBindByPosition(position = 5)
	private String monday;
	@CsvBindByPosition(position = 6)
	private String tuesday;
	@CsvBindByPosition(position = 7)
	private String wednesday;
	@CsvBindByPosition(position = 8)
	private String thursday;
	@CsvBindByPosition(position = 9)
	private String friday;
	@CsvBindByPosition(position = 10)
	private String saturday;
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	public String getFlightDestinationAirport() {
		return flightDestinationAirport;
	}
	public void setFlightDestinationAirport(String flightDestinationAirport) {
		this.flightDestinationAirport = flightDestinationAirport;
	}
	public String getSunday() {
		return sunday;
	}
	public void setSunday(String sunday) {
		this.sunday = sunday;
	}
	public String getMonday() {
		return monday;
	}
	public void setMonday(String monday) {
		this.monday = monday;
	}
	public String getTuesday() {
		return tuesday;
	}
	public void setTuesday(String tuesday) {
		this.tuesday = tuesday;
	}
	public String getWednesday() {
		return wednesday;
	}
	public void setWednesday(String wednesday) {
		this.wednesday = wednesday;
	}
	public String getThursday() {
		return thursday;
	}
	public void setThursday(String thursday) {
		this.thursday = thursday;
	}
	public String getFriday() {
		return friday;
	}
	public void setFriday(String friday) {
		this.friday = friday;
	}
	public String getSaturday() {
		return saturday;
	}
	public void setSaturday(String saturday) {
		this.saturday = saturday;
	}

	@Override
	public String toString() {
		return "FlightDataVO [time=" + time + ", flightNo=" + flightNo + ", flightDestination=" + flightDestination
				+ ", flightDestinationAirport=" + flightDestinationAirport + ", sunday=" + sunday + ", monday=" + monday
				+ ", tuesday=" + tuesday + ", wednesday=" + wednesday + ", thursday=" + thursday + ", friday=" + friday
				+ ", saturday=" + saturday + "]";
	}

}
