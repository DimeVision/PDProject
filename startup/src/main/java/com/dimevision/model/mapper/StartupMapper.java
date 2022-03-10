package com.dimevision.model.mapper;

import com.dimevision.model.dto.StartupDTO;
import com.dimevision.model.entity.Startup;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Dimevision
 * @version 0.1
 */

@Mapper(componentModel = "spring")
public interface StartupMapper {

    StartupDTO toStartupDTO(Startup startup);

    List<StartupDTO> toStartupDTOs(List<Startup> startups);

    Startup toStartup(StartupDTO startupDTO);
}
