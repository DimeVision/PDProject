package com.dimevision.model.mapper;

import com.dimevision.model.dto.TeamDTO;
import com.dimevision.model.entity.Team;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Dimevision
 * @version 0.1
 */

@Mapper(componentModel = "spring")
public interface TeamMapper {

    TeamDTO toTeamDTO(Team team);

    List<TeamDTO> toTeamDTOs(List<Team> teams);

    Team toTeam(TeamDTO teamDTO);
}
