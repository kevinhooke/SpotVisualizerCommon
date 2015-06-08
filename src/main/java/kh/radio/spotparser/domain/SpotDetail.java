package kh.radio.spotparser.domain;

import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class SpotDetail {

	private Date dateLastProcessed;
	private String status; //success, failed
	private String errorMessage;
	private String longitude;
	private String latitude;
	
	public SpotDetail(){
		
	}
	
	public Date getDateLastProcessed() {
		return dateLastProcessed;
	}
	public void setDateLastProcessed(Date dateLastProcessed) {
		this.dateLastProcessed = dateLastProcessed;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	
}
