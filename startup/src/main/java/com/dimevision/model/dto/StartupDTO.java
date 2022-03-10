package com.dimevision.model.dto;

import com.dimevision.model.entity.DevStage;
import com.dimevision.model.entity.Investor;
import com.dimevision.model.entity.Team;

/**
 * @author Dimevision
 * @version 0.1
 */

public record StartupDTO(
        String name,
        TeamDTO team,
        DevStageDTO devStageDTO,
        InvestorDTO investorDTO
) {
}
