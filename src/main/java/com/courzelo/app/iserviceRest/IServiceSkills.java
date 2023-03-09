package com.courzelo.app.iserviceRest;

import com.courzelo.app.dto.MacroskillsDTO;
import com.courzelo.app.dto.MicroskillsDTO;
import com.courzelo.app.dto.SkillsDTO;
import com.courzelo.app.entity.Microskills;
import com.courzelo.app.entity.Type;

import java.util.List;

public interface IServiceSkills {

    public SkillsDTO getskillbyid(String id);
    public List<MacroskillsDTO> getmacroskills(String id, Type type);
    public List<MicroskillsDTO> getmicroskills(String iduser, String name, Type type);
    public List<List<Microskills>> getallmicroskills(String iduser, Type type);
}
