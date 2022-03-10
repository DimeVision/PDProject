package com.dimevision.model.mapper;

import com.dimevision.model.dto.DevStageDTO;
import com.dimevision.model.entity.DevStage;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Dimevision
 * @version 0.1
 */

@Mapper(componentModel = "spring")
public interface DevStageMapper {

    DevStageDTO toDevStageDTO(DevStage devStage);

    List<DevStageDTO> toDevStageDTO(List<DevStage> devStage);

    DevStage toDevStage(DevStageDTO devStageDTO);
}
