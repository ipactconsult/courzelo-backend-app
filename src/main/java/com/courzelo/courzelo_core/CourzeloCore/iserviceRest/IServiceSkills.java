package com.courzelo.courzelo_core.CourzeloCore.iserviceRest;

import com.courzelo.courzelo_core.CourzeloCore.dto.MacroskillsDTO;
import com.courzelo.courzelo_core.CourzeloCore.dto.MicroskillsDTO;
import com.courzelo.courzelo_core.CourzeloCore.dto.SkillsDTO;
import com.courzelo.courzelo_core.CourzeloCore.entity.Microskills;
import com.courzelo.courzelo_core.CourzeloCore.entity.Type;

import java.util.List;

public interface IServiceSkills {

    public SkillsDTO getskillbyid(String id);
    public List<MacroskillsDTO> getmacroskills(String id, Type type);
    public List<MicroskillsDTO> getmicroskills(String iduser, String name, Type type);
    public List<List<Microskills>> getallmicroskills(String iduser, Type type);
}
