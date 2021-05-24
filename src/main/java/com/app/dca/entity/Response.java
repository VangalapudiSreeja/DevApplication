package com.app.dca.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Response {
	
	@Id
	private int respId;
	private String answer;
	private LocalDate respDate;
	private LocalTime respTime;
	private int accuracy;	// Likes on Response increase accuracy
	private Developer dev;
	private Feed feed;
	
	public Response() {
		
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(int respId, String answer, LocalDate respDate, LocalTime respTime, int accuracy, Developer dev,
			Feed feed) {
		super();
		this.respId = respId;
		this.answer = answer;
		this.respDate = respDate;
		this.respTime = respTime;
		this.accuracy = accuracy;
		this.dev = dev;
		this.feed = feed;
	}

	
	
	public int getRespId() {
		return respId;
	}

	public void setRespId(int respId) {
		this.respId = respId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public LocalDate getRespDate() {
		return respDate;
	}

	public void setRespDate(LocalDate respDate) {
		this.respDate = respDate;
	}

	public LocalTime getRespTime() {
		return respTime;
	}

	public void setRespTime(LocalTime respTime) {
		this.respTime = respTime;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public Developer getDev() {
		return dev;
	}

	public void setDev(Developer dev) {
		this.dev = dev;
	}

	public Feed getFeed() {
		return feed;
	}

	public void setFeed(Feed feed) {
		this.feed = feed;
	}
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accuracy;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + ((dev == null) ? 0 : dev.hashCode());
		result = prime * result + ((feed == null) ? 0 : feed.hashCode());
		result = prime * result + ((respDate == null) ? 0 : respDate.hashCode());
		result = prime * result + respId;
		result = prime * result + ((respTime == null) ? 0 : respTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Response other = (Response) obj;
		if (accuracy != other.accuracy)
			return false;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (dev == null) {
			if (other.dev != null)
				return false;
		} else if (!dev.equals(other.dev))
			return false;
		if (feed == null) {
			if (other.feed != null)
				return false;
		} else if (!feed.equals(other.feed))
			return false;
		if (respDate == null) {
			if (other.respDate != null)
				return false;
		} else if (!respDate.equals(other.respDate))
			return false;
		if (respId != other.respId)
			return false;
		if (respTime == null) {
			if (other.respTime != null)
				return false;
		} else if (!respTime.equals(other.respTime))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Response [respId=" + respId + ", answer=" + answer + ", respDate=" + respDate + ", respTime=" + respTime
				+ ", accuracy=" + accuracy + ", dev=" + dev + ", feed=" + feed + "]";
	}
	
	
	
} // end class
