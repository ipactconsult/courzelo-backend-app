package com.courzelo.courzelo_core.CourzeloCore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class FormationStudentsStatsDto {
	private String studentName ;
	private int nbrComments;
	private int nbrPosts;


}
