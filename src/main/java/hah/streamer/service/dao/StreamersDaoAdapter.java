package hah.streamer.service.dao;

import hah.streamer.dto.Streamer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StreamersDaoAdapter {

    private final StreamersDao dao;

    public List<Streamer> getAllStreamersByAdminId(long id) {
        return dao.getAllStreamersByAdminId(id);
    }
}
