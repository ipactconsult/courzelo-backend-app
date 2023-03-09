package com.courzelo.app.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.courzelo.app.dto.ChatDTO;
import com.courzelo.app.entity.Chat;
import com.courzelo.app.repository.ChatRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.courzelo.app.dto.*;
import com.courzelo.app.entity.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/chat")
public class ChatController {
	
	@Autowired
    ChatRepository chatrepository;
	
	@Autowired
    private ModelMapper mapper;
	
	@PostMapping
    public ChatDTO ajouterCategorie (@RequestBody ChatDTO chatDTO){
		Chat chat = mapper.map(chatDTO, Chat.class);
		Chat chatSaved =  chatrepository.save(chat);
        return mapper.map(chatSaved, ChatDTO.class);
        }
	
	@GetMapping
    public List<ChatDTO> afficherChat(){
       List<Chat> chatList = chatrepository.findAll();
       return chatList.stream().map(
    		   elem -> mapper.map(elem, ChatDTO.class)
    		   ).collect(Collectors.toList());
    }

}
