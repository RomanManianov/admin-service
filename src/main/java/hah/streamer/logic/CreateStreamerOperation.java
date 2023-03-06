package hah.streamer.logic;

import hah.streamer.dto.StreamerDto;
import hah.streamer.entity.StreamerEntity;
import hah.streamer.service.dao.StreamerDaoAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CreateStreamerOperation {
    private final StreamerDaoAdapter streamersDaoAdapter;

    public StreamerEntity process(StreamerDto streamer) {
        return streamersDaoAdapter.addNewStreamer(streamer);
    }
}
