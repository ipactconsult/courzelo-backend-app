package com.courzelo.courzelo_core.CourzeloCore.iserviceRest;

import java.util.List;

import com.courzelo.courzelo_core.CourzeloCore.dto.*;
import com.courzelo.courzelo_core.CourzeloCore.entity.*;



public interface IserviceMeeting {
	public Meeting addMeeting(Meeting m);
	
	public List<MeetingDTO> getMeetingsByFormation(long idFormation);
	
	public List<MeetingDTO> getMeetingsByUser(long idUser);

}
