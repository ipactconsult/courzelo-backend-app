package com.courzelo.app.iserviceRest;

import com.courzelo.app.dto.SkillsDTO;

import java.util.List;

public interface IServiceRestSkills {
    public SkillsDTO addskills(SkillsDTO skills);
    public SkillsDTO updateskills(String id, SkillsDTO skilldto);
    public List<SkillsDTO> getallskills();
    public void deleteskills(String id );
}
