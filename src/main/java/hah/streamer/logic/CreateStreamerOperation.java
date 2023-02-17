package hah.streamer.logic;

import hah.streamer.dto.StreamerDto;
import hah.streamer.service.dao.StreamersDaoAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CreateStreamerOperation {
    private final StreamersDaoAdapter streamersDaoAdapter;

    public StreamerDto process(StreamerDto streamer) {
        return streamersDaoAdapter.addNewStreamer(streamer);
    }
}
