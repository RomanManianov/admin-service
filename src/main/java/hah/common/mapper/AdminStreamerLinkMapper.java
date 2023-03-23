package hah.common.mapper;

import hah.common.dto.AdminStreamerLinkDto;
import hah.streamer.dto.StreamerDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AdminStreamerLinkMapper {

    public AdminStreamerLinkDto map(StreamerDto streamerDto) {
        return new AdminStreamerLinkDto()
                .setSuperAdminCode(streamerDto.getSuperAdminCode())
                .setAdminCode(streamerDto.getCode())
                .setStreamerCode(streamerDto.getCode())
                .setCreatedAt(LocalDateTime.now())
                .setUpdatedAt(LocalDateTime.now())
                .setActive(true);
    }
}
