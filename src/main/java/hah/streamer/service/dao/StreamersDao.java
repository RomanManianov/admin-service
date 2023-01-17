package hah.streamer.service.dao;

import hah.streamer.dto.Streamer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StreamersDao {

    public List<Streamer> getAllStreamersByAdminId(long id) {
        return new ArrayList<>();
    }
}

