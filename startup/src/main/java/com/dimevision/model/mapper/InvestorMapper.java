package com.dimevision.model.mapper;

import com.dimevision.model.dto.InvestorDTO;
import com.dimevision.model.entity.Investor;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Dimevision
 * @version 0.1
 */

@Mapper(componentModel = "spring")
public interface InvestorMapper {

    InvestorDTO toInvestorDTO(Investor investor);

    List<InvestorDTO> toInvestorDTOs(List<Investor> investor);

    Investor toInvestor(InvestorDTO investorDTO);
}
