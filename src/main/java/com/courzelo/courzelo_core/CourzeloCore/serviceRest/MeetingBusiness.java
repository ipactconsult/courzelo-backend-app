package com.courzelo.courzelo_core.CourzeloCore.serviceRest;


import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courzelo.courzelo_core.CourzeloCore.dto.*;
import com.courzelo.courzelo_core.CourzeloCore.entity.*;
import com.courzelo.courzelo_core.CourzeloCore.iserviceRest.*;
import com.courzelo.courzelo_core.CourzeloCore.repository.*;


@Service
public class MeetingBusiness implements IserviceMeeting {
	@Autowired
	private MeetingRepository meetingRepository;
	   @Autowired
       private ModelMapper mapper;
	   
	@Override
	public Meeting addMeeting(Meeting m) {
		return meetingRepository.save(m);
	}

	@Override
	public List<MeetingDTO> getMeetingsByFormation(long idFormation) {

		
		List<Meeting> meetingList = meetingRepository.findAllByIdFormation(idFormation);
		
		return meetingList.stream().map(elem -> mapper.map(elem, MeetingDTO.class)).collect(Collectors.toList());
		
	}
	
	@Override
	public List<MeetingDTO> getMeetingsByUser(long idUser) {

		
		List<Meeting> meetingList = meetingRepository.findAllByIdInstructor(idUser);
		
		return meetingList.stream().map(elem -> mapper.map(elem, MeetingDTO.class)).collect(Collectors.toList());
		
	}
}
