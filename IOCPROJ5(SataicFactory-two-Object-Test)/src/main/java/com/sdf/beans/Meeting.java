package com.sdf.beans;

import java.util.Calendar;
import java.util.List;

public class Meeting {
	private int meetingId;
	private List<String> parcipent;
	private String mettingpurpose;
	private Calendar calendr;
	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}
	public void setParcipent(List<String> parcipent) {
		this.parcipent = parcipent;
	}
	public void setMettingpurpose(String mettingpurpose) {
		this.mettingpurpose = mettingpurpose;
	}
	public void setCalendr(Calendar calendr) {
		this.calendr = calendr;
	}
	@Override
	public String toString() {
		return "Meeting [meetingId=" + meetingId + ", parcipent=" + parcipent + ", mettingpurpose=" + mettingpurpose
				+ ", calendr=" + calendr + "]";
	}
	
	
	
	
	
	

}
