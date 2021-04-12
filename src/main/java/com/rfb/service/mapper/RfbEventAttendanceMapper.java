package com.rfb.service.mapper;

import com.rfb.domain.*;
import com.rfb.service.dto.RfbEventAttendanceDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link RfbEventAttendance} and its DTO {@link RfbEventAttendanceDTO}.
 */
@Mapper(componentModel = "spring", uses = { RfbEventMapper.class, RfbUserMapper.class })
public interface RfbEventAttendanceMapper extends EntityMapper<RfbEventAttendanceDTO, RfbEventAttendance> {
    @Mapping(target = "rfbEvent", source = "rfbEvent")
    @Mapping(target = "rfbUser", source = "rfbUser")
    RfbEventAttendanceDTO toDto(RfbEventAttendance s);
}
