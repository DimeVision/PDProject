package com.dimevision.student.model.mapper;

import com.dimevision.student.model.dto.GroupDTO;
import com.dimevision.student.model.entity.Group;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Dimevision
 * @version 0.1
 */

@Mapper(componentModel = "spring")
public interface GroupMapper {

    GroupDTO toGroupDTO(Group group);

    List<GroupDTO> toGroupDTOs(List<Group> groups);

    Group toGroup(GroupDTO groupDTO);
}
