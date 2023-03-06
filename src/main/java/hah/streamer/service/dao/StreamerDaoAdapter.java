package hah.streamer.service.dao;

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

    public List<StreamerEntity> getAllStreamersByAdminCode(String adminCode) {
        return dao.getAllStreamersByAdminCode(adminCode);
    }
    public StreamerEntity addNewStreamer(StreamerDto streamer) {
        var streamerEntity = mapEntityToDto(streamer);
        return dao.save(streamerEntity);
    }

    private StreamerEntity mapEntityToDto(StreamerDto dto) {
        return new StreamerEntity()
                .setCode(dto.getCode())
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
