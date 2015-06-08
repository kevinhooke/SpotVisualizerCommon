package kh.radio.spotparser.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlTransient;

@Entity
public class Spot implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Type used with Hibernate OGM Entity mapping
	//@Type(type = "objectid")
	private String id;
	private Date spotReceivedTimestamp;
	private String rxFrequency;
	private String time;
	private String signalreport;
	private String timeDeviation;
	private String frequencyOffset;
	private String word1;
	private String word2;
	private String word3;
	private String spotter;
	
	/**
	 * Post-processing detail of the received Spot. This is used internally, and
	 * marked as @XmlTransient as it is not exposed to the webservice client api.
	 */
	@Embedded
	private SpotDetail spotDetail;
	
	public Spot(){
		
	}
	
	public Spot(Date spotReceivedTimestamp, String rxFrequency, String time, String signalreport, String timeDeviation,
			String frequencyOffset, String word1, String word2, String word3) {
		this.spotReceivedTimestamp = spotReceivedTimestamp;
		this.rxFrequency = rxFrequency;
		this.time = time;
		this.signalreport = signalreport;
		this.timeDeviation = timeDeviation;
		this.frequencyOffset = frequencyOffset;
		this.word1 = word1;
		this.word2 = word2;
		this.word3 = word3;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSignalreport() {
		return signalreport;
	}

	public void setSignalreport(String signalreport) {
		this.signalreport = signalreport;
	}

	public String getTimeDeviation() {
		return timeDeviation;
	}

	public void setTimeDeviation(String timeDeviation) {
		this.timeDeviation = timeDeviation;
	}

	public String getFrequencyOffset() {
		return frequencyOffset;
	}

	public void setFrequencyOffset(String frequencyOffset) {
		this.frequencyOffset = frequencyOffset;
	}

	public String getWord1() {
		return word1;
	}

	public void setWord1(String word1) {
		this.word1 = word1;
	}

	public String getWord2() {
		return word2;
	}

	public void setWord2(String word2) {
		this.word2 = word2;
	}

	public String getWord3() {
		return word3;
	}

	public void setWord3(String word3) {
		this.word3 = word3;
	}

	@XmlTransient
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSpotter() {
		return spotter;
	}

	public void setSpotter(String spotter) {
		this.spotter = spotter;
	}

	public Date getSpotReceivedTimestamp() {
		return spotReceivedTimestamp;
	}

	public void setSpotReceivedTimestamp(Date spotReceivedTimestamp) {
		this.spotReceivedTimestamp = spotReceivedTimestamp;
	}

	public String getRxFrequency() {
		return rxFrequency;
	}

	public void setRxFrequency(String rxFrequency) {
		this.rxFrequency = rxFrequency;
	}

	@XmlTransient
	public SpotDetail getSpotDetail() {
		return spotDetail;
	}

	public void setSpotDetail(SpotDetail spotDetail) {
		this.spotDetail = spotDetail;
	}

	
	
}
