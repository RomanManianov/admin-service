package hah.streamer.service.dao;

import hah.common.dto.AdminStreamerLinkDto;
import hah.common.mapper.AdminStreamerLinkMapper;
import hah.streamer.dto.StreamerDto;
import hah.streamer.entity.StreamerEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StreamerDaoAdapter {

    private final StreamerDao dao;
    private final AdminStreamerLinkMapper adminStreamerLinkMapper;
    private final StreamerJDBC streamerJDBC;

    public List<StreamerEntity> getAllStreamersByAdminCode(String adminCode) {
        return dao.getAllStreamersByAdminCode(adminCode);
    }
    public StreamerEntity addNewStreamer(StreamerDto streamerDto) {
        addAdminStreamerLink(adminStreamerLinkMapper.map(streamerDto));
        return dao.save(mapEntityToDto(streamerDto));
    }

    private void addAdminStreamerLink(AdminStreamerLinkDto linkDto) {
        streamerJDBC.addNewAdminStreamerLink(linkDto);
    }

    private StreamerEntity mapEntityToDto(StreamerDto dto) {
        return new StreamerEntity()
                .setCode(dto.getCode())
                .setSuperAdminCode(dto.getSuperAdminCode())
                .setUsername(dto.getUsername())
                .setName(dto.getName())
                .setRole(dto.getRole())
                .setAge(dto.getAge())
                .setRegDate(dto.getRegDate())
                .setSingleUserPassword(dto.getSingleUserPassword())
                .setAdminCode(dto.getAdminCode())
                .setCreatedAt(LocalDateTime.now())
                //todo: убрать нотналл ограничение из базы
                .setUpdatedAt(LocalDateTime.now())
                .setActive(true);
    }
}
