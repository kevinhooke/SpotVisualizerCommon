package kh.radio.spotparser.domain;

public class ReceivedSpotHeader {

	private String date;
	private String time;
	private String rxFrequency;
	
	public ReceivedSpotHeader(String date, String time, String rxFrequency){
		this.date = date;
		this.time = time;
		this.setRxFrequency(rxFrequency);
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getRxFrequency() {
		return rxFrequency;
	}

	public void setRxFrequency(String rxFrequency) {
		this.rxFrequency = rxFrequency;
	}
	
}
