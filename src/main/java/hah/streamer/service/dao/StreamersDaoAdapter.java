package hah.streamer.service.dao;

import hah.streamer.dto.StreamerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StreamersDaoAdapter {

    private final StreamersDao dao;

    public List<StreamerDto> getAllStreamersByAdminId(long id) {
        return dao.getAllStreamersByAdminId(id);
    }
    public StreamerDto addNewStreamer(StreamerDto streamer) {
        return dao.save(streamer);
    }
}
