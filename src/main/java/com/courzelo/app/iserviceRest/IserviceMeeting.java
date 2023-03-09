package com.courzelo.app.iserviceRest;

import java.util.List;

import com.courzelo.app.dto.*;
import com.courzelo.app.entity.*;
import com.courzelo.app.dto.MeetingDTO;
import com.courzelo.app.entity.Meeting;


public interface IserviceMeeting {
	public Meeting addMeeting(Meeting m);
	
	public List<MeetingDTO> getMeetingsByFormation(long idFormation);
	
	public List<MeetingDTO> getMeetingsByUser(long idUser);

}
