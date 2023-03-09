package com.courzelo.app.controller;

import com.courzelo.app.dto.SkillsDTO;
import com.courzelo.app.iserviceRest.IServiceRestSkills;
import com.courzelo.app.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping( "/api/skills" )
@RestController
public class SkillsApiREST {


    @Autowired
    private IServiceRestSkills iskillsrest;
    @Autowired
    SkillsRepository skillsrepository;


    @PostMapping("/add_skills")
    public ResponseEntity<SkillsDTO> addskills(@RequestBody SkillsDTO skills) {

        iskillsrest.addskills(skills);
        return new ResponseEntity<>(HttpStatus.CREATED) ;
    }

    @DeleteMapping("/delete_skills/{id}")
    public void deleteskills(@PathVariable("id") String id) {

        iskillsrest.deleteskills(id);

    }

    @PutMapping("/update_skills/{id}")
    public ResponseEntity<SkillsDTO> updateskills(@PathVariable("id") String id,@RequestBody SkillsDTO skillsdto) {

        iskillsrest.updateskills(id,skillsdto);
        return new ResponseEntity<>(HttpStatus.CREATED) ;
    }

    @GetMapping("/get_skills")
    public List<SkillsDTO> showskills() {

        return  iskillsrest.getallskills();

    }



}


