package hah.streamer.logic;

import hah.streamer.dto.StreamerDto;
import hah.streamer.service.dao.StreamersDaoAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllStreamersOperation {

    private final StreamersDaoAdapter streamersDaoAdapter;

    public List<StreamerDto> getAllStreamersByAdminId(long id) {
        return streamersDaoAdapter.getAllStreamersByAdminId(id);
    }
}